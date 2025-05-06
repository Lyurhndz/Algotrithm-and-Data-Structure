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

**Brief explanaton:** There are 3 main component: 

*Students7.java:*
1. Defines student attributes (NIM, age, name, GPA).
2. Provides a constructor to initialize student data.
3. Includes a display method to print student details.

*SearchStudent7.java:*
1. Manages an array of Students7 objects with a maximum capacity of 5.
2. Provides methods to:
   Add new students (checks if array is full)
   Display all student data
   Perform Sequential Search (linear search through array)
   Display search results (position and data)

*MainStudent7.java:*
1. Initializes two Scanner objects for user input.
2. Creates a SearchStudent7 object to manage student data.
3. Prompts user to input number of students and their details (NIM, name, age, GPA).
4. Displays all student data.
5. Searches for a student by NIM using both Sequential Search and Binary Search algorithms.
6. Displays search results including position and student details.

**Questions:**
1. *showPosition* shows only the NIM and its index while *showData* shows all students details other than NIM if found.
2. There a break statement there to exit the loop immediately when the NIM is found.
3. No errors will occur and still works on any order but its make its potentionally run slower.
4. -1 is being used here as a 'not found' indicator because it's an invalid array index but no with 0 which is a valid array index. If the search fails, the method returns -1, determining that the student wasn't found.


## 7.3 Binary Search Method

The solution is implemented in Student7.java, SearchStudent7.java & MainStudent7.java, and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/a0d77f4b-eb5c-459e-890d-053b18ab6dae)

**Brief explanationn:** There are additional function in SearchStudent7.java:

- Includes Binary Search implementation (modified for descending order):
   Recursively divides search range in half
   Compares middle element with target NIM
   Adjusts search range based on comparison
   Returns position if found, -1 if not found

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

**Brief explanationn:** There are 2 main components:

*MergeSort7.java:*
1. Create method to call sort() method.
2. Initializes and run run sort() to recursively splits the arrays into halves until single elements remain.
   Then call merge() method to merges the halves back in order.
3. Initializes and run merge() method to compare and merge two sorted halves. Then, place smaller numbers      first before copies any remaining element.
4. Create printArray() method to print the array elements.

*SortMain7.java:*
1. Creates an unsorted array.
2. Initializes the MergeSort7 sorter.
3. Print the original array. Proceed to call mergeSort() to sort the array.
4. Prints the final sorted array.

   
## 7.5 Assignment

The solution is implemented in Lecturer7.java, LecturerData7.java & LecturerDemo7.java, and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/abc1eaf9-0796-4938-9cb9-b3ce15c5ea59)
![image](https://github.com/user-attachments/assets/9e68fa15-fa56-4872-bb93-fca4d317106f)
![image](https://github.com/user-attachments/assets/ce25e69d-9bfd-4b6e-bef7-6b4f448fee35)

