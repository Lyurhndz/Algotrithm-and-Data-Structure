import java.util.Scanner;

public class StudentDemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TopStudents7 topStudents = new TopStudents7(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter NIM, Name, Class, GPA:");
            String nim = scanner.next();
            String name = scanner.next();
            String studentClass = scanner.next();
            double gpa = scanner.nextDouble();
            topStudents.add(new Student7(nim, name, studentClass, gpa));
        }

        topStudents.add(new Student7("2201", "Alice", "A", 3.9));
        topStudents.add(new Student7("2202", "Bob", "B", 3.7));
        topStudents.add(new Student7("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student7("2204", "David", "D", 3.6));
        topStudents.add(new Student7("2205", "Eve", "E", 4.0));

        System.out.println("Original student list: ");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("\nSorted student list (by GPA, descending) using Bubble Sort: ");
        topStudents.print();

        topStudents.selectionSort();
        System.out.println("\nSorted student list (by GPA, ascending) using Selection Sort: ");
        topStudents.print();

        topStudents.insertionSort();
        System.out.println("\nSorted student list (by GPA, ascending) using Insertion Sort: ");
        topStudents.print();

        scanner.close();
    }
}