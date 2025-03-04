import java.util.Scanner;
public class LecturerDemo7 {
    Lecturer7 lecturerArray[] = new Lecturer7[3];

    public static void main(String[] args) {
        LecturerDemo7 lecturer1 = new LecturerDemo7();
        lecturer1.input();
        LecturerData7 lect1 = new LecturerData7();
        lect1.showAllLecturerData(lecturer1.lecturerArray);
        lect1.countLlecturerByGender(lecturer1.lecturerArray);
        lect1.showOldestLecturerInfo(lecturer1.lecturerArray);
        lect1.showYoungestLecturerInfo(lecturer1.lecturerArray);
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lecturerArray.length; i++) {
            System.out.print("Lecturer ID: ");
            String id = sc.nextLine();
            System.out.print("Lecturer Name: ");
            String name = sc.nextLine();
            System.out.print("Lecturer Age: ");
            int age = sc.nextInt();
            System.out.print("Lecturer Gender: ");
            boolean g = sc.nextBoolean();
            sc.nextLine();
            lecturerArray[i] = new Lecturer7(id, name, g, age);
        }
        sc.close();
    }
}
