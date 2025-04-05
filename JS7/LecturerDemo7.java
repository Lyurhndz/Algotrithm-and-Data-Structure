public class LecturerDemo7 {
    public static void main(String[] args) {
        LecturerData7 lecturers = new LecturerData7(5);
        
        lecturers.add(new Lecturer7("2201", "Alice", false, 23));
        lecturers.add(new Lecturer7("2202", "Bob", true, 29));
        lecturers.add(new Lecturer7("2203", "Charlie", true, 35));
        lecturers.add(new Lecturer7("2204", "David", true, 49));
        lecturers.add(new Lecturer7("2205", "Eve", false, 27));

        
        System.out.println("\n--- Sequential Search ---");
        lecturers.showSearchResults("bob");
        lecturers.showSearchResults("Unknown");

        System.out.println("\n--- Binary Search ---");
        System.out.println("Searching age 35:");
        lecturers.showAllMatches(35);
        
        System.out.println("\nSearching age 30:");
        lecturers.showAllMatches(30);
    }
}