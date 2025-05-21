public class Student7 {
    String nim, name, className;
    double gpa;

    public Student7() {
    }

    public Student7(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }

}