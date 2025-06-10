public class BinaryTreeArray7 {
    Student7[] data;
    int idxLast;

    public BinaryTreeArray7() {
        data = new Student7[10];
        idxLast = -1;
    }

    void populateData(Student7[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
