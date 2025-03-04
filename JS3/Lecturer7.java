public class Lecturer7 {
    String lecturerID, name;
    Boolean gender;
    int age;

    public Lecturer7 () {}

    public Lecturer7 (String id, String name, boolean g, int age){
        this.lecturerID = id;
        this.name = name;
        this.gender = g;
        this.age = age;
    }

    public void print () {
        System.out.println("Lecturer ID: "+lecturerID);
        System.out.println("Name: "+name);
        System.out.println("Gender: "+(gender ? "Male" : "Female"));
        System.out.println("Age: "+age);
    }
}


