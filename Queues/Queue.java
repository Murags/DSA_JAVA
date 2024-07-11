public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front, rear, nItems;

    public static void main(String[] args){
        Queue myQ = new Queue(7);
        for (int i = 1; i <= 7; i++){
            myQ.insert(i);
        }
        System.out.println(myQ.remove());
    }

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    public long remove() {
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
