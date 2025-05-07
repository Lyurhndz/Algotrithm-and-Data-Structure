|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020138|
| Nama |  Devin Rianto |
| Kelas | TI - 1I |
| Repository |https://github.com/Lyurhndz/Algotrithm-and-Data-Structure/tree/main|

# Labs #10 Stack

## 2.1 Student Assignment Stack

The solution is implemented in Students7.java, StudentAssignmentStack7.java & StudentDemo7.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/38df6471-764d-4a9c-8e36-ccd47045d10b)
![image](https://github.com/user-attachments/assets/2a75eb06-d4e2-4a80-9443-2f6da359343e)
![image](https://github.com/user-attachments/assets/8c9f84e2-0b94-4c66-a7fb-7b8560561502)

**Brief explanaton:** There are 3 main component: 

*Students7.java:*
1. Defines student attributes: nim (Student ID), name, className, and grade (default: -1 for ungraded).
2. Constructor: Initializes nim, name, and className; sets grade to -1.
3. grading(int grade) method: Updates the student’s grade when called (e.g., student.grading(85)).

*StudentAssignmentStack7.java:*
1. Stack initialization: Declares a stack array of Student7 objects, top pointer, and size.
2. Constructor:Sets stack size and initializes top to -1 (empty stack).
3. Helper methods: isFull()/isEmpty(): Check stack capacity.
4. Core stack operations:
    push(Student7): Adds a student to the top (if not full).
    pop(): Removes/returns the top student (for grading).
    peek(): Views the top student without removal.
    print(): Displays all assignments (NIM, name, class).

*MainStudent7.java:*
1. Initialization: Creates a stack (size = 5) and Scanner for user input.
2. Menu-driven loop:
    Option 1 (Collect): Takes student details (name, NIM, class), creates a Student7 object, and push()es to stack.
    Option 2 (Grade): pop()s the top student, inputs a grade (0–100), and updates via grading().
    Option 3 (View Top): peek()s to display the last submitted assignment.
    Option 4 (List All): Calls print() to show all submissions in stack order (top to bottom).
3. Termination: Exits loop on invalid input (choice < 1 or > 4).

**Questions:**
1. The stack data structure is used in the assignment management system to implement the Last-In-First-Out (LIFO) principle.
2. *push()* is being used to adds a new assignment to the top of the stack while *pop()* is being used to removes and returns the top assignment.
3. *isFull()* is important to ensures the stack doesn't exceed its capacity. if it removed, it will cause ArrayIndexOutOfBoundsException error when the stack is full.
4. *StudentAssignmentStack stack = new StudentAssignmentStack(5);*
   Based from this line, we can conclude that the size is 5;
5. Modification to show first submission

   ![image](https://github.com/user-attachments/assets/3bae318a-89e7-47da-ab95-94127f6af2e2)
   ![image](https://github.com/user-attachments/assets/7b2fc354-435a-465e-b51a-04e845e2ad1e)

6. Method to count assignments:

   ![image](https://github.com/user-attachments/assets/68d0df72-37ee-4da2-83fb-3578e79ae0b7)
   ![image](https://github.com/user-attachments/assets/d4712aef-0429-4247-b944-6854f32e3d33)

7. Key Learnings:
        Stacks enforce sequential processing (LIFO).
        Useful for undo mechanisms (e.g., Ctrl+Z) or backtracking (e.g., browser history).
   Real-World Use Case:
        Call Stack in Programming: Tracks function calls (most recent function is executed first).
        Document Versioning: Latest edits are processed first when reverting changes.

 
## 2.2 Add Convert To Binary Method

The solution is implemented in Students7.java, StudentAssignmentStack7.java, ConversionStack.java & StudentDemo7.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/aa21011c-8e46-42d3-9a9d-98e2f2463083)

**Brief explanationn:** There are additional functions and files:

*ConversionStack.java*
Handles binary conversion of grades using a stack.

*StudentAssignmentStack7.java*
Additions:
convertToBinary(int grade): Converts grades to binary using ConversionStack.

*StudentDemo7.java*
Addition:
Display binary equivalent of the inputted grade in case 2 (grade assignments)

**Questions:**
1. Workflow of convertToBinary()
     -Takes an integer grade (e.g., 85).
     -Uses a temporary stack to store remainders of division by 2.
     -Pops remainders to construct the binary string (1010101 for 85).
2. The code still run because grade>0 and grade !=0 are equivalent because grade is always postive. But for negative grades, it would cause an infinite loop (not applicable in this case).

 
## 2.4 Assignment

The solution is implemented in ExcuseLetter7.java, ExcuseLetterStack7.java & ExcuseLetterDemo7.java, and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/27db0652-439a-4fd6-95db-bc9213d3308a)
![image](https://github.com/user-attachments/assets/77dea930-ff4b-4f54-aad7-f91a6c43bddb)
![image](https://github.com/user-attachments/assets/afa0b44e-ca2c-4933-9dd4-a2c7c76ada08)
![image](https://github.com/user-attachments/assets/1e4b7751-2c0b-4a40-be7d-bba2d3b3e3e7)
![image](https://github.com/user-attachments/assets/0477a8f0-1290-499c-b25e-79eb69d9302a)
