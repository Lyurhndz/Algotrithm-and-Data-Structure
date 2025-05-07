public class StudentAssignmentStack7 {
    Student7[] stack;
    int top, size;

    StudentAssignmentStack7(int size){
        this.size=size;
        top=-1;
        stack=new Student7[size];
    }

    boolean isFull(){
        if (top==size-1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty(){
        if (top==-1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Student7 std){
        if (!isFull()) {
            top++;
            stack[top]=std;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    Student7 pop(){
        if (!isEmpty()) {
            Student7 std =stack [top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in stack!");
            return null;
        }
    }

    Student7 peek(){
        if (!isEmpty()) {
            return stack [top];
        } else {
            System.out.println("There is no data in stack!");
            return null;
        }
    }

    void print(){
        for (int i = 0; i <=top; i++) {
            System.out.println(stack[i].nim+"\t"+stack[i].name+"\t"+stack[i].className);
        }
        System.out.println(" ");
    }

    public Student7 getFirst() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public int countAssignments() {
        return top + 1; 
    }

    String convertToBinary(int grade){
        ConversionStack stack = new ConversionStack();
        while (grade > 0) {
        int mod = grade % 2;
        stack.push(mod);
        grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
        binary += stack.pop();
        }
        return binary;
        }
        
}
