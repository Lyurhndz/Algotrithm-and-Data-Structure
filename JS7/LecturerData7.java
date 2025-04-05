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

    //ADDITION FOR 7.5 ASSIG
    public int sequentialSearch(String searchName) {
        for (int i = 0; i < idx; i++) {
            if (listLecturer7s[i].name.equalsIgnoreCase(searchName)) {
                return i;
            }
        }
        return -1;
    }
    
    public void showSearchResults(String name) {
        int position = sequentialSearch(name);
        if (position != -1) {
            System.out.println("Found lecturer:");
            listLecturer7s[position].print();
        } else {
            System.out.println("Lecturer '" + name + "' not found");
        }
    }

    public int binarySearch(int searchAge) {
        bubbleSort(); 
        
        int left = 0;
        int right = idx - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listLecturer7s[mid].age == searchAge) {
                return mid;
            } else if (listLecturer7s[mid].age < searchAge) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public void showAllMatches(int age) {
        bubbleSort();
        boolean found = false;
        
        for (int i = 0; i < idx; i++) {
            if (listLecturer7s[i].age == age) {
                listLecturer7s[i].print();
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No lecturers found with age " + age);
        }
    }
}
