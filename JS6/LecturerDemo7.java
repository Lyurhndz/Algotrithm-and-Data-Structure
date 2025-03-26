public class LecturerDemo7 {
        public static void main(String[] args) {
            LecturerData7 lecturers = new LecturerData7(5);
    
            lecturers.add(new Lecturer7("2201", "Alice", false, 23));
            lecturers.add(new Lecturer7("2202", "Bob", true, 29));
            lecturers.add(new Lecturer7("2203", "Charlie", true, 35));
            lecturers.add(new Lecturer7("2204", "David", true, 49));
            lecturers.add(new Lecturer7("2205", "Eve", false, 27));
    
            System.out.println("Original lecturers list: ");
            lecturers.print();
    
            lecturers.bubbleSort();
            System.out.println("\nSorted lecturers list (by age, ascending) using Bubble Sort: ");
            lecturers.print();
    
            lecturers.insertionSort();
            System.out.println("\nSorted lecturers list (by age, descending) using Insertion Sort: ");
            lecturers.print();
    
        }
    }
