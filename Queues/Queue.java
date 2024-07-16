public class Queue {
    public int maxSize;
    public long[] queArray;
    int front, rear, nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + j);
            return;
        }
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
        System.out.println("Inserted " + j + " at position " + rear);
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return -1;
        }
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}
