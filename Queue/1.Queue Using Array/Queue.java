public class Queue {
    private int[] queue;  // Array to store queue elements
    private int front;    // Index of front element
    private int rear;     // Index of rear element
    private int size;     // Current size of the queue
    private int capacity; // Maximum capacity of the queue

    // Constructor to initialize the queue
    public Queue(int len) {
        capacity = len;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Utility function to add an item to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }
        rear++;
        queue[rear] = value;
        size++;
    }

    // Utility function to remove front element from the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Removing " + queue[front]);
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        size--;
    }

    // Utility function to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return queue[front];
    }

    // Utility function to return the size of the queue
    public int size() {
        return size;
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return (size == 0);
    }

    // Utility function to check if the queue is full or not
    public boolean isFull() {
        return (size == capacity);
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.dequeue();
        System.out.println("Front element is: " + q.peek());
        q.enqueue(5);

        q.dequeue();
        q.dequeue();

        System.out.println("Queue size is: " + q.size());
        System.out.println("Front element is: " + q.peek());

        if (q.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }
}
