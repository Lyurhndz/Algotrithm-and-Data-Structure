import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student3 student1 = new Student3("22001", "Ali");
        Student3 student2 = new Student3("22002", "Budi");
        Student3 student3 = new Student3("22003", "Citra");
        Student3 student4 = new Student3("22004", "Deni");
        Student3 student5 = new Student3("22005", "Eka");

        Course3 course1 = new Course3("MK001", "Math", 3);
        Course3 course2 = new Course3("MK002", "Database", 3);
        Course3 course3 = new Course3("MK003", "Algorithm", 2);

        Operation3 operation = new Operation3(10);

        operation.addAbsence(new Absence3(student1, course1, 10, 1, 1, 0));
        operation.addAbsence(new Absence3(student1, course2, 12, 0, 1, 1));
        operation.addAbsence(new Absence3(student2, course1, 14, 0, 0, 0));
        operation.addAbsence(new Absence3(student3, course2, 9, 2, 1, 2));
        operation.addAbsence(new Absence3(student3, course3, 10, 0, 0, 2));
        operation.addAbsence(new Absence3(student4, course3, 13, 0, 0, 0));
        operation.addAbsence(new Absence3(student5, course1, 11, 1, 1, 1));

        int choice;
        do {
            System.out.println("\n=== STUDENT ATTENDANCE MANAGEMENT SYSTEM ===");
            System.out.println("1. Show Student Data");
            System.out.println("2. Show Course Data");
            System.out.println("3. Show Attendance Data");
            System.out.println("4. Sort Attendance by Attendance Percentage");
            System.out.println("5. Search Attendance by Student ID");
            System.out.println("6. Display Courses Attendance Percentage");
            System.out.println("7. Exit");
            System.out.print("Choose menu (1-7): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayStudents(operation);
                    break;
                case 2:
                    displayCourses(operation);
                    break;
                case 3:
                    displayAllAbsence(operation);
                    break;
                case 4:
                    sortAndDisplayAbsence(operation);
                    break;
                case 5:
                    searchAbsenceByStudentId(operation, scanner);
                    break;
                case 6:
                    displayCoursesPercentage(operation, scanner);
                    break;
                case 7:
                    System.out.println("Thank you. Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void displayStudents(Operation3 operation) {
        System.out.println("\n=== STUDENT DATA ===");
        String[] stdName = { "Ali", "Budi", "Citra", "Deni", "Eka" };

        for (String name : stdName) {
            for (int i = 0; i < operation.idx; i++) {
                if (operation.listAbsence3s[i].student.name.equals(name)) {
                    operation.listAbsence3s[i].student.displayDataStd(); 
                    break;
                }
            }
        }
    }

    // private static void displayCourses(Operation3 operation) {
    // System.out.println("\n=== COURSE DATA ===");
    // for (int i = 0; i < operation.idx; i++) {
    // operation.listAbsence3s[i].course.displayDataCourse();
    // }
    // }

    private static void displayCourses(Operation3 operation) {
        System.out.println("\n=== COURSE DATA ===");
        String[] courseCodes = { "MK001", "MK002", "MK003" };

        for (String code : courseCodes) {
            for (int i = 0; i < operation.idx; i++) {
                if (operation.listAbsence3s[i].course.courseCode.equals(code)) {
                    operation.listAbsence3s[i].course.displayDataCourse();
                    break;
                }
            }
        }
    }

    //feedback : SHOW ALL COURSE DATA, NOT BE SPECIFIC. CREATE IN JUST ONE FOR LOOP
    private static void displayCoursesPercentage(Operation3 operation, Scanner scanner) {
        System.out.println("\n=== COURSE DATA ATTENDANCE PERCENTAGE ===");
        System.out.println("1. Math");
        System.out.println("2. Database");
        System.out.println("3. Algorithm");
        System.out.print("Choose the course name: ");
        String name = scanner.nextLine();
        double count = 0, count1 = 0;
        int count2 = 0;

        for (int i = 0; i < operation.idx; i++) {
            if (operation.listAbsence3s[i].course.courseName.equalsIgnoreCase(name)) {
                Absence3 absence = operation.listAbsence3s[i];
                double percentage = absence.CalculateAttendacePercentage();
                count += percentage;
                count1++;
            }
        }
        double attPerc = (count / count1);
        System.out.printf("Attendance Percentage: %.2f%%\n", attPerc);

        for (int i = 0; i < operation.idx; i++) {
            if (operation.listAbsence3s[i].course.courseName.equalsIgnoreCase(name)) {
                Absence3 absence = operation.listAbsence3s[i];
                double percentage = absence.CalculateAttendacePercentage();
                if (percentage < 75) {
                    count2++;
                }
            }
        }
        System.out.println("Student That NOT Passed: " + count2);
    }

    private static void displayAllAbsence(Operation3 operation) {
        System.out.println("\n=== STUDENT ATTENDANCE DATA ===");
        for (int i = 0; i < operation.idx; i++) {
            Absence3 absence = operation.listAbsence3s[i];
            double percentage = absence.CalculateAttendacePercentage();
            absence.displayDataAbsence(percentage);
            System.out.println();
        }
    }

    private static void sortAndDisplayAbsence(Operation3 operation) {
        operation.bubbleSort();
        System.out.println("\n=== ATTENDANCE DATA SORTED BY PERCENTAGE ===");
        for (int i = 0; i < operation.idx; i++) {
            Absence3 absence = operation.listAbsence3s[i];
            double percentage = absence.CalculateAttendacePercentage();
            System.out.printf("%.2f%% - %s - %s\n",
                    percentage,
                    absence.student.name,
                    absence.course.courseName);
        }
    }

    private static void searchAbsenceByStudentId(Operation3 operation, Scanner scanner) {
        System.out.print("\nEnter Student ID to search: ");
        String searchId = scanner.nextLine();

        System.out.println("\n=== ATTENDANCE SEARCH RESULT ===");

        boolean found = false;
        int currentIndex = 0;

        while (true) {
            int foundIndex = operation.sequentialSearch(searchId, currentIndex);

            if (foundIndex == -1) {
                break;
            }

            Absence3 absence = operation.listAbsence3s[foundIndex];
            double percentage = absence.CalculateAttendacePercentage();
            absence.displayDataAbsence(percentage);
            System.out.println();

            found = true;
            currentIndex = foundIndex + 1;
        }

        if (!found) {
            System.out.println("Attendance data for Student ID \"" + searchId + "\" not found.");
        }
    }
    // MODIFIED SEARCHING SYSTEM BASED FROM THE STUDY CASE PRESENTATION FEEDBACK
    // private static void displayStudents(Operation3 operation) {
    // System.out.println("\n=== STUDENT DATA ===");
    // String[] displayedNIMs = new String[operation.idx];
    // int count = 0;

    // for (int i = 0; i < operation.idx; i++) {
    // String currentNIM = operation.listAbsence3s[i].student.nim;
    // boolean alreadyDisplayed = false;

    // for (int j = 0; j < count; j++) {
    // if (displayedNIMs[j].equals(currentNIM)) {
    // alreadyDisplayed = true;
    // break;
    // }
    // }

    // if (!alreadyDisplayed) {
    // operation.listAbsence3s[i].student.displayDataStd();
    // displayedNIMs[count++] = currentNIM;
    // }
    // }
}