public class LecturerData7 {
    Lecturer7[] listLecturer7s;
    int idx;

    public LecturerData7 (int size){
        listLecturer7s = new Lecturer7[size];
        idx=0;
    }

    public void add(Lecturer7 dsn){
        if (idx < listLecturer7s.length) {
            listLecturer7s[idx]=dsn;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print(){
        for (int i = 0; i < idx; i++) {
            listLecturer7s[i].print();
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 0; j < idx-i-1; j++) {
                if (listLecturer7s[j].age>listLecturer7s[j+1].age) {
                    Lecturer7 temp = listLecturer7s[j];
                    listLecturer7s [j] = listLecturer7s [j+1];
                    listLecturer7s [j+1]=temp;
                }
            }
        }
    }

    public void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Lecturer7 temp = listLecturer7s[i];
            int j = i;
            while (j > 0 && listLecturer7s[j-1].age< temp.age) {
                listLecturer7s[j] = listLecturer7s[j-1];
                j--;
            }
            listLecturer7s[j]=temp;
        }
    }
}
