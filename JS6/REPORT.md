|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020138|
| Nama |  Devin Rianto |
| Kelas | TI - 1I |
| Repository |https://github.com/Lyurhndz/Algotrithm-and-Data-Structure/tree/main|

# Labs #6 Sorting (Bubble, Selection, dan Insertion Sort)

## 6.2 Implementing Sorting Using Object (Bubble, Selection, dan Insertion)

The solution is implemented in Sorting7.java & SortingMain7.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/1596534b-1ace-40ef-830d-ff3fa3c3332f)

**Brief explanaton:** There are 3 main step: 

*Sorting7.java:*
1. Initialized two integer variables (integer array data and integer size).
2. Initialized a parameterized constructor.
3. Creating methods for sorting.
   a. Bubble Sort:
      Compares adjacent elements and swaps them if they're in the wrong order.
      Then proceed to repeats the process until the entire array is sorted.
   b. Selection Sort:
      Finds the smallest element in the unsorted portion and swaps it with the first unsorted element.
   c. Insertion Sort:
      Builds a sorted array one element at a time by inserting each element into its correct position.
4. Create method to print.

*SortingMain7.java:*
1. Initialize Array
2. Create Sorting object
3. Test each Sorting algorithm

**Questions:**
1. Swaps adjacent elements if out of order *(data[j] > data[j + 1])* , moving larger values to the right.
2. Program code that implements the minimum value search algorithm in SelectionSort():
             *int minIndex=i;
              for (int j = i+1; j < size; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex=j;
                }*
  
3. *while (j >= 0 && data[j] > key)* shifts elements right until key finds its correct spot.
4. *data[j + 1] = data[j]* moves elements right to make space for key.


## 6.3 Sorting Using an Array Of Objects

The solution is implemented in Student7.java, TopStudents7.java & StudentDemo7.java, and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/9ff600e4-c917-4223-a063-c6272ae83a05)

**Brief explanationn:** There are 3 main step:

*Student7.java:*
1. Initializes specific data type for each variables, declare the class attributes.
2. Initiliazies default and parameterized constructor.
3. Create method to print
 
*PowerMain.java:*
1. Initializes array.
2. Initializes tracking index.
3. Create method add to inputs new student object into the array.
4. Create method print to display all stored students.
5. Create methods of Sorting algorithm:
   a. bubbleSort(): Descending order by GPA (swaps adjacent elements).
   b. selectionSort(): Ascending order by GPA (selects minimum elements).
   c. insertionSort(): Ascending order by GPA (builds sorted subarray).

*StudentDemo7.java:*
1. Instantiate TopStudents7 objects.
2. Create 5 students records.
3. Display original list of the student array based by GPA.
4. Display a sorted result by Bubble Sort in descending order.
5. Display a sorted result by Selection Sort in ascending order.
6. Display a sorted result by Insertion Sort in ascending order.

**Questions:**
1Loop Conditions
  a. *i < idx - 1*: Ensures n-1 passes (max needed for sorting).
  b. *j < idx - i - 1*: Avoids comparing already sorted elements.
  c. 50 elements: 49 passes, 49 stages.
2. Here is the modification to allow dynamic student data input from keyboard
   ![image](https://github.com/user-attachments/assets/54ff789c-7085-4adc-bca6-5ba029f300aa)

3. Finds the smallest GPA in the unsorted portion (i + 1 to end) and swaps it with listStudents[i].
4. Modify InsertionSort() to perform descending sorting
           *public void insertionSort(){
            for (int i = 1; i < idx; i++) {
                Student7 temp = listStudent7s[i];
                int j = i;
                while (j > 0 && listStudent7s[j-1].gpa> temp.gpa) {
                    listStudent7s[j] = listStudent7s[j-1];
                    j--;
                }
                listStudent7s[j]=temp;
            }
        }*


## 6.4 Assignment

The solution is implemented in Lecturer7.java, LecturerData7.java & LecturerDemo7.java, and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/c3debbb6-0c6d-4393-ae87-bc4711d07d85)
![image](https://github.com/user-attachments/assets/e46418dc-ccf3-4f7a-b11a-f4e85f51cb68)
![image](https://github.com/user-attachments/assets/1aea5952-7986-481e-902e-a973b597d2c3)
![image](https://github.com/user-attachments/assets/e0e62696-fb28-474a-89e7-eaeca1adee02)
