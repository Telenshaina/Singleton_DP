package pagibig;

public class UserApp {
    public static void main(String[] args) {
        // Instantiate the queue system
        QueueSystem queueSystem = QueueSystem.getInstance();

        // Get next queue numbers
        System.out.println("Next Queue Number: " + queueSystem.getNextQueueNumber());
        System.out.println("Next Queue Number: " + queueSystem.getNextQueueNumber());

        // Reset queue number
        queueSystem.resetQueueNumber(100);
        System.out.println("Queue Number Reset to: " + queueSystem.getCurrentQueueNumber());

        // Get next queue number after reset
        System.out.println("Next Queue Number: " + queueSystem.getNextQueueNumber());
    }
}
