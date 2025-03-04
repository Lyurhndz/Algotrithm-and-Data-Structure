import java.util.Scanner;
public class LecturerDemo7 {
    Lecturer7 lecturerArray[] = new Lecturer7[3];
    
    public static void main(String[] args) {
        LecturerDemo7 demo16 = new LecturerDemo7();
        demo16.input();
        LecturerData7 data16 = new LecturerData7();
        data16.showAllLecturerData(demo16.lecturerArray);
        data16.countLecturersByGender(demo16.lecturerArray);
        data16.showOldestLecturerInfo(demo16.lecturerArray);
        data16.showYoungestLecturerInfo(demo16.lecturerArray);
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < lecturerArray.length; i++) {
            System.out.print("Lecturer ID: ");
            String id = sc.nextLine();
            System.out.print("Lecturer Name: ");
            String name = sc.nextLine();
            System.out.print("Lecturer Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Lecturer Gender: ");
            boolean gender = sc.nextBoolean();
            sc.nextLine();
            lecturerArray[i] = new Lecturer7(id, name, gender, age);
        }
    }
}
