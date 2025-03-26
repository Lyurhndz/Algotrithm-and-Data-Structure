public class Student7 {
    String nim, name, studentClass;
    double gpa;

     public Student7(){

     }

     public Student7(String nim, String name, String studentClass, double gpa){
        this.nim=nim;
        this.name=name;
        this.studentClass=studentClass;
        this.gpa=gpa;
     }

     public void print(){
        System.out.println("NIM: "+nim+", Name: "+name+
        ", Class: "+studentClass+", GPA: "+gpa);
     }
}
