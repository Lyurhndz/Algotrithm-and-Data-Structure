public class Absence3 {
    Student3 student;
    Course3 course;
    int present, sick, permission, alpha;

    public Absence3(Student3 std, Course3 crs, int pres, int sick, int perm, int alpha){
        student=std;
        course=crs;
        present=pres;
        this.sick=sick;
        permission=perm;
        this.alpha=alpha;
        
    }

    public double CalculateAttendacePercentage(){
        double calc = (double)present/(present+permission+sick+alpha)*100;
        return calc;
    }

    public void displayDataAbsence(double calc){
        student.displayDataStd();
        course.displayDataCourse();
        System.out.println("Present: "+present+" | Sick: "+sick+" | Permission: "+permission+" | Alpha: "+alpha);
        System.out.printf("Attendance Percentage: %.2f%%\n", calc);
    }
}