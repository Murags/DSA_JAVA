import java.util.concurrent.atomic.AtomicInteger;

public class QueueBank {
    private int maxSize;
    private String[] queArray;
    int front, rear, nItems;
    private AtomicInteger codeGenerator;

    public QueueBank(int s) {
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
        codeGenerator = new AtomicInteger(1);
    }

    public void insert(String name) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + name);
            return;
        }
        if (rear == maxSize - 1)
            rear = -1;
        String code = "C" + codeGenerator.getAndIncrement();
        queArray[++rear] = code + " - " + name;
        nItems++;
        System.out.println("Inserted " + name + " with code " + code + " at position " + rear);
    }

    public String remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return null;
        }
        String temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public String peekFront() {
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
