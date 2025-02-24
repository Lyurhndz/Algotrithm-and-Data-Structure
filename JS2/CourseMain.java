public class CourseMain {
    public static void main(String[] args) {

        Course7 course1 = new Course7();
        course1.courseID = "001";
        course1.name = "AaDS";
        course1.credit = 2;
        course1.hour = 4;
        course1.print();
        course1.changeCredit(3);
        course1.addHour(2);
        course1.reduceHour(1);
        course1.print();

        Course7 course2 = new Course7("002", "AaDS Prac.", 3, 6);
        course2.addHour(2);
        course2.print();
    }
}
