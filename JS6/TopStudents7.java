public class TopStudents7 {
        Student7[] listStudent7s;
        int idx,student;

        public TopStudents7(int size){
            listStudent7s=new Student7[size];
            idx = 0;
        }

        public void add(Student7 student){
            if (idx < listStudent7s.length) {
                listStudent7s[idx]=student;
                idx++;
            } else {
                System.out.println("List is full!");
            }
        }

        public void print(){
            for (int i = 0; i < idx; i++) {
                listStudent7s[i].print();
            }
        }

        public void bubbleSort(){
            for (int i = 0; i < idx-1; i++) {
                for (int j = 0; j < idx-i-1; j++) {
                    if (listStudent7s[j].gpa<listStudent7s[j+1].gpa) {
                        Student7 temp = listStudent7s[j];
                        listStudent7s[j] = listStudent7s[j+1];
                        listStudent7s[j+1]=temp;
                    }
                }
            }
        }

        public void selectionSort(){
            for (int i = 0; i < idx - 1; i++) {
                int minIndex=i;
                for (int j = i+1; j < idx; j++) {
                    if (listStudent7s[j].gpa < listStudent7s[minIndex].gpa) {
                        minIndex=j;
                    }
                }
                Student7 temp = listStudent7s[minIndex];
                listStudent7s[minIndex]=listStudent7s[i];
                listStudent7s[i]=temp;
            }
        }

        public void insertionSort(){
            for (int i = 1; i < idx; i++) {
                Student7 temp = listStudent7s[i];
                int j = i;
                while (j > 0 && listStudent7s[j-1].gpa> temp.gpa) {
                    listStudent7s[j] = listStudent7s[j-1];
                    j--;
                }
                listStudent7s[j]=temp;
            }
        }
    }