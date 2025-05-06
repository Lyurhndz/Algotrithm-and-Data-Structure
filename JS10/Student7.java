public class Student7 {
    String nim, name, className;
    int grade;

    public Student7(String nim, String name, String className){
        this.nim=nim;
        this.name=name;
        this.className=className;
        this.grade=-1;
    }

    void grading (int grade){
        this.grade=grade;
    }
}