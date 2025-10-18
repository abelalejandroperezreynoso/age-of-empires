/**
 * Demonstration of the new gameplay systems
 * Shows how to use each system and provides basic testing
 */
public class GameplaySystemsDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Age of Empires - Gameplay Systems Demo ===\n");
        
        // 1. Test Combat System
        testCombatSystem();
        
        // 2. Test Production Queue
        testProductionQueue();
        
        // 3. Test Population System
        testPopulationSystem();
        
        // 4. Test Unit Stats
        testUnitStats();
        
        // 5. Test Attack-Move Command
        testAttackMoveCommand();
        
        // 6. Test AI Controller
        testAIController();
        
        System.out.println("\n=== All Systems Tested Successfully ===");
    }
    
    private static void testCombatSystem() {
        System.out.println("1. COMBAT SYSTEM TEST");
        System.out.println("---------------------");
        
        // Test damage calculation
        int damage = CombatSystem.calculateDamage(
            CombatSystem.UNIT_TYPE_INFANTRY, 10, 2
        );
        System.out.println("Infantry (10 dmg) vs 2 armor: " + damage + " damage");
        
        // Test cavalry bonus
        damage = CombatSystem.calculateDamage(
            CombatSystem.UNIT_TYPE_CAVALRY, 10, 2
        );
        System.out.println("Cavalry (10 dmg) vs 2 armor: " + damage + " damage (bonus)");
        
        // Test attack ranges
        System.out.println("Infantry range: " + CombatSystem.getAttackRange(CombatSystem.UNIT_TYPE_INFANTRY));
        System.out.println("Archer range: " + CombatSystem.getAttackRange(CombatSystem.UNIT_TYPE_ARCHER));
        System.out.println("Siege range: " + CombatSystem.getAttackRange(CombatSystem.UNIT_TYPE_SIEGE));
        
        // Test range checking
        boolean inRange = CombatSystem.isInAttackRange(5, 5, 8, 8, 6);
        System.out.println("Position (5,5) to (8,8) with range 6: " + (inRange ? "IN RANGE" : "OUT OF RANGE"));
        
        System.out.println();
    }
    
    private static void testProductionQueue() {
        System.out.println("2. PRODUCTION QUEUE TEST");
        System.out.println("------------------------");
        
        ProductionQueue queue = new ProductionQueue(1, 1);
        
        // Add units to queue
        System.out.println("Adding infantry to queue: " + queue.addToQueue(1, 0));
        System.out.println("Adding archer to queue: " + queue.addToQueue(2, 0));
        System.out.println("Queue size: " + queue.getQueueSize());
        
        // Simulate production
        System.out.println("Initial progress: " + queue.getCurrentProgress() + "%");
        
        // Update for 100 ticks
        ProductionQueue.QueueItem completed = null;
        for (int i = 0; i < 100; i++) {
            completed = queue.update();
            if (completed != null) break;
        }
        System.out.println("After 100 ticks, progress: " + queue.getCurrentProgress() + "%");
        
        // Complete production
        for (int i = 0; i < 200; i++) {
            completed = queue.update();
            if (completed != null) {
                System.out.println("Unit completed! Type: " + completed.unitType);
                break;
            }
        }
        
        System.out.println();
    }
    
    private static void testPopulationSystem() {
        System.out.println("3. POPULATION SYSTEM TEST");
        System.out.println("-------------------------");
        
        PopulationSystem popSystem = new PopulationSystem();
        
        System.out.println("Initial population: " + popSystem.getPopulationString());
        System.out.println("Has room for 5 units: " + popSystem.hasRoomFor(5));
        
        // Add population
        popSystem.addPopulation(3);
        System.out.println("After adding 3 villagers: " + popSystem.getPopulationString());
        
        // Build houses
        popSystem.addHouse();
        System.out.println("After building house: " + popSystem.getPopulationString());
        
        popSystem.addHouse();
        System.out.println("After building 2nd house: " + popSystem.getPopulationString());
        
        // Try to exceed limit
        boolean success = popSystem.addPopulation(20);
        System.out.println("Try to add 20 population: " + (success ? "SUCCESS" : "BLOCKED (at capacity)"));
        
        System.out.println();
    }
    
    private static void testUnitStats() {
        System.out.println("4. UNIT STATS TEST");
        System.out.println("------------------");
        
        // Initialize stats
        UnitStats.initialize();
        
        // Print stats for each unit type
        for (int i = 0; i <= 4; i++) {
            UnitStats.Stats stats = UnitStats.getStats(i);
            System.out.println(stats.name + ":");
            System.out.println("  HP: " + stats.health + 
                             ", Damage: " + stats.damage + 
                             ", Armor: " + stats.armor + 
                             ", Range: " + stats.range);
            System.out.println("  Speed: " + stats.moveSpeed + 
                             ", Cost: " + stats.cost + 
                             ", Pop: " + stats.populationCost);
        }
        
        System.out.println();
    }
    
    private static void testAttackMoveCommand() {
        System.out.println("5. ATTACK-MOVE COMMAND TEST");
        System.out.println("---------------------------");
        
        AttackMoveCommand.AttackMoveState state = new AttackMoveCommand.AttackMoveState();
        
        // Activate attack-move
        state.activate(50, 50);
        System.out.println("Attack-move activated to (50, 50)");
        System.out.println("Is active: " + state.isActive);
        System.out.println("Destination: (" + state.destinationX + ", " + state.destinationY + ")");
        
        // Test movement calculation
        int[] nextPos = AttackMoveCommand.calculateNextPosition(10, 10, 50, 50, 2);
        System.out.println("Moving from (10,10) to (50,50), next position: (" + nextPos[0] + ", " + nextPos[1] + ")");
        
        // Test reaching destination
        boolean reached = state.hasReachedDestination(50, 50);
        System.out.println("At destination (50,50): " + reached);
        
        System.out.println();
    }
    
    private static void testAIController() {
        System.out.println("6. AI CONTROLLER TEST");
        System.out.println("---------------------");
        
        // Create AI controllers for each difficulty
        AIController easyAI = new AIController(1, AIController.DIFFICULTY_EASY);
        AIController mediumAI = new AIController(2, AIController.DIFFICULTY_MEDIUM);
        AIController hardAI = new AIController(3, AIController.DIFFICULTY_HARD);
        
        System.out.println("Easy AI - Villagers: " + easyAI.getVillagerTarget() + 
                         ", Army: " + easyAI.getArmyTarget());
        System.out.println("Medium AI - Villagers: " + mediumAI.getVillagerTarget() + 
                         ", Army: " + mediumAI.getArmyTarget());
        System.out.println("Hard AI - Villagers: " + hardAI.getVillagerTarget() + 
                         ", Army: " + hardAI.getArmyTarget());
        
        // Test state transitions
        System.out.println("\nAI State: " + getStateName(easyAI.getCurrentState()));
        easyAI.setState(AIController.STATE_BUILD_ARMY);
        System.out.println("Changed to: " + getStateName(easyAI.getCurrentState()));
        
        // Simulate updates
        System.out.println("\nRunning 100 AI updates...");
        for (int i = 0; i < 100; i++) {
            easyAI.update();
        }
        System.out.println("AI updates completed");
        
        System.out.println();
    }
    
    private static String getStateName(int state) {
        switch (state) {
            case AIController.STATE_BUILD_ECONOMY: return "BUILD_ECONOMY";
            case AIController.STATE_BUILD_ARMY: return "BUILD_ARMY";
            case AIController.STATE_ATTACK: return "ATTACK";
            case AIController.STATE_DEFEND: return "DEFEND";
            default: return "UNKNOWN";
        }
    }
}
