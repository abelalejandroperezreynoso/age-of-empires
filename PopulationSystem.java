/**
 * Population Limit System for Age of Empires
 * Tracks current and maximum population per player
 */
public class PopulationSystem {
    
    // Population constants
    public static final int BASE_POPULATION = 5;         // Starting population limit
    public static final int HOUSE_POPULATION = 5;        // Population provided by each house
    public static final int MAX_POPULATION = 200;        // Absolute maximum population
    
    private int currentPopulation;    // Current population used
    private int maxPopulation;        // Maximum allowed population
    private int houseCount;           // Number of houses built
    
    public PopulationSystem() {
        this.currentPopulation = 0;
        this.maxPopulation = BASE_POPULATION;
        this.houseCount = 0;
    }
    
    /**
     * Add a house to increase population limit
     * @return New maximum population
     */
    public int addHouse() {
        houseCount++;
        maxPopulation = Math.min(MAX_POPULATION, BASE_POPULATION + (houseCount * HOUSE_POPULATION));
        return maxPopulation;
    }
    
    /**
     * Remove a house (when destroyed)
     * @return New maximum population
     */
    public int removeHouse() {
        if (houseCount > 0) {
            houseCount--;
            maxPopulation = BASE_POPULATION + (houseCount * HOUSE_POPULATION);
        }
        return maxPopulation;
    }
    
    /**
     * Add population (when unit is created)
     * @param amount Population to add (typically 1 per unit)
     * @return true if population was added, false if at capacity
     */
    public boolean addPopulation(int amount) {
        if (currentPopulation + amount <= maxPopulation) {
            currentPopulation += amount;
            return true;
        }
        return false;
    }
    
    /**
     * Remove population (when unit dies)
     * @param amount Population to remove (typically 1 per unit)
     */
    public void removePopulation(int amount) {
        currentPopulation = Math.max(0, currentPopulation - amount);
    }
    
    /**
     * Check if there is room for more population
     * @param amount Population to check
     * @return true if there is room
     */
    public boolean hasRoomFor(int amount) {
        return currentPopulation + amount <= maxPopulation;
    }
    
    /**
     * Check if at population capacity
     * @return true if at capacity
     */
    public boolean isAtCapacity() {
        return currentPopulation >= maxPopulation;
    }
    
    /**
     * Get current population
     * @return Current population count
     */
    public int getCurrentPopulation() {
        return currentPopulation;
    }
    
    /**
     * Get maximum population
     * @return Maximum population limit
     */
    public int getMaxPopulation() {
        return maxPopulation;
    }
    
    /**
     * Get number of houses
     * @return House count
     */
    public int getHouseCount() {
        return houseCount;
    }
    
    /**
     * Get available population space
     * @return Available population slots
     */
    public int getAvailablePopulation() {
        return maxPopulation - currentPopulation;
    }
    
    /**
     * Set current population (for loading saved games)
     * @param population Current population value
     */
    public void setCurrentPopulation(int population) {
        this.currentPopulation = Math.max(0, Math.min(population, maxPopulation));
    }
    
    /**
     * Set house count (for loading saved games)
     * @param houses Number of houses
     */
    public void setHouseCount(int houses) {
        this.houseCount = Math.max(0, houses);
        this.maxPopulation = Math.min(MAX_POPULATION, BASE_POPULATION + (houseCount * HOUSE_POPULATION));
    }
    
    /**
     * Get population as display string
     * @return String in format "current/max"
     */
    public String getPopulationString() {
        return currentPopulation + "/" + maxPopulation;
    }
    
    /**
     * Reset population system to initial state
     */
    public void reset() {
        currentPopulation = 0;
        maxPopulation = BASE_POPULATION;
        houseCount = 0;
    }
}
