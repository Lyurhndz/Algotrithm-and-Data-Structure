public class LecturerMain {
    public static void main(String[] args) {

        Lecturer7 lecturer1 = new Lecturer7();
        lecturer1.lecturerID = "001";
        lecturer1.name = "Tia";
        lecturer1.status = true;
        lecturer1.startYear = 2015;
        lecturer1.expertiseField = "Math";
        lecturer1.print();
        lecturer1.setStatus(false);
        lecturer1.calcTenure(2020);
        lecturer1.changeExpertiseField("Machine");
        lecturer1.print();

        Lecturer7 lecturer2 = new Lecturer7("002", "Dono", false, 2012,"Tech" );
        lecturer2.setStatus(true);
        lecturer2.print();
    }
}
