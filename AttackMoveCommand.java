/**
 * Attack-Move Command System
 * Units automatically engage enemies while moving to a destination
 */
public class AttackMoveCommand {
    
    /**
     * Represents an attack-move command state for a unit
     */
    public static class AttackMoveState {
        public boolean isActive;           // Whether attack-move is active
        public int destinationX;           // Final destination X (in tiles)
        public int destinationY;           // Final destination Y (in tiles)
        public int currentTargetX;         // Current waypoint X
        public int currentTargetY;         // Current waypoint Y
        public int engagedEnemyId;        // ID of enemy currently engaged (-1 if none)
        public int searchRadius;           // Radius to search for enemies (in tiles)
        
        public AttackMoveState() {
            this.isActive = false;
            this.destinationX = -1;
            this.destinationY = -1;
            this.currentTargetX = -1;
            this.currentTargetY = -1;
            this.engagedEnemyId = -1;
            this.searchRadius = 10; // Default search radius
        }
        
        /**
         * Activate attack-move to a destination
         * @param destX Destination X coordinate
         * @param destY Destination Y coordinate
         */
        public void activate(int destX, int destY) {
            this.isActive = true;
            this.destinationX = destX;
            this.destinationY = destY;
            this.currentTargetX = destX;
            this.currentTargetY = destY;
            this.engagedEnemyId = -1;
        }
        
        /**
         * Deactivate attack-move command
         */
        public void deactivate() {
            this.isActive = false;
            this.engagedEnemyId = -1;
        }
        
        /**
         * Check if unit has reached destination
         * @param unitX Current unit X position
         * @param unitY Current unit Y position
         * @return true if at destination
         */
        public boolean hasReachedDestination(int unitX, int unitY) {
            return unitX == destinationX && unitY == destinationY;
        }
        
        /**
         * Set currently engaged enemy
         * @param enemyId ID of enemy being engaged
         */
        public void setEngagedEnemy(int enemyId) {
            this.engagedEnemyId = enemyId;
        }
        
        /**
         * Clear engaged enemy
         */
        public void clearEngagedEnemy() {
            this.engagedEnemyId = -1;
        }
        
        /**
         * Check if unit is engaged with an enemy
         * @return true if engaged
         */
        public boolean isEngaged() {
            return engagedEnemyId != -1;
        }
    }
    
    /**
     * Process attack-move behavior for a unit
     * This should be called each game tick for units with active attack-move
     * 
     * @param state Attack-move state for the unit
     * @param unitX Current unit X position
     * @param unitY Current unit Y position
     * @param unitType Type of unit
     * @param unitPlayer Player who owns the unit
     * @param allUnits Array of all units in the game
     * @return Action code: 0=continue moving, 1=engage enemy, 2=reached destination
     */
    public static int processAttackMove(AttackMoveState state, int unitX, int unitY, 
                                        int unitType, int unitPlayer, Object[] allUnits) {
        if (!state.isActive) {
            return 0; // Not in attack-move mode
        }
        
        // Check if reached destination
        if (state.hasReachedDestination(unitX, unitY)) {
            state.deactivate();
            return 2; // Reached destination
        }
        
        // If not engaged, search for enemies in range
        if (!state.isEngaged()) {
            int enemyId = searchForNearbyEnemy(unitX, unitY, unitPlayer, state.searchRadius, allUnits);
            if (enemyId != -1) {
                state.setEngagedEnemy(enemyId);
                return 1; // Found enemy to engage
            }
        } else {
            // Check if engaged enemy is still valid target
            if (!isEnemyValid(state.engagedEnemyId, unitX, unitY, state.searchRadius, allUnits)) {
                state.clearEngagedEnemy();
                // Continue moving toward destination
            } else {
                return 1; // Continue engaging current enemy
            }
        }
        
        return 0; // Continue moving
    }
    
    /**
     * Search for nearby enemy units
     * @param unitX Unit X position
     * @param unitY Unit Y position
     * @param unitPlayer Player who owns the unit
     * @param searchRadius Search radius in tiles
     * @param allUnits Array of all units
     * @return ID of nearest enemy, or -1 if none found
     */
    private static int searchForNearbyEnemy(int unitX, int unitY, int unitPlayer, 
                                           int searchRadius, Object[] allUnits) {
        int nearestEnemyId = -1;
        int nearestDistSquared = Integer.MAX_VALUE;
        
        if (allUnits == null) return -1;
        
        for (int i = 0; i < allUnits.length; i++) {
            if (allUnits[i] == null) continue;
            
            // This would need to interface with the actual unit class (d)
            // Pseudo-code structure:
            
            // int enemyPlayer = getUnitPlayer(allUnits[i]);
            // if (enemyPlayer == unitPlayer || enemyPlayer == -1) continue;
            
            // int enemyX = getUnitX(allUnits[i]);
            // int enemyY = getUnitY(allUnits[i]);
            
            // int dx = enemyX - unitX;
            // int dy = enemyY - unitY;
            // int distSquared = dx * dx + dy * dy;
            
            // if (distSquared <= searchRadius * searchRadius && distSquared < nearestDistSquared) {
            //     nearestDistSquared = distSquared;
            //     nearestEnemyId = i;
            // }
        }
        
        return nearestEnemyId;
    }
    
    /**
     * Check if engaged enemy is still a valid target
     * @param enemyId ID of enemy
     * @param unitX Unit X position
     * @param unitY Unit Y position
     * @param maxRange Maximum engagement range
     * @param allUnits Array of all units
     * @return true if enemy is still valid target
     */
    private static boolean isEnemyValid(int enemyId, int unitX, int unitY, 
                                       int maxRange, Object[] allUnits) {
        if (allUnits == null || enemyId < 0 || enemyId >= allUnits.length) {
            return false;
        }
        
        if (allUnits[enemyId] == null) {
            return false; // Enemy no longer exists
        }
        
        // This would check:
        // 1. Enemy is still alive
        // 2. Enemy is still within range
        // 3. Enemy is still an enemy (player didn't change alliance)
        
        // Pseudo-code:
        // int enemyX = getUnitX(allUnits[enemyId]);
        // int enemyY = getUnitY(allUnits[enemyId]);
        // int dx = enemyX - unitX;
        // int dy = enemyY - unitY;
        // int distSquared = dx * dx + dy * dy;
        // 
        // return distSquared <= maxRange * maxRange;
        
        return true; // Placeholder
    }
    
    /**
     * Calculate next movement position toward destination
     * @param currentX Current X position
     * @param currentY Current Y position
     * @param targetX Target X position
     * @param targetY Target Y position
     * @param moveSpeed Movement speed (tiles per tick)
     * @return Array with [nextX, nextY]
     */
    public static int[] calculateNextPosition(int currentX, int currentY, 
                                             int targetX, int targetY, int moveSpeed) {
        int dx = targetX - currentX;
        int dy = targetY - currentY;
        
        // If already at target
        if (dx == 0 && dy == 0) {
            return new int[]{currentX, currentY};
        }
        
        // Calculate direction vector
        double distance = Math.sqrt(dx * dx + dy * dy);
        double dirX = dx / distance;
        double dirY = dy / distance;
        
        // Calculate next position
        int nextX = currentX + (int)(dirX * moveSpeed);
        int nextY = currentY + (int)(dirY * moveSpeed);
        
        // Don't overshoot target
        if (Math.abs(nextX - currentX) > Math.abs(dx)) {
            nextX = targetX;
        }
        if (Math.abs(nextY - currentY) > Math.abs(dy)) {
            nextY = targetY;
        }
        
        return new int[]{nextX, nextY};
    }
}
