public class LecturerData7 {
    public void showAllLecturerData(Lecturer7[] lecturerArray){
        for (Lecturer7 lecturer : lecturerArray) {
            lecturer.print();
            System.out.println();
        }
    }

    public void countLlecturerByGender(Lecturer7[] lecturerArray){
        int male = 0, female = 0;
        for (int i = 0; i < lecturerArray.length; i++) {
            if (lecturerArray[i].gender) {
                male++;
            }else {
                female++;
            }
        }
        System.out.println("Male Lecturer counts: "+male);
        System.out.println("Female Lecturer counts: "+female);
    }

    public void showOldestLecturerInfo (Lecturer7[] lecturerArray){
        int oldIndex= 0;
        for (int i = 0; i < lecturerArray.length; i++) {
            if (lecturerArray[i].age > lecturerArray[oldIndex].age) {
                oldIndex=i;
            }
        }
        System.out.println("Oldest Lecturer info: ");
        lecturerArray[oldIndex].print();
    }

    public void showYoungestLecturerInfo (Lecturer7[] lecturerArray){
        int youngIndex=0;
        for (int i = 0; i < lecturerArray.length; i++) {
            if (lecturerArray[i].age < lecturerArray[youngIndex].age) {
                youngIndex=i;
            }
        }
        System.out.println("Youngest Lecturer info: ");
        lecturerArray[youngIndex].print();
    }
}
