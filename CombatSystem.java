/**
 * Combat System for Age of Empires
 * Handles attack ranges, damage calculation, projectiles, and auto-targeting
 */
public class CombatSystem {
    
    // Attack range constants (in tiles)
    public static final int MELEE_RANGE = 1;
    public static final int ARCHER_RANGE = 6;
    public static final int CAVALRY_RANGE = 1;
    public static final int SIEGE_RANGE = 8;
    
    // Unit type constants
    public static final int UNIT_TYPE_INFANTRY = 0;
    public static final int UNIT_TYPE_ARCHER = 1;
    public static final int UNIT_TYPE_CAVALRY = 2;
    public static final int UNIT_TYPE_SIEGE = 3;
    
    /**
     * Calculate damage dealt by attacker to defender
     * @param attackerType Type of attacking unit
     * @param attackerDamage Base damage of attacker
     * @param defenderArmor Armor rating of defender
     * @return Final damage after armor calculation
     */
    public static int calculateDamage(int attackerType, int attackerDamage, int defenderArmor) {
        // Base damage calculation with armor reduction
        int finalDamage = Math.max(1, attackerDamage - defenderArmor);
        
        // Bonus damage for certain unit matchups
        // Cavalry bonus vs infantry
        if (attackerType == UNIT_TYPE_CAVALRY) {
            finalDamage = (int)(finalDamage * 1.5);
        }
        
        // Infantry bonus vs siege
        if (attackerType == UNIT_TYPE_INFANTRY) {
            finalDamage = (int)(finalDamage * 1.3);
        }
        
        return finalDamage;
    }
    
    /**
     * Get attack range for a unit type
     * @param unitType Type of unit
     * @return Attack range in tiles
     */
    public static int getAttackRange(int unitType) {
        switch (unitType) {
            case UNIT_TYPE_ARCHER:
                return ARCHER_RANGE;
            case UNIT_TYPE_SIEGE:
                return SIEGE_RANGE;
            case UNIT_TYPE_CAVALRY:
            case UNIT_TYPE_INFANTRY:
            default:
                return MELEE_RANGE;
        }
    }
    
    /**
     * Check if a unit is in range to attack target
     * @param sourceX Source X position (in tiles)
     * @param sourceY Source Y position (in tiles)
     * @param targetX Target X position (in tiles)
     * @param targetY Target Y position (in tiles)
     * @param range Attack range (in tiles)
     * @return true if target is in range
     */
    public static boolean isInAttackRange(int sourceX, int sourceY, int targetX, int targetY, int range) {
        int dx = Math.abs(targetX - sourceX);
        int dy = Math.abs(targetY - sourceY);
        int distanceSquared = dx * dx + dy * dy;
        int rangeSquared = range * range;
        return distanceSquared <= rangeSquared;
    }
    
    /**
     * Find nearest enemy unit for auto-targeting
     * @param sourceX Source X position
     * @param sourceY Source Y position
     * @param units Array of all units
     * @param sourcePlayer Player index of source unit
     * @param maxRange Maximum search range
     * @return Index of nearest enemy unit, or -1 if none found
     */
    public static int findNearestEnemy(int sourceX, int sourceY, Object[] units, int sourcePlayer, int maxRange) {
        int nearestIndex = -1;
        int nearestDistSquared = Integer.MAX_VALUE;
        
        if (units == null) return -1;
        
        for (int i = 0; i < units.length; i++) {
            if (units[i] == null) continue;
            
            // This would need to be adapted to work with the actual unit class (d)
            // For now, providing the structure
            
            // Check if enemy player
            // int unitPlayer = getUnitPlayer(units[i]);
            // if (unitPlayer == sourcePlayer || unitPlayer == -1) continue;
            
            // int unitX = getUnitX(units[i]);
            // int unitY = getUnitY(units[i]);
            
            // int dx = unitX - sourceX;
            // int dy = unitY - sourceY;
            // int distSquared = dx * dx + dy * dy;
            
            // if (distSquared < nearestDistSquared && distSquared <= maxRange * maxRange) {
            //     nearestDistSquared = distSquared;
            //     nearestIndex = i;
            // }
        }
        
        return nearestIndex;
    }
    
    /**
     * Create a projectile for ranged attacks
     * @param sourceX Starting X position
     * @param sourceY Starting Y position
     * @param targetX Target X position
     * @param targetY Target Y position
     * @param damage Projectile damage
     * @param speed Projectile speed
     * @return Projectile object (would be instance of class d with type 5)
     */
    public static Object createProjectile(int sourceX, int sourceY, int targetX, int targetY, int damage, int speed) {
        // Calculate trajectory
        int dx = targetX - sourceX;
        int dy = targetY - sourceY;
        
        // This would create a projectile entity using the existing d class
        // with appropriate parameters for visual representation
        
        // For archer projectiles, would use arrow graphics
        // For siege, would use larger projectile graphics
        
        return null; // Placeholder - would return actual d instance
    }
}
