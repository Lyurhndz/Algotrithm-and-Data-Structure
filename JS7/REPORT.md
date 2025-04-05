|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020138|
| Nama |  Devin Rianto |
| Kelas | TI - 1I |
| Repository |https://github.com/Lyurhndz/Algotrithm-and-Data-Structure/tree/main|

# Labs #7 Searching

## 7.2 Sequential Search Method

The solution is implemented in Students7.java, SearchStudent7.java & MainStudent7.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/5dcf9248-36f0-4e97-9b22-88e622f76069)
![image](https://github.com/user-attachments/assets/4807ddab-f00b-43a9-8f08-413587a8e374)
![image](https://github.com/user-attachments/assets/e93061f9-8d11-419c-b0fb-7789b0145ec4)

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
1. *showPosition* shows only the NIM and its index while *showData* shows all students details other than NIM if found.
2. There a break statement there to exit the loop immediately when the NIM is found.
3. No errors will occur and still works on any order but its make its potentionally run slower.
4. -1 is being used here as a 'not found' indicator because it's an invalid array index but no with 0 which is
   a valid array index. If the search fails, the method returns -1, determining that the student wasn't found.


## 7.3 Binary Search Method

The solution is implemented in Student7.java, SearchStudent7.java & MainStudent7.java, and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/a0d77f4b-eb5c-459e-890d-053b18ab6dae)

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
1. The program that runs the divide process
   
   ![image](https://github.com/user-attachments/assets/2ae1ce7c-2971-4003-9877-9907cc654d1d)

2. The program that runs the conquer process
   
   ![image](https://github.com/user-attachments/assets/8ad27fc4-b9a6-4fc0-9d97-af17cfbf2abf)

3. If the data isn't unsorted, it will give incorrect result.
   If the data is sorted with descending order, it will fail to find  the wanted data (20210),
   hence, modification needed:

   ![image](https://github.com/user-attachments/assets/4ff83770-1755-4b2d-a02b-f09fdfa28497)

4. Modify the program to make students amount inserted is matched with user input

   ![image](https://github.com/user-attachments/assets/3d7f31d1-c0ad-4ec3-84a1-7b4d551dc265)

## 7.4 Review Divide and Conquer

The solution is implemented in MergeSort7.java & SortMain7.java, and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/40c45f04-2b55-436c-bd7b-9f90e9c65dde)


## 7.5 Assignment

The solution is implemented in Lecturer7.java, LecturerData7.java & LecturerDemo7.java, and below is the screenshot of the result.


![image](https://github.com/user-attachments/assets/abc1eaf9-0796-4938-9cb9-b3ce15c5ea59)
![image](https://github.com/user-attachments/assets/9e68fa15-fa56-4872-bb93-fca4d317106f)
![image](https://github.com/user-attachments/assets/ce25e69d-9bfd-4b6e-bef7-6b4f448fee35)

