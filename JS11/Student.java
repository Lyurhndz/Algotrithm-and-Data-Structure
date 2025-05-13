public class Student {
    String nim;
    String name;
    String studyProgram;
    String className;
    boolean isApproved;

    public Student(String nim, String name, String studyProgram, String className) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
        this.isApproved = false;
    }

    public void print() {
        System.out.println(nim + " - " + name + " - " + studyProgram + " - " + className + 
                         " - Approval: " + (isApproved ? "Approved" : "Pending"));
    }

    public void approve() {
        this.isApproved = true;
    }
}