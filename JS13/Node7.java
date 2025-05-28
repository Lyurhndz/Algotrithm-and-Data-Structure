public class Node7 {
    Student7 data;
    Node7 prev, next;

    Node7() {
    }

    Node7(Student7 data) {
        this.data = data;
        prev = null;
        next = null;
    }

    Node7(Node7 prev, Student7 data, Node7 next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
