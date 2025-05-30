public class SortMain7 {
    public static void main(String[] args) {
        // Initialize data (matches jobsheet example)
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        
        MergeSort7 sorter = new MergeSort7();
        
        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data:");
        sorter.printArray(data);
        
        // Sort the data
        sorter.mergeSort(data);
        
        System.out.println("Sorted Data:");
        sorter.printArray(data);
    }
}