public class DoubleLinkedListsMain7 {
    public static void main(String[] args) {
        DoubleLinkedLists7 dll = new DoubleLinkedLists7();
        dll.print();
        dll.addFirst(new Student7("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student7("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student7("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student7("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student7("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student7("116", "Eiyu", "TI-1I", 3.4));
        dll.print();

        // ADDITION FOR EXP. 2
        System.out.println("ADDITION\n");
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();
    }
}
