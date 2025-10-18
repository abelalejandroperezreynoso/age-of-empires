/**
 * Unit Statistics Definition System
 * Defines stats for different unit types including infantry, archers, cavalry, and siege units
 */
public class UnitStats {
    
    // Unit type IDs
    public static final int VILLAGER = 0;
    public static final int INFANTRY = 1;
    public static final int ARCHER = 2;
    public static final int CAVALRY = 3;
    public static final int SIEGE = 4;
    
    /**
     * Class to hold stats for a single unit type
     */
    public static class Stats {
        public int health;              // Hit points
        public int damage;              // Attack damage
        public int armor;               // Armor/defense rating
        public int range;               // Attack range (in tiles)
        public int moveSpeed;           // Movement speed
        public int attackSpeed;         // Attack cooldown (in ticks)
        public int cost;                // Resource cost
        public int productionTime;      // Time to produce (in ticks)
        public int populationCost;      // Population used
        public String name;             // Display name
        
        public Stats(int health, int damage, int armor, int range, int moveSpeed, 
                     int attackSpeed, int cost, int productionTime, int populationCost, String name) {
            this.health = health;
            this.damage = damage;
            this.armor = armor;
            this.range = range;
            this.moveSpeed = moveSpeed;
            this.attackSpeed = attackSpeed;
            this.cost = cost;
            this.productionTime = productionTime;
            this.populationCost = populationCost;
            this.name = name;
        }
    }
    
    // Unit stats array indexed by unit type
    private static Stats[] unitStats;
    
    /**
     * Initialize unit statistics
     */
    public static void initialize() {
        unitStats = new Stats[5];
        
        // Villager - weak combat unit, primarily for resource gathering
        unitStats[VILLAGER] = new Stats(
            25,      // health
            3,       // damage
            0,       // armor
            1,       // range (melee)
            2,       // moveSpeed
            40,      // attackSpeed (slower)
            50,      // cost
            150,     // productionTime
            1,       // populationCost
            "Villager"
        );
        
        // Infantry - basic melee unit, good vs siege
        unitStats[INFANTRY] = new Stats(
            50,      // health
            8,       // damage
            2,       // armor
            1,       // range (melee)
            2,       // moveSpeed
            25,      // attackSpeed
            50,      // cost
            180,     // productionTime
            1,       // populationCost
            "Infantry"
        );
        
        // Archer - ranged unit, vulnerable in melee
        unitStats[ARCHER] = new Stats(
            35,      // health
            6,       // damage
            0,       // armor
            6,       // range (ranged)
            2,       // moveSpeed
            30,      // attackSpeed
            60,      // cost
            210,     // productionTime
            1,       // populationCost
            "Archer"
        );
        
        // Cavalry - fast melee unit, bonus vs infantry
        unitStats[CAVALRY] = new Stats(
            80,      // health
            10,      // damage
            2,       // armor
            1,       // range (melee)
            4,       // moveSpeed (fast)
            20,      // attackSpeed
            100,     // cost (expensive)
            300,     // productionTime
            2,       // populationCost
            "Cavalry"
        );
        
        // Siege - long range, high damage vs buildings, slow
        unitStats[SIEGE] = new Stats(
            40,      // health
            50,      // damage (high vs buildings)
            1,       // armor
            8,       // range (very long)
            1,       // moveSpeed (slow)
            80,      // attackSpeed (very slow)
            150,     // cost (very expensive)
            450,     // productionTime
            3,       // populationCost
            "Siege"
        );
    }
    
    /**
     * Get stats for a unit type
     * @param unitType Type of unit
     * @return Stats object for that unit type
     */
    public static Stats getStats(int unitType) {
        if (unitStats == null) {
            initialize();
        }
        if (unitType >= 0 && unitType < unitStats.length) {
            return unitStats[unitType];
        }
        return unitStats[INFANTRY]; // Default to infantry if invalid
    }
    
    /**
     * Get health for a unit type
     * @param unitType Type of unit
     * @return Health value
     */
    public static int getHealth(int unitType) {
        return getStats(unitType).health;
    }
    
    /**
     * Get damage for a unit type
     * @param unitType Type of unit
     * @return Damage value
     */
    public static int getDamage(int unitType) {
        return getStats(unitType).damage;
    }
    
    /**
     * Get armor for a unit type
     * @param unitType Type of unit
     * @return Armor value
     */
    public static int getArmor(int unitType) {
        return getStats(unitType).armor;
    }
    
    /**
     * Get range for a unit type
     * @param unitType Type of unit
     * @return Range value
     */
    public static int getRange(int unitType) {
        return getStats(unitType).range;
    }
    
    /**
     * Get movement speed for a unit type
     * @param unitType Type of unit
     * @return Movement speed value
     */
    public static int getMoveSpeed(int unitType) {
        return getStats(unitType).moveSpeed;
    }
    
    /**
     * Get attack speed for a unit type
     * @param unitType Type of unit
     * @return Attack speed (cooldown in ticks)
     */
    public static int getAttackSpeed(int unitType) {
        return getStats(unitType).attackSpeed;
    }
    
    /**
     * Get cost for a unit type
     * @param unitType Type of unit
     * @return Resource cost
     */
    public static int getCost(int unitType) {
        return getStats(unitType).cost;
    }
    
    /**
     * Get production time for a unit type
     * @param unitType Type of unit
     * @return Production time in ticks
     */
    public static int getProductionTime(int unitType) {
        return getStats(unitType).productionTime;
    }
    
    /**
     * Get population cost for a unit type
     * @param unitType Type of unit
     * @return Population slots used
     */
    public static int getPopulationCost(int unitType) {
        return getStats(unitType).populationCost;
    }
    
    /**
     * Get name for a unit type
     * @param unitType Type of unit
     * @return Unit name
     */
    public static String getName(int unitType) {
        return getStats(unitType).name;
    }
    
    /**
     * Check if unit is ranged
     * @param unitType Type of unit
     * @return true if unit has range > 1
     */
    public static boolean isRanged(int unitType) {
        return getRange(unitType) > 1;
    }
}
