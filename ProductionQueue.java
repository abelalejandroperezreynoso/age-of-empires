import java.util.Vector;

/**
 * Production Queue System for Age of Empires
 * Manages unit production from buildings with queues and timers
 */
public class ProductionQueue {
    
    /**
     * Represents a single item in the production queue
     */
    public static class QueueItem {
        public int unitType;          // Type of unit being produced
        public int remainingTime;      // Time remaining until production completes (in game ticks)
        public int totalTime;          // Total production time for this unit
        public int playerId;           // Player who owns this production
        
        public QueueItem(int unitType, int productionTime, int playerId) {
            this.unitType = unitType;
            this.remainingTime = productionTime;
            this.totalTime = productionTime;
            this.playerId = playerId;
        }
        
        /**
         * Update the production timer
         * @return true if production is complete
         */
        public boolean update() {
            if (remainingTime > 0) {
                remainingTime--;
            }
            return remainingTime <= 0;
        }
        
        /**
         * Get production progress as percentage
         * @return Progress from 0 to 100
         */
        public int getProgress() {
            if (totalTime <= 0) return 100;
            return Math.min(100, 100 * (totalTime - remainingTime) / totalTime);
        }
    }
    
    // Production time constants (in game ticks, ~60 ticks per second typical)
    public static final int VILLAGER_TIME = 150;      // 2.5 seconds
    public static final int INFANTRY_TIME = 180;      // 3 seconds
    public static final int ARCHER_TIME = 210;        // 3.5 seconds
    public static final int CAVALRY_TIME = 300;       // 5 seconds
    public static final int SIEGE_TIME = 450;         // 7.5 seconds
    
    // Maximum queue size per building
    public static final int MAX_QUEUE_SIZE = 5;
    
    private Vector queue;              // Queue of QueueItem objects
    private int buildingId;            // ID of building this queue belongs to
    private int buildingType;          // Type of building (barracks, town center, etc.)
    
    public ProductionQueue(int buildingId, int buildingType) {
        this.queue = new Vector();
        this.buildingId = buildingId;
        this.buildingType = buildingType;
    }
    
    /**
     * Add a unit to the production queue
     * @param unitType Type of unit to produce
     * @param playerId Player who owns the production
     * @return true if successfully added to queue
     */
    public boolean addToQueue(int unitType, int playerId) {
        if (queue.size() >= MAX_QUEUE_SIZE) {
            return false; // Queue is full
        }
        
        int productionTime = getProductionTime(unitType);
        QueueItem item = new QueueItem(unitType, productionTime, playerId);
        queue.addElement(item);
        return true;
    }
    
    /**
     * Update the production queue (call each game tick)
     * @return QueueItem if a unit completed production, null otherwise
     */
    public QueueItem update() {
        if (queue.size() == 0) {
            return null;
        }
        
        QueueItem currentItem = (QueueItem)queue.elementAt(0);
        if (currentItem.update()) {
            // Production complete
            queue.removeElementAt(0);
            return currentItem;
        }
        
        return null;
    }
    
    /**
     * Cancel production of an item in the queue
     * @param index Index of item to cancel
     * @return true if successfully cancelled
     */
    public boolean cancelProduction(int index) {
        if (index >= 0 && index < queue.size()) {
            queue.removeElementAt(index);
            return true;
        }
        return false;
    }
    
    /**
     * Get the current queue size
     * @return Number of items in queue
     */
    public int getQueueSize() {
        return queue.size();
    }
    
    /**
     * Get a queue item at specific index
     * @param index Index of item
     * @return QueueItem or null if index invalid
     */
    public QueueItem getQueueItem(int index) {
        if (index >= 0 && index < queue.size()) {
            return (QueueItem)queue.elementAt(index);
        }
        return null;
    }
    
    /**
     * Clear the entire queue
     */
    public void clearQueue() {
        queue.removeAllElements();
    }
    
    /**
     * Check if queue is empty
     * @return true if queue is empty
     */
    public boolean isEmpty() {
        return queue.size() == 0;
    }
    
    /**
     * Get production time for a unit type
     * @param unitType Type of unit
     * @return Production time in ticks
     */
    public static int getProductionTime(int unitType) {
        switch (unitType) {
            case 0: // Villager
                return VILLAGER_TIME;
            case 1: // Infantry
                return INFANTRY_TIME;
            case 2: // Archer
                return ARCHER_TIME;
            case 3: // Cavalry
                return CAVALRY_TIME;
            case 4: // Siege
                return SIEGE_TIME;
            default:
                return INFANTRY_TIME;
        }
    }
    
    /**
     * Get the progress of current production
     * @return Progress percentage (0-100), or -1 if queue empty
     */
    public int getCurrentProgress() {
        if (queue.size() == 0) {
            return -1;
        }
        QueueItem current = (QueueItem)queue.elementAt(0);
        return current.getProgress();
    }
}
