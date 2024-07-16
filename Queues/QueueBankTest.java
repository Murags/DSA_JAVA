import java.util.Scanner;

public class QueueBankTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueBank queue = new QueueBank(10);

        while (true) {
            System.out.println("Select an option: ");
            System.out.println("1. Enqueue a customer");
            System.out.println("2. Dequeue a customer");
            System.out.println("3. Peek front customer");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter customer name: ");
                    String name = scanner.nextLine();
                    queue.insert(name);
                    break;
                case 2:
                    String servedCustomer = queue.remove();
                    if (servedCustomer != null) {
                        System.out.println("Served: " + servedCustomer);
                    }
                    break;
                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Next to be served: " + queue.peekFront());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
