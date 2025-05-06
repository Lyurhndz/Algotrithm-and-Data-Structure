public class Course3 {
    String courseCode, courseName;
    int sks;

    public Course3(String coCode, String coName, int sks){
        courseCode=coCode;
        courseName=coName;
        this.sks=sks;
    }

    public void displayDataCourse(){
        System.out.println("Course Code: "+courseCode+" | Course Name: "+courseName+" | SKS: "+sks);
    }
}