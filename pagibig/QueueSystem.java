package pagibig;

public class QueueSystem {
    private static QueueSystem instance;
    private int queueNumber;

    // Private constructor to prevent instantiation outside of the class
    private QueueSystem() {
        queueNumber = 0;
    }

    // Get QueueSystem instance
    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    // Get next queue number
    public synchronized int getNextQueueNumber() {
        queueNumber++;
        return queueNumber;
    }

    // Reset queue number based on input
    public synchronized void resetQueueNumber(int newQueueNumber) {
        queueNumber = newQueueNumber;
    }

    // Get current queue number
    public synchronized int getCurrentQueueNumber() {
        return queueNumber;
    }
}
