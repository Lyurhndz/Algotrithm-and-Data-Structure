import java.util.Scanner;

public class KRSApprovalMain {
    static void menu() {
        System.out.println("\n=== KRS Approval System ===");
        System.out.println("1. Add Student to Queue");
        System.out.println("2. Process KRS Approval (2 students)");
        System.out.println("3. View First Student in Queue");
        System.out.println("4. View First Two Students in Queue");
        System.out.println("5. View Last Student in Queue");
        System.out.println("6. View All Students in Queue");
        System.out.println("7. View Queue Size");
        System.out.println("8. View Processed Students Count");
        System.out.println("9. View Remaining Processing Capacity");
        System.out.println("10. Clear Queue");
        System.out.println("0. Exit");
        System.out.print("Choose menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSApprovalQueue queue = new KRSApprovalQueue(10);
        int choice;

        do {
            menu();
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Queue is full! Cannot add more students.");
                        break;
                    }
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Study Program: ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Enter Class: ");
                    String className = sc.nextLine();
                    Student newStudent = new Student(nim, name, studyProgram, className);
                    queue.enqueue(newStudent);
                    break;
                case 2:
                    queue.processBatch();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekTwoFront();
                    break;
                case 5:
                    queue.viewRear();
                    break;
                case 6:
                    queue.printAll();
                    break;
                case 7:
                    System.out.println("Current queue size: " + queue.getQueueSize());
                    break;
                case 8:
                    System.out.println("Processed students: " + queue.getProcessedCount());
                    break;
                case 9:
                    System.out.println("Remaining processing capacity: " + queue.getRemainingCount());
                    break;
                case 10:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid menu choice!");
            }
        } while (choice != 0);
        sc.close();
    }
}