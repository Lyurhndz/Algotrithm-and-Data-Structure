public class Lecturer7 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer7(){

    }

    public Lecturer7 (String id, String name, boolean stat, int strYear, String expF){
        lecturerID=id;
        this.name = name;
        status=stat;
        startYear=strYear;
        expertiseField=expF;

    }

    void print() {
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Status: " + status);
        System.out.println("Start Year: " + startYear);
        System.out.println("Expertise Field: "+expertiseField);
    }

    void setStatus(boolean newStatus) {
        status = newStatus;
    }

    void calcTenure(int tenure) {
        tenure = 2025 - startYear;
    }

    void changeExpertiseField(String newField){
        expertiseField = newField;
    }

}
