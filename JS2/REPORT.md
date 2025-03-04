|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020138 |
| Nama | Devin Rianto |
| Kelas | TI - 1I |
| Repository |https://github.com/Lyurhndz/Algotrithm-and-Data-Structure/tree/main/JS2|

# Labs #2 Object

## 2.1 Declaring Classes, Attributes, and Methods

The solution is implemented in student7.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/30fa1c2c-7923-44b1-973c-adcd90ade7f3)

**Brief explanaton:** This is a Java class named Student7 that models a student with specific attributes and behaviors.

Key Components:

1. Attributes (Fields):
studentID: A String that stores the student's ID.
name: A String that stores the student's name.
className: A String representing the class the student is enrolled in.
gpa: A double that stores the student's Grade Point Average.

2. Constructors:
Default constructor (public Student7()): Initializes an empty object (doesn't set any values for fields).
Parameterized constructor (public Student7(String id, String name, String cls, double gpa)): Initializes the object with values passed as arguments.

3. Methods:
print(): Prints out the details of the student (ID, name, class, and GPA).
changeClass(String newClass): Updates the className attribute with the provided new class name.
evaluate(): Returns a string that evaluates the student's performance based on their GPA:
"Excellent" if GPA is 3.5 or higher.
"Good" if GPA is between 3.0 and 3.49.
"Fair" if GPA is between 2.0 and 2.99.
"Poor" if GPA is below 2.0.

QUESTION
1. Two Characteristics of a Class or Object:
Attributes (Fields): These are variables that store the state or data of an object. In the Student7 class, examples of attributes are studentID, name, className, and gpa.
Methods (Functions): These define the behavior or actions that can be performed on an object. In the Student7 class, examples of methods are print(), changeClass(), updateGPA(), and evaluate().

2. The Student7 class has 4 attributes:
studentID (type: String)
name (type: String)
className (type: String)
gpa (type: double)

3. The Student7 class has 4 methods:
print() — Displays the student’s details.
changeClass(String newClass) — Updates the student's class.
updateGPA(double newGPA) — Updates the student's GPA.
evaluate() — Returns a string that evaluates the student's performance based on the GPA.

4. ![image](https://github.com/user-attachments/assets/a7a643bc-1a5e-4c60-8890-6f6a00e3546f)

5. The evaluate() method categorizes the student's performance based on the GPA value and returns a corresponding string that represents the evaluation.

## 2.2 Object Instantiation and Accessing Attributes and Methods

The solution is implemented in studentMain.java, and below is the screenshot of result.

![image](https://github.com/user-attachments/assets/66e68de2-6009-4629-99f2-4a4c90a0d066)

**Brief Explanation:** This Java code defines a StudentMain class with a main method that demonstrates the use of another class called Student7. Here's a breakdown of the code:

1. Creating an Object which is student1 from the student class
2. Setting Student Properties, such as student ID, name, class ,and gpa
3. Printing Initial Information:
4. Changing Class, from 1I to 2I
5. Update the GPA 
6. Print Updated Information

QUESTION
1. Student7 student1 = new Student6(); . The name of the object is student1
2. To access attributes and method, need to do instantiation object if the variable is not static
3. Because the first output is the initial value for each attributes, while the second output is where the program output which attribute that has some change on their value.

## 2.3 Creating Constructor

The solution is implemented in studentMain.java, and below is the screenshot of result.

![image](https://github.com/user-attachments/assets/0c633f09-19f3-4db4-90e4-d9901b5e529e)

**Brief Explanation:** This Java program create an object with different kind of constructor.

1. Declare default constructor and parameterized constructor in student7.java
2. Match the parameters with the object's attributes in class
3. Create an object with matching constructor. student1 with a default constructor while student2 with the parameterized one.
4. Update the gpa and print method for student2

QUESTION
1. public Student(String id, String name, String cls, double gpa){
2. To create a new object using parameterized constructor
3. It will create an error becuase the first object can't run for its missing its constructor which is the default one.
4. No, because every object has the same methods, that’s why the object can still access whatever methods it wants because there no restriction or exclusivity.
5. ![image](https://github.com/user-attachments/assets/2d29fbb5-ccae-4b04-827c-f8dc4589ea0f)

## 2.4.1 Assignment 1

The solution is implemented in course7.java and courseMain.java, and below is the scrennshot of result.

**Class code**

![image](https://github.com/user-attachments/assets/f1ec6826-6bae-4fe1-94d4-93f612fa7f4e)

**Main Code**

![image](https://github.com/user-attachments/assets/76113236-a105-4065-b085-3d805d6a4ee4)

**Result**

![image](https://github.com/user-attachments/assets/5b21a0ec-a7e2-427d-aa10-59f6994017bd)


## 2.4.2 Assignment 2 

The solution is implemented in lecturer7.java and lecturerMain.java, and below is the screenshots of result.

**Class Code**

![image](https://github.com/user-attachments/assets/54b87129-7e23-4520-9f0b-57faf4d26e62)

**Main Code**

![image](https://github.com/user-attachments/assets/88050621-069e-4b0b-8545-9440872228f4)

**Result**

![image](https://github.com/user-attachments/assets/9b039a19-16fc-4e28-9f90-198c5b18db95)
