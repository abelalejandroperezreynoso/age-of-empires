import java.util.Vector;

/**
 * Enhanced AI Controller System
 * Controls AI player behavior including building, unit production, and attacking
 */
public class AIController {
    
    // AI behavior states
    public static final int STATE_BUILD_ECONOMY = 0;
    public static final int STATE_BUILD_ARMY = 1;
    public static final int STATE_ATTACK = 2;
    public static final int STATE_DEFEND = 3;
    
    // AI difficulty levels
    public static final int DIFFICULTY_EASY = 0;
    public static final int DIFFICULTY_MEDIUM = 1;
    public static final int DIFFICULTY_HARD = 2;
    
    private int playerId;                    // AI player ID
    private int currentState;                // Current AI state
    private int difficulty;                  // AI difficulty level
    private int villagerTarget;              // Target number of villagers
    private int armyTarget;                  // Target army size
    private int updateTimer;                 // Timer for AI updates
    private int attackTimer;                 // Timer until next attack
    private boolean isAttacking;             // Whether currently attacking
    
    // Thresholds and timers
    private static final int UPDATE_INTERVAL = 60;      // Update AI every 60 ticks (~1 second)
    private static final int ATTACK_INTERVAL_EASY = 3600;    // 60 seconds
    private static final int ATTACK_INTERVAL_MEDIUM = 2400;  // 40 seconds
    private static final int ATTACK_INTERVAL_HARD = 1800;    // 30 seconds
    
    public AIController(int playerId, int difficulty) {
        this.playerId = playerId;
        this.difficulty = difficulty;
        this.currentState = STATE_BUILD_ECONOMY;
        this.updateTimer = 0;
        this.isAttacking = false;
        
        // Set targets based on difficulty
        switch (difficulty) {
            case DIFFICULTY_EASY:
                this.villagerTarget = 10;
                this.armyTarget = 15;
                this.attackTimer = ATTACK_INTERVAL_EASY;
                break;
            case DIFFICULTY_MEDIUM:
                this.villagerTarget = 15;
                this.armyTarget = 25;
                this.attackTimer = ATTACK_INTERVAL_MEDIUM;
                break;
            case DIFFICULTY_HARD:
                this.villagerTarget = 20;
                this.armyTarget = 35;
                this.attackTimer = ATTACK_INTERVAL_HARD;
                break;
            default:
                this.villagerTarget = 10;
                this.armyTarget = 15;
                this.attackTimer = ATTACK_INTERVAL_EASY;
        }
    }
    
    /**
     * Main AI update function - call each game tick
     */
    public void update() {
        updateTimer++;
        if (updateTimer < UPDATE_INTERVAL) {
            return; // Only update AI periodically
        }
        updateTimer = 0;
        
        // Update attack timer
        if (attackTimer > 0) {
            attackTimer--;
        }
        
        // Update AI based on current state
        switch (currentState) {
            case STATE_BUILD_ECONOMY:
                updateBuildEconomy();
                break;
            case STATE_BUILD_ARMY:
                updateBuildArmy();
                break;
            case STATE_ATTACK:
                updateAttack();
                break;
            case STATE_DEFEND:
                updateDefend();
                break;
        }
    }
    
    /**
     * Build economy phase - focus on villagers and buildings
     */
    private void updateBuildEconomy() {
        // Pseudo-code for interfacing with game
        
        // int villagerCount = getUnitCount(VILLAGER);
        // if (villagerCount < villagerTarget) {
        //     if (canTrainVillager()) {
        //         trainVillager();
        //     }
        // }
        
        // Check if need more houses
        // if (isNearPopulationCap()) {
        //     if (canBuildHouse()) {
        //         buildHouse();
        //     }
        // }
        
        // Build barracks if don't have one
        // if (!hasBarracks()) {
        //     if (canBuildBarracks()) {
        //         buildBarracks();
        //     }
        // }
        
        // Transition to army building when economy is established
        // if (villagerCount >= villagerTarget && hasBarracks()) {
        //     currentState = STATE_BUILD_ARMY;
        // }
    }
    
    /**
     * Build army phase - train military units
     */
    private void updateBuildArmy() {
        // Pseudo-code for interfacing with game
        
        // Continue villager production at reduced rate
        // int villagerCount = getUnitCount(VILLAGER);
        // if (villagerCount < villagerTarget) {
        //     if (canTrainVillager()) {
        //         trainVillager();
        //     }
        // }
        
        // Train military units
        // int armySize = getArmySize();
        // if (armySize < armyTarget) {
        //     // Choose unit type based on strategy
        //     int unitType = chooseUnitType();
        //     if (canTrainUnit(unitType)) {
        //         trainUnit(unitType);
        //     }
        // }
        
        // Check if ready to attack
        // if (armySize >= armyTarget * 0.7 && attackTimer <= 0) {
        //     currentState = STATE_ATTACK;
        // }
    }
    
    /**
     * Attack phase - send units to attack enemy
     */
    private void updateAttack() {
        if (!isAttacking) {
            // Start attack
            // Vector attackForce = gatherAttackForce();
            // if (attackForce.size() >= armyTarget / 2) {
            //     sendAttack(attackForce);
            //     isAttacking = true;
            // }
        } else {
            // Check if attack is complete
            // if (isAttackComplete()) {
            //     isAttacking = false;
            //     resetAttackTimer();
            //     currentState = STATE_BUILD_ARMY; // Rebuild forces
            // }
        }
    }
    
    /**
     * Defend phase - respond to enemy attacks
     */
    private void updateDefend() {
        // Pseudo-code for defense behavior
        
        // Check if under attack
        // if (!isUnderAttack()) {
        //     currentState = STATE_BUILD_ARMY; // Return to normal
        //     return;
        // }
        
        // Gather defensive units
        // Vector defenders = gatherNearbyUnits();
        // if (defenders.size() > 0) {
        //     defendBase(defenders);
        // }
    }
    
    /**
     * Choose which unit type to train based on AI strategy
     * @return Unit type ID
     */
    private int chooseUnitType() {
        // Mix of unit types based on difficulty
        int random = (int)(Math.random() * 100);
        
        if (difficulty == DIFFICULTY_EASY) {
            // Easy AI: mostly infantry
            if (random < 70) return UnitStats.INFANTRY;
            if (random < 90) return UnitStats.ARCHER;
            return UnitStats.CAVALRY;
        } else if (difficulty == DIFFICULTY_MEDIUM) {
            // Medium AI: balanced mix
            if (random < 40) return UnitStats.INFANTRY;
            if (random < 70) return UnitStats.ARCHER;
            if (random < 95) return UnitStats.CAVALRY;
            return UnitStats.SIEGE;
        } else {
            // Hard AI: optimal composition
            if (random < 30) return UnitStats.INFANTRY;
            if (random < 60) return UnitStats.ARCHER;
            if (random < 85) return UnitStats.CAVALRY;
            return UnitStats.SIEGE;
        }
    }
    
    /**
     * Reset attack timer based on difficulty
     */
    private void resetAttackTimer() {
        switch (difficulty) {
            case DIFFICULTY_EASY:
                attackTimer = ATTACK_INTERVAL_EASY;
                break;
            case DIFFICULTY_MEDIUM:
                attackTimer = ATTACK_INTERVAL_MEDIUM;
                break;
            case DIFFICULTY_HARD:
                attackTimer = ATTACK_INTERVAL_HARD;
                break;
        }
    }
    
    /**
     * Get current AI state
     * @return State constant
     */
    public int getCurrentState() {
        return currentState;
    }
    
    /**
     * Set AI state
     * @param state New state
     */
    public void setState(int state) {
        this.currentState = state;
    }
    
    /**
     * Get AI difficulty
     * @return Difficulty level
     */
    public int getDifficulty() {
        return difficulty;
    }
    
    /**
     * Check if AI is currently attacking
     * @return true if attacking
     */
    public boolean isAttacking() {
        return isAttacking;
    }
    
    /**
     * Force AI into defend mode
     */
    public void triggerDefend() {
        currentState = STATE_DEFEND;
    }
    
    /**
     * Get villager target count
     * @return Target villager count
     */
    public int getVillagerTarget() {
        return villagerTarget;
    }
    
    /**
     * Get army target size
     * @return Target army size
     */
    public int getArmyTarget() {
        return armyTarget;
    }
}
