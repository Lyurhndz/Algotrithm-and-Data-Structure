public class Student7 {
    String nim, name, className;
    double gpa;

    public Student7() {
    }

    public Student7(String nm, String name, String cls, double gpa) {
        nim = nm;
        this.name = name;
        className = cls;
        this.gpa = gpa;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}