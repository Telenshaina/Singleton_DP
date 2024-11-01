package pagibig;

public class QueueSystem {
    private static QueueSystem instance;
    private int queueNumber;

    private QueueSystem(int initialQueueNumber) {
        queueNumber = initialQueueNumber;
    }

    public static synchronized QueueSystem getInstance(int initialQueueNumber) {
        if (instance == null) {
            instance = new QueueSystem(initialQueueNumber);
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        queueNumber++;
        return queueNumber;
    }

    
    public synchronized void resetQueueNumber(int newQueueNumber) {
        queueNumber = newQueueNumber;
    }

    
    public synchronized int getCurrentQueueNumber() {
        return queueNumber;
    }
}
