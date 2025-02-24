public class Course7 {
    String courseID;
    String name;
    int credit;
    double hour;

    public Course7(){

    }

    public Course7 (String id, String name, int cred, double hour){
        courseID=id;
        this.name = name;
        credit=cred;
        this.hour=hour;
        
    }

    void print() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Hour: " + hour);
    }

    void changeCredit(int newCredit) {
        credit = newCredit;
    }

    void addHour(int addHours) {
        hour += addHours;
    }

    void reduceHour(int reduceHours){
        hour -= reduceHours;
    }

}
