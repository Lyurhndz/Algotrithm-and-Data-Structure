public class StudentQueue7 {
    Student7[] data;
    int front, rear, size, max;

    public StudentQueue7(int n) {
        max = n;
        data = new Student7[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: ");
            data[front].print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            }
            int i = front;
            while (i != rear) {
                data[i].print();
                i=(i+1)%max;
            }
            data[i].print();
            System.out.println("Number of element: "+size);
        }

    void clear() {
        if (isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        } else {
            System.out.println("Queue is already empty!");
        }
    }

    void enqueue(Student7 dt) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%d is successfully added at index %d\n", dt.name, rear);
    }

    Student7 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        Student7 dt = data[front];
        front = (front + 1) % max;
        size--;
        return dt;
    }
}
