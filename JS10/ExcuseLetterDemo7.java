import java.util.Scanner;

public class ExcuseLetterDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExcuseLetterStack7 letterStack = new ExcuseLetterStack7(10); // Capacity of 10 letters
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("5. Exit");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nStudent ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    System.out.print("Type of Excuse (S for Sick, I for Other): ");
                    char type = scan.nextLine().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    scan.nextLine(); // Consume newline

                    ExcuseLetter7 newLetter = new ExcuseLetter7(id, name, className, type, duration);
                    letterStack.push(newLetter);
                    System.out.println(name + "'s excuse letter has been submitted!");
                    break;

                case 2:
                    ExcuseLetter7 processed = letterStack.pop();
                    if (processed != null) {
                        System.out.println("\nProcessing excuse letter from " + processed.name);
                        System.out.println("Type: " + (processed.typeOfExcuse == 'S' ? "Sick" : "Other"));
                        System.out.println("Duration: " + processed.duration + " days");
                        System.out.println("Letter has been processed.");
                    }
                    break;

                case 3:
                    ExcuseLetter7 latest = letterStack.peek();
                    if (latest != null) {
                        System.out.println("\nLatest excuse letter:");
                        System.out.println("Name: " + latest.name);
                        System.out.println("Class: " + latest.className);
                        System.out.println("Type: " + (latest.typeOfExcuse == 'S' ? "Sick" : "Other"));
                        System.out.println("Duration: " + latest.duration + " days");
                    }
                    break;

                case 4:
                    System.out.print("\nEnter student name to search: ");
                    String searchName = scan.nextLine();
                    boolean found = letterStack.searchByName(searchName);
                    if (found) {
                        System.out.println(searchName + " has submitted an excuse letter.");
                    } else {
                        System.out.println("No excuse letter found for " + searchName);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scan.close();
    }
}