public class Operation3 {
    Absence3[] listAbsence3s;
    int idx;

    public Operation3(int size){
        listAbsence3s=new Absence3[size];
        idx=0;
    }

    public void addAbsence(Absence3 absence) {
        if (idx < listAbsence3s.length) {
            listAbsence3s[idx++] = absence;
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 0; j < idx-i-1; j++) {
                if (listAbsence3s[j].CalculateAttendacePercentage()<listAbsence3s[j+1].CalculateAttendacePercentage()) {
                    Absence3 temp = listAbsence3s[j];
                    listAbsence3s[j] = listAbsence3s[j+1];
                    listAbsence3s[j+1]=temp;
                }
            }
        }
    }

    public int sequentialSearch(String searchNim, int startFrom) { //1 loop cukup
        for (int i = startFrom; i < idx; i++) {
            if (listAbsence3s[i].student.nim.equalsIgnoreCase(searchNim)) {
                return i;
            }
        }
        return -1;
    }
    
    public int sequentialSearch(String searchNim) {
        return sequentialSearch(searchNim, 0);
    }
}