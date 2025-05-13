public class KRSApprovalQueue {
    Student[] data;
    int front, rear, size, max;
    int totalProcessed;
    final int MAX_PROCESSED = 30;

    public KRSApprovalQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
        totalProcessed = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Student dt) {
        if (isFull()) {
            System.out.println("Queue is full!!!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is successfully added to the queue at position %d\n", dt.name, rear);
    }

    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return null;
        }
        Student dt = data[front];
        front = (front + 1) % max;
        size--;
        return dt;
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("First student in queue:");
        data[front].print();
    }

    public void peekTwoFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        if (size == 1) {
            System.out.println("Only one student in queue:");
            data[front].print();
            return;
        }
        System.out.println("First two students in queue:");
        data[front].print();
        data[(front + 1) % max].print();
    }

    public void viewRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("Last student in queue:");
        data[rear].print();
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        System.out.println("All students in queue:");
        int i = front;
        int count = 0;
        while (count < size) {
            data[i].print();
            i = (i + 1) % max;
            count++;
        }
        System.out.println("Number of students in queue: " + size);
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Queue has been cleared!");
        } else {
            System.out.println("Queue is already empty!");
        }
    }

    public int getQueueSize() {
        return size;
    }

    public int getProcessedCount() {
        return totalProcessed;
    }

    public int getRemainingCount() {
        return MAX_PROCESSED - totalProcessed;
    }

    public void processBatch() {
        if (isEmpty()) {
            System.out.println("No students to process!");
            return;
        }

        int processCount = Math.min(2, size);
        System.out.println("Processing " + processCount + " students...");

        for (int i = 0; i < processCount; i++) {
            if (totalProcessed >= MAX_PROCESSED) {
                System.out.println("DPA has reached maximum processing capacity!");
                return;
            }
            Student student = dequeue();
            student.approve();
            totalProcessed++;
            System.out.println("Approved: ");
            student.print();
        }
    }
}