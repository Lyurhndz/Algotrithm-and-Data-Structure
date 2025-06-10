public class BinaryTreeArrayMain7 {
    public static void main(String[] args) {
        BinaryTreeArray7 bta = new BinaryTreeArray7();
        Student7 m1 = new Student7("244107020138", "Devin", "TI-1I", 3.57);
        Student7 m2 = new Student7("244107020023", "Dewi", "TI-1I", 3.85);
        Student7 m3 = new Student7("244107020225", "Wahyu", "TI-1I", 3.21);
        Student7 m4 = new Student7("244107020076", "Angelina", "TI-1I", 3.54);
        Student7 m5 = new Student7("244107020223", "Andhika", "TI-1I", 3.72);
        Student7 m6 = new Student7("244107020226", "Bima", "TI-1I", 3.37);
        Student7 m7 = new Student7("244107020181", "Eiyu", "TI-1I", 3.46);
        Student7[] data = { m1, m2, m3, m4, m5, m6, m7 };
        bta.populateData(data, data.length - 1);
        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);
    }

}
