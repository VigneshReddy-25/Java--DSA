
package Queue;

public class QueueArray {

    int capacity;
    int arr[];
    int front;
    int rear;
    int size;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }

        arr[++rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            return -1;
        }

        int val = arr[front++];
        size--;
        return val;
    }

    public int peek() {
        if (size == 0) {
            return -1;
        }

        return arr[front];
    }

    public void isEmpty() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue has values");
    }

    public static void main(String args[]) {
        QueueArray mq = new QueueArray(10);

        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);
        mq.enqueue(40);
        mq.enqueue(50);

        int n = mq.dequeue();
        System.out.println(n == -1
                ? "There is no element to remove"
                : "Element removed is " + n);

        int k = mq.peek();
        System.out.println(k == -1
                ? "There is no element"
                : "The peek element is " + k);

        int m = mq.dequeue();
        System.out.println(m == -1
                ? "There is no element to remove"
                : "Element removed is " + m);

        mq.isEmpty();
    }
}
