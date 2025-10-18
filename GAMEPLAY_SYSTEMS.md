# Age of Empires - Gameplay Systems Implementation

## Overview

This document describes the implementation of core gameplay systems for the Age of Empires mobile game. The implementation adds six major systems while maintaining compatibility with the existing obfuscated J2ME codebase.

## New Systems

### 1. Combat System (`CombatSystem.java`)

**Features:**
- Attack range calculations for different unit types
- Damage calculation with armor reduction
- Unit type bonuses (cavalry vs infantry, infantry vs siege)
- Auto-targeting system for finding nearest enemies
- Projectile creation for ranged units

**Key Methods:**
- `calculateDamage(attackerType, damage, armor)` - Calculate final damage after armor
- `getAttackRange(unitType)` - Get attack range for unit type
- `isInAttackRange(sx, sy, tx, ty, range)` - Check if target is in range
- `findNearestEnemy(x, y, units, player, range)` - Auto-targeting
- `createProjectile(sx, sy, tx, ty, damage, speed)` - Create projectile entity

**Attack Ranges:**
- Melee (Infantry, Cavalry): 1 tile
- Archer: 6 tiles
- Siege: 8 tiles

### 2. Production Queue System (`ProductionQueue.java`)

**Features:**
- Production queues for buildings (barracks, town center)
- Production timers with progress tracking
- Queue management (add, cancel, clear)
- Maximum queue size limit (5 items)

**Key Methods:**
- `addToQueue(unitType, playerId)` - Add unit to production
- `update()` - Update timers, returns completed unit
- `cancelProduction(index)` - Cancel item in queue
- `getCurrentProgress()` - Get production progress %

**Production Times:**
- Villager: 150 ticks (2.5 seconds)
- Infantry: 180 ticks (3 seconds)
- Archer: 210 ticks (3.5 seconds)
- Cavalry: 300 ticks (5 seconds)
- Siege: 450 ticks (7.5 seconds)

### 3. Population System (`PopulationSystem.java`)

**Features:**
- Current/maximum population tracking
- House-based population limits
- Population increase with house construction
- Population cap enforcement

**Key Methods:**
- `addHouse()` - Increase population limit by 5
- `removeHouse()` - Decrease population limit (building destroyed)
- `addPopulation(amount)` - Use population (returns false if at cap)
- `removePopulation(amount)` - Free population (unit died)
- `hasRoomFor(amount)` - Check if can create unit

**Constants:**
- Base population: 5
- Per house: +5 population
- Max population: 200

### 4. Unit Stats System (`UnitStats.java`)

**Features:**
- Comprehensive stats for all unit types
- Includes new cavalry and siege units
- Stats include: health, damage, armor, range, speed, cost, etc.

**Unit Types:**
```
VILLAGER (0):  HP: 25,  Damage: 3,  Armor: 0,  Range: 1,  Speed: 2,  Cost: 50
INFANTRY (1):  HP: 50,  Damage: 8,  Armor: 2,  Range: 1,  Speed: 2,  Cost: 50
ARCHER (2):    HP: 35,  Damage: 6,  Armor: 0,  Range: 6,  Speed: 2,  Cost: 60
CAVALRY (3):   HP: 80,  Damage: 10, Armor: 2,  Range: 1,  Speed: 4,  Cost: 100
SIEGE (4):     HP: 40,  Damage: 50, Armor: 1,  Range: 8,  Speed: 1,  Cost: 150
```

**Key Methods:**
- `getStats(unitType)` - Get all stats for a unit
- `getHealth/Damage/Armor/Range/etc.(unitType)` - Get specific stat
- `isRanged(unitType)` - Check if unit is ranged

### 5. Attack-Move Command (`AttackMoveCommand.java`)

**Features:**
- Units automatically engage enemies while moving
- Configurable search radius for enemy detection
- Enemy engagement tracking
- Automatic return to destination after combat

**Key Components:**
- `AttackMoveState` - Tracks attack-move state per unit
- `processAttackMove()` - Main update logic
- `searchForNearbyEnemy()` - Find enemies in radius
- `calculateNextPosition()` - Movement calculation

**Usage Pattern:**
1. Activate attack-move with destination
2. Each tick: process behavior
3. Unit searches for enemies in radius
4. If enemy found, engage
5. After combat, continue to destination

### 6. AI Controller System (`AIController.java`)

**Features:**
- Enhanced AI with multiple behavior states
- Difficulty levels (Easy, Medium, Hard)
- Automated villager production
- Building construction logic
- Army training and composition
- Attack timing and execution

**AI States:**
- `BUILD_ECONOMY` - Focus on villagers and buildings
- `BUILD_ARMY` - Train military units
- `ATTACK` - Send attack force to enemy
- `DEFEND` - Respond to enemy attacks

**Difficulty Levels:**
- Easy: 10 villagers, 15 army units, attacks every 60s
- Medium: 15 villagers, 25 army units, attacks every 40s
- Hard: 20 villagers, 35 army units, attacks every 30s

**Key Methods:**
- `update()` - Main AI update (call each tick)
- `setState(state)` - Change AI behavior state
- `triggerDefend()` - Force defend mode
- `chooseUnitType()` - AI unit composition logic

## Integration with Existing Code

### Class Mapping

The new systems are designed to integrate with the existing obfuscated classes:

- **Class `d`**: Unit/Building/Entity class
  - Add `ProductionQueue` instance to building entities
  - Add `AttackMoveState` instance to unit entities
  - Add unit type field (maps to new unit types)
  - Store health, damage stats from `UnitStats`

- **Class `a`**: AI/Player controller class
  - Add `PopulationSystem` instance per player
  - Add `AIController` instance for AI players
  - Track production queues for player's buildings

- **Class `f`**: Game data and resources
  - Initialize `UnitStats` on game load
  - Store unit type definitions

- **Class `e`**: Main game engine
  - Call `ProductionQueue.update()` for each building
  - Call `AIController.update()` for AI players
  - Process `AttackMoveCommand` for units
  - Use `CombatSystem` for combat calculations

### Integration Steps

1. **Initialize Systems**
   ```java
   // In game initialization (class e or f)
   UnitStats.initialize();
   
   // Per player
   PopulationSystem popSystem = new PopulationSystem();
   AIController aiController = new AIController(playerId, difficulty);
   ```

2. **Add to Buildings**
   ```java
   // When creating barracks or town center (class d)
   ProductionQueue queue = new ProductionQueue(buildingId, buildingType);
   ```

3. **Add to Units**
   ```java
   // When creating military units (class d)
   AttackMoveState attackMove = new AttackMoveState();
   ```

4. **Game Loop Integration**
   ```java
   // In main game loop (class e)
   
   // Update production
   for each building with queue {
       QueueItem completed = queue.update();
       if (completed != null) {
           createUnit(completed.unitType, completed.playerId);
       }
   }
   
   // Update AI
   for each AI player {
       aiController.update();
   }
   
   // Update attack-move
   for each unit with attack-move active {
       int action = AttackMoveCommand.processAttackMove(...);
       if (action == 1) {
           // Engage enemy
       } else if (action == 2) {
           // Reached destination
       }
   }
   
   // Combat
   for each unit attacking {
       int damage = CombatSystem.calculateDamage(
           attackerType, attackerDamage, defenderArmor
       );
       applyDamage(target, damage);
       
       if (isRanged) {
           createProjectile(...);
       }
   }
   ```

5. **Population Management**
   ```java
   // When training unit
   if (popSystem.hasRoomFor(unitPopCost)) {
       if (popSystem.addPopulation(unitPopCost)) {
           // Create unit
       }
   }
   
   // When unit dies
   popSystem.removePopulation(unitPopCost);
   
   // When house built
   popSystem.addHouse();
   ```

## UI Integration

The systems provide methods for UI feedback:

- **Production Queue**: `getCurrentProgress()` for progress bar
- **Population**: `getPopulationString()` for "50/100" display
- **Attack-Move**: Visual indicator when active
- **Unit Stats**: `getName(type)` for tooltips

## Testing Recommendations

While no test infrastructure exists, manual testing should verify:

1. Units attack automatically when enemies in range
2. Archers fire projectiles at range
3. Production queues show progress and complete on time
4. Population limits prevent unit creation when at cap
5. Houses increase population limit by 5
6. AI builds villagers, constructs buildings, trains army
7. AI attacks player after building sufficient forces
8. Attack-move units engage enemies on path to destination
9. New unit types (cavalry, siege) have correct stats
10. Unit type bonuses apply correctly

## Performance Considerations

- AI updates only every 60 ticks (1 second) to reduce overhead
- Enemy search uses distance-squared to avoid sqrt calculations
- Production queues use Vectors (standard for J2ME)
- All systems designed for J2ME constraints (no generics, limited memory)

## Future Enhancements

Potential additions not in current scope:

- Formations for unit groups
- Rally points for production buildings
- Unit upgrades/technology tree
- Multiple AI personalities/strategies
- Fog of war system
- Multiplayer synchronization
- Save/load support for new systems

## Compatibility Notes

- All code uses Java 1.4 compatible syntax (J2ME MIDP 1.0)
- No generics, annotations, or Java 5+ features
- Uses Vector instead of ArrayList
- All calculations use integer math
- No floating point where possible (J2ME constraint)

## Code Style

New classes follow clear naming conventions unlike the obfuscated original code:
- Descriptive class/method names
- Comprehensive JavaDoc comments
- Public static final constants for configuration
- Inner classes for related data structures

This makes the new systems maintainable while working with the obfuscated base code.
