import java.util.Scanner;

//Assignment 1
// public class assigJS1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char [] plate = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
//         char [][] city = {
//             {'B','A','N','T','E','N'},
//             {'J','A','K','A','R','T','A'},
//             {'C','I','R','E','B','O','N'},
//             {'B','O','G','O','R'},
//             {'P','E','K','A','L','O','N','G','A','N'},
//             {'S','E','M','A','R','A','N','G'},
//             {'S','U','R','A','B','A','Y','A'},
//             {'M','A','L','A','N','G'},
//             {'T','E','G','A','L'}
//         };
//         for (int i = 0; i < plate.length; i++) {
//             System.out.print(plate[i]+" ");
//         }
//         System.out.println();
//         System.out.print("Input the plate code: ");
//         char plt = sc.next().charAt(0);

//         boolean valid=false;
//         for (int i = 0; i < plate.length; i++) {
//             if (Character.toUpperCase(plt) == plate[i]) {
//                 valid=true;
//                 for (int j = 0; j < city[i].length; j++) {
//                         System.out.print(city[i][j]);
//                 }
//                 break;
//             }
//         }
//         if (!valid){
//             System.out.println("Invalid Plate Code.");
//         }
//     }
// }

//Assignment 2
// public class assigJS1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Input the side of the cube: ");
//         int side = sc.nextInt();
//         System.out.println("The Volume of the cube is: "+volume(side));
//         System.out.println("The surface area of the cube is: "+surfaceArea(side));
//         System.out.println("The perimeter of the cube is: "+perimeter(side));

//     }
//     public static int volume (int side){
//         int vol = side*side*side;
//         return vol;
//     }
//     public static int surfaceArea (int side){
//         int surf = 6*(side*side);
//         return surf;
//     }
//     public static int perimeter(int side){
//         int perim = 6*side;
//         return perim;
//     }
// }

//Assignment 3
public class assigJS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courses = new String[100];
        int[] credit = new int[100];
        String[] semester = new String[100];
        String[] lectureDay = new String[100];
        int courseCount = 0;

        while (true) {
            System.out.println("==================================");
            System.out.println("Menu: ");
            System.out.println("1. Display all courses.");
            System.out.println("2. Display courses on a specific day.");
            System.out.println("3. Display courses for a specific semester.");
            System.out.println("4. Search for a course.");
            System.out.println("5. Exit.");
            System.out.print("Your option: ");
            int menu;
            try {
                menu = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                sc.nextLine();
                continue;
            }

            switch (menu) {
                case 1:
                    displayAllCourses(courses, credit, semester, lectureDay, courseCount);
                    break;
                
                case 2: 
                    System.out.print("Enter the day to display courses (e.g., Monday): ");
                    String day = sc.nextLine();
                    displayCoursesByDay(courses, credit, semester, lectureDay, courseCount, day);
                    break;

                case 3:
                    System.out.print("Enter the semester to display courses (e.g., 1, 2, 3, etc.): ");
                    int sem = sc.nextInt();
                    sc.nextLine();
                    displayCoursesBySemester(courses, credit, semester, lectureDay, courseCount, sem);
                    break;
                
                case 4:
                    System.out.print("Enter the course name to search: ");
                    String courseName = sc.nextLine();
                    searchCourse(courses, credit, semester, lectureDay, courseCount, courseName);
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid input.");
                    break;
            }

            // Option to add new course
            System.out.print("Would you like to add a new course? (y/n): ");
            String addNewCourse = sc.nextLine();
            if (addNewCourse.equalsIgnoreCase("y") && courseCount < 100) {
                System.out.println("Enter details for the new course:");
                System.out.print("Course Name: ");
                courses[courseCount] = sc.nextLine();

                System.out.print("Credit Hours (SKS): ");
                credit[courseCount] = sc.nextInt();
                sc.nextLine();

                System.out.print("Semester (e.g., 1, 2, 3, etc.): ");
                semester[courseCount] = sc.nextLine();

                System.out.print("Lecture Day (e.g., Monday, Tuesday): ");
                lectureDay[courseCount] = sc.nextLine();

                courseCount++;
            }
        }
    }

    public static void displayAllCourses(String[] courses, int[] credit, String[] semester, String[] lectureDay, int courseCount) {
        System.out.println("\nAll Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("Course Name: " + courses[i]);
            System.out.println("Credit Hours: " + credit[i]);
            System.out.println("Semester: " + semester[i]);
            System.out.println("Lecture Day: " + lectureDay[i]);
            System.out.println("-----------------------------");
        }
    }

    public static void displayCoursesByDay(String[] courses, int[] credit, String[] semester, String[] lectureDay, int courseCount, String day) {
        boolean found = false;
        System.out.println("\nCourses scheduled on " + day + ":");
        for (int i = 0; i < courseCount; i++) {
            if (lectureDay[i].equalsIgnoreCase(day)) {
                System.out.println("Course Name: " + courses[i]);
                System.out.println("Credit Hours: " + credit[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Lecture Day: " + lectureDay[i]);
                System.out.println("-----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses found on " + day + ".");
        }
    }

    public static void displayCoursesBySemester(String[] courses, int[] credit, String[] semester, String[] lectureDay, int courseCount, int semesterNumber) {
        boolean found = false;
        System.out.println("\nCourses for Semester " + semesterNumber + ":");
        for (int i = 0; i < courseCount; i++) {
            if (Integer.parseInt(semester[i]) == semesterNumber) {
                System.out.println("Course Name: " + courses[i]);
                System.out.println("Credit Hours: " + credit[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Lecture Day: " + lectureDay[i]);
                System.out.println("-----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No courses found for Semester " + semesterNumber + ".");
        }
    }

    public static void searchCourse(String[] courses, int[] credit, String[] semester, String[] lectureDay, int courseCount, String courseName) {
        boolean found = false;
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equalsIgnoreCase(courseName)) {
                System.out.println("\nCourse Details for " + courseName + ":");
                System.out.println("Course Name: " + courses[i]);
                System.out.println("Credit Hours: " + credit[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Lecture Day: " + lectureDay[i]);
                System.out.println("-----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Course not found: " + courseName);
        }
    }
}
