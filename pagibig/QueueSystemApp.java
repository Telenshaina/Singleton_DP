package pagibig;
import java.util.Scanner;

public class QueueSystemApp {
    public static void main(String[] args) {
       //Shaina Blessy Meir Telen 3BSCS1
        Scanner scanner = new Scanner(System.in);
        // input 
        System.out.print("Enter initial queue number: "); 
        int initialQueueNumber = scanner.nextInt();

        QueueSystem queueSystem = QueueSystem.getInstance(initialQueueNumber);
        // Queue Start
        System.out.println("Visitor 1 queue number: " + queueSystem.getNextQueueNumber());
        System.out.println("Visitor 2 queue number: " + queueSystem.getNextQueueNumber());
        System.out.println("Visitor 3 queue number: " + queueSystem.getNextQueueNumber());

        //Current
        System.out.println("Current queue number: " + queueSystem.getCurrentQueueNumber());

        // Reset Queue
        System.out.print("Enter new queue number to reset: "); int newQueueNumber = scanner.nextInt();
        queueSystem.resetQueueNumber(newQueueNumber);
        System.out.println("Queue number reset to: " + queueSystem.getCurrentQueueNumber());

       
        System.out.println("Visitor 4 queue number: " + queueSystem.getNextQueueNumber());
        System.out.println("Visitor 5 queue number: " + queueSystem.getNextQueueNumber());

    
        System.out.println("Updated queue number: " + queueSystem.getCurrentQueueNumber());
    }
}
