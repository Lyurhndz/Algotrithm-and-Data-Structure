import java.util.Scanner;
public class StudentDemo7 {
    public static void main(String[] args) {
        StudentAssignmentStack7 stack = new StudentAssignmentStack7(5);

        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Collect Assignments ");
            System.out.println("2. Grading Assignments");
            System.out.println("3. View Top Assignments");
            System.out.println("4. View the Assignments List");
            System.out.print("Choose: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name=scan.nextLine();
                    System.out.print("NIM: ");
                    String nim=scan.nextLine();
                    System.out.print("Class: ");
                    String className=scan.nextLine();
                    Student7 std = new Student7(nim, name, className);
                    stack.push(std);
                    System.out.printf("%s's Assignment submitted.\n", std.name);
                    break;
                
                case 2:
                Student7 graded = stack.pop();
                if (graded != null) {
                    System.out.println("Grading assignments from "+graded.name);
                    System.out.print("Enter the score (0-100): ");
                    int grade = scan.nextInt();
                    graded.grading(grade);
                    System.out.printf("The grade of the %s assignment is %d\n", graded.name, grade);
                }
                    break;
                
                case 3:
                Student7 gaze = stack.peek();
                if (gaze != null) {
                    System.out.println("The last assignment submitted by "+gaze.name);
                }
                    break;
                
                case 4:
                System.out.println("All the assignments list");
                System.out.println("Name\tNIM\tClass");
                stack.print();
                System.out.println("Pending assignments: " + stack.countAssignments());
                    break;
                
                case 5:
                Student7 first = stack.getFirst();
                if (first != null) {
                System.out.println("First submission by: " + first.name);
                }
                break;
            
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice>=1 && choice<=4);
        scan.close();
    }
}
