public class SortingMain7 {
    public static void main(String[] args) {
        int[] a = { 34, 7, 23, 32, 5, 62 };
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};

        Sorting7 sorting = new Sorting7(a);
        Sorting7 sorting2 = new Sorting7(b);
        Sorting7 sorting3 = new Sorting7(c);
 
        System.out.println("original Array: ");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted Array (Bubble Sort): ");
        sorting.print(); 

        System.out.println("\nOriginal array: ");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort): ");
        sorting2.print();

        System.out.println("\nOriginal array: ");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort): ");
        sorting3.print();
    }
}
