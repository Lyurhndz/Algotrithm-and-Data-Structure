public class ExcuseLetterStack7 {
    private ExcuseLetter7[] stack;
    private int top;
    private int size;

    // Constructor
    public ExcuseLetterStack7(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new ExcuseLetter7[size];
    }

    // Check if stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Push operation
    public void push(ExcuseLetter7 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
        } else {
            System.out.println("Stack is full! Cannot add more excuse letters.");
        }
    }

    // Pop operation
    public ExcuseLetter7 pop() {
        if (!isEmpty()) {
            ExcuseLetter7 letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("Stack is empty! No letters to process.");
            return null;
        }
    }

    // Peek operation
    public ExcuseLetter7 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is empty! No letters to view.");
            return null;
        }
    }

    // Search for a letter by student name
    public boolean searchByName(String name) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Print all letters (for debugging)
    public void printAll() {
        System.out.println("All Excuse Letters:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].name + " - " + 
                             (stack[i].typeOfExcuse == 'S' ? "Sick" : "Other") + 
                             " - " + stack[i].duration + " days");
        }
    }
}