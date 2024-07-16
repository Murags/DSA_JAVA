public class QueueTest {
    public static void main(String[] args) {
        // Step 7: Create a queue with 10 elements
        Queue queue = new Queue(10);

        // Step 8: Print out the queue array index values of the current front and rear
        System.out.println("Front index: " + queue.front);
        System.out.println("Rear index: " + queue.rear);

        // Step 9: Insert 10 elements to the queue
        for (int i = 1; i <= 10; i++) {
            queue.insert(i);
        }

        // Step 10: Print out the contents of the queue and identify the elements in front and rear
        System.out.print("Queue contents: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.queArray[(queue.front + i) % queue.maxSize] + " ");
        }
        System.out.println("\nFront element: " + queue.peekFront());
        System.out.println("Rear element: " + queue.queArray[queue.rear]);

        // Step 11: Print out the indexes of the front and rear
        System.out.println("Front index: " + queue.front);
        System.out.println("Rear index: " + queue.rear);

        // Step 12: Dequeue 3 elements
        for (int i = 0; i < 3; i++) {
            System.out.println("Removed: " + queue.remove());
        }

        // Step 13: Enqueue 2 elements
        queue.insert(11);
        queue.insert(12);

        // Step 14: Dequeue 2 elements
        for (int i = 0; i < 2; i++) {
            System.out.println("Removed: " + queue.remove());
        }

        // Step 15: Print out the contents of the queue
        System.out.print("Queue contents: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.queArray[(queue.front + i) % queue.maxSize] + " ");
        }
        System.out.println();

        // Step 16: Print out the indexes of the front and rear
        System.out.println("Front index: " + queue.front);
        System.out.println("Rear index: " + queue.rear);

        // Step 17: Enqueue 6 elements
        for (int i = 13; i <= 18; i++) {
            queue.insert(i);
        }

        // Step 18: Dequeue 11 elements
        for (int i = 0; i < 11; i++) {
            System.out.println("Removed: " + queue.remove());
        }
    }
}
