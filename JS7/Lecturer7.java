public class Lecturer7 {
    String id, name;
    boolean gender;
    int age;

    public Lecturer7(){}
    
    public Lecturer7(String id, String name, boolean gender, int age){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void print(){
        System.out.println("ID: "+id+", Name: "+name+
        ", Gender: "+gender+", Age: "+age);
    }
}
