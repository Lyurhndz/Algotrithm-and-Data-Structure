|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020138 |
| Nama | Devin Rianto |
| Kelas | TI - 1I |
| Repository | https://github.com/Lyurhndz/Algotrithm-and-Data-Structure/tree/main/JS1 |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in js1.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/569bc1cc-3e2a-4888-a362-483d3fd499c8)


**Brief explanaton:** This Java program calculates the final grade of a student based on four different scores: Assignment, Quiz, Mid-term, and Final-term. Here's a brief explanation:

Input:
The program first asks the user to input the four scores.
These scores are stored as integers (assig, quiz, mid, fin).

Validation:
It checks if any of the scores are negative or exceed 100. If so, it prints "Invalid grade" and exits.
Final Score Calculation:
If the grades are valid, it calculates the final score using weighted averages:
Assignment (20%)
Quiz (20%)
Mid-term (30%)
Final-term (30%)
The formula for the final score is:
finalscore = (assig * 0.20) + (quiz * 0.20) + (mid * 0.30) + (fin * 0.30)

Letter Grade Assignment:
Based on the final score, the program assigns a letter grade:
A: 80-100
B+: 73-80
B: 65-73
C+: 60-65
C: 50-60
D: 39-50
E: Below 39

Pass/Fail:
The program checks if the final score is above 50, which means the student passed. If so, it prints a congratulatory message, otherwise, it indicates failure.
Output:

The program prints the final score, the letter grade, and whether the student passed or failed.
This program essentially helps determine the student's grade and whether they have passed based on their individual scores.


## 2.2.1. Looping Solution

The solution is implemented in js1.java, and below is the screenshot of result.

![image](https://github.com/user-attachments/assets/97a79cad-8be9-4f54-a2ca-870f758a8ed8)

**Brief Explanation:** This Java program takes a student's NIM (a unique identification number) as input, extracts the last two digits, and uses these digits to control how many times it prints certain values.

Here’s a breakdown of the code:

Input:
The program prompts the user to enter their NIM (a string).
It then extracts the last two digits of the NIM using nim.substring(nim.length() - 2), converting that substring to an integer (n).
Processing the last two digits:
The last two digits (n) are used to control the loop that will print output.
If n is less than 10, it adds 10 to it to ensure the loop runs at least 10 times.

Loop:
A for loop runs from 1 to n (inclusive). It prints either an asterisk * or a number depending on whether the loop counter is odd or even.
Specifically:
If the counter i is odd, it prints an asterisk (*).
If the counter i is even, it prints the number i.
The program skips printing when i is 6 or 10 using the continue statement.

Output:
The program prints a sequence of asterisks and numbers based on the extracted digits of the NIM.
Example: If the last two digits of the NIM are 07, the loop runs 17 times (7 + 10), skipping 6 and 10 and alternating between printing * and numbers, except for 6 and 10.

## 2.3.1 Array Solution 

The solution is implemented in js1.java, and below is the screenshot of result.

![image](https://github.com/user-attachments/assets/f85b0008-f5c5-463d-becc-f945cb05212b)

**Brief Explanation:** This Java program calculates the GPA (Grade Point Average) for a student based on the grades of several courses. Here's a breakdown of the code:

Course Information Setup:
The program defines arrays to store:
course: Names of 8 courses.
sks: Credit hours for each course.
grades: User input grades for each course (initialized as an empty array).
lettergrades: The letter grade assigned to each course based on the score.
valueWeight: The numeric value of each letter grade used to calculate the GPA.

Input:
The program prompts the user to input the score for each course.
These scores are stored in the grades array.

Grade Conversion:
For each score in the grades array:
It determines the corresponding letter grade (A, B+, B, etc.) based on the score range.
It assigns a numeric value (value weight) to each letter grade.

GPA Calculation:
The program calculates the weighted sum of the value weights multiplied by the corresponding credit hours (sks[i]).
It also calculates the total number of credit hours.
The final GPA is calculated as the sum of the weighted values divided by the total credit hours.

Output:
It prints the results in a formatted table displaying:
The course name, score, letter grade, and the corresponding value weight.
Finally, it prints the calculated GPA (IP) rounded to two decimal places.

## 2.4.1 Function Solution

The solution is implemented in js1.java, and below is the scrennshot of result.

![image](https://github.com/user-attachments/assets/50f0b9e3-6991-4621-b260-6e7679ee972c)

**Brief Explanation:** This Java program performs operations related to stock management for four branches. Here's a breakdown of the code:

1. Stock Data:
The stocks 2D array represents the number of stocks for different products in four branches. Each row corresponds to a branch, and each column corresponds to a different product.
For example, stocks[0] represents the stock quantities for branch 1 across different products.
The price array holds the prices of these products.

3. Methods:
displayIncome Method:
This method calculates the total income for each branch by multiplying the stock of each product by its price and summing them up.
It loops through each branch (stocks.length), and for each branch, it loops through each product (stocks[i].length) to compute the total income.
It prints the total income for each branch.

displayChangeBranch4 Method:
This method modifies the stock in branch 4 based on a fixed change defined in the changeStock array.
For each product in branch 4 (stocks[3]), it subtracts the corresponding value from changeStock[] and updates the stock.
It prints the new stock quantity for each product in branch 4 after the change.

3. Flow of Execution:
displayIncome(stocks, price) is called to display the income for each branch based on the product prices and stock quantities.
displayChangeBranch4(stocks) is called to adjust and display the new stock values for branch 4.

## 3.1.1 Assignment 1 Solution

The solution is implemented in assigJS1.java, and below is the screenshots of result.

![image](https://github.com/user-attachments/assets/81475b63-b1ae-475c-8fbf-7997774ec29f)
![image](https://github.com/user-attachments/assets/71cd7d7c-e065-4357-bb7f-0cd72ac0714a)
![image](https://github.com/user-attachments/assets/e0364245-59e4-44ce-9854-6b9832c670d5)

**Brief Explanation:** This Java program maps a vehicle's plate code (a single character) to a corresponding city name based on a predefined set of plate codes. Here’s a breakdown of the program:

Plate Codes and Cities:
The plate array holds the possible plate codes ('A', 'B', 'D', etc.).
The city 2D array holds the corresponding city names for each plate code:
For example, plate[0] ('A') corresponds to the city name "BANTEN".
plate[1] ('B') corresponds to the city name "JAKARTA", and so on.

Program Execution:
The program first prints out the available plate codes.
It then asks the user to input a plate code.
The input is stored as a char (the first character input by the user).

City Lookup:
The program checks if the entered plate code exists in the plate array.
If a valid plate code is entered:
It loops through the city array to find the city corresponding to that plate code and prints it.
If the plate code is not found in the plate array, it prints "Invalid Plate Code."

## 3.2.1 Assignment 2 Solution

The solution is implemented in assigJS1.java, and below is the screenshot of result.

![image](https://github.com/user-attachments/assets/7031a159-9588-48be-8538-84856808ff7f)

**Brief Explanation:** This Java program calculates and displays the volume, surface area, and perimeter of a cube based on the length of its side provided by the user. Here's a breakdown:

User Input:
The program prompts the user to input the side length of the cube using System.out.print("Input the side of the cube: ").
The entered value is stored in the variable side.

Methods:
The program uses three methods to calculate the properties of the cube:
volume(int side):
This method calculates the volume of the cube using the formula:
Volume = side³.
It returns the calculated volume.

surfaceArea(int side):
This method calculates the surface area of the cube using the formula:
Surface Area = 6 × side² (since the cube has 6 faces, and each face is a square).
It returns the calculated surface area.

perimeter(int side):
This method calculates the perimeter of the cube by summing the lengths of all the edges. Since a cube has 12 edges, each of length side, the formula is:
Perimeter = 12 × side.
It returns the calculated perimeter.

Output:
The program prints out the following:
The volume of the cube.
The surface area of the cube.
The perimeter of the cube.

##  3.3.1 Assignment 3 Solution

The solution is implemented in assigJS1.java, and below is the screenshots of result.
![image](https://github.com/user-attachments/assets/eb86baea-05b7-4b99-81fc-0023ff154b2f)
![image](https://github.com/user-attachments/assets/ec0f84f8-5b06-4500-8685-dc4cb38c3566)
![image](https://github.com/user-attachments/assets/cf048724-f110-4b63-a090-7b6c4261e5ba)
![image](https://github.com/user-attachments/assets/0de7498c-959d-486f-b611-44c30747eedf)

**Brief Explanation:** This Java program manages a list of courses and allows the user to perform various operations like displaying courses, filtering by semester or lecture day, and searching for a specific course. Here's a brief overview:

Data Storage:
Arrays store course names, credit hours, semester numbers, and lecture days.

Menu Options:
The user is presented with a menu to:
Display all courses.
Display courses for a specific day.
Display courses for a specific semester.
Search for a course.
Exit.

Course Operations:
After selecting an option, the user can add new courses or perform the chosen action (display, search, etc.).
Courses are stored up to a maximum of 100, and details like course name, credit hours, semester, and lecture day are gathered from the user.
Helper Methods:

displayAllCourses(): Shows all course details.
displayCoursesByDay(): Displays courses for a specific lecture day.
displayCoursesBySemester(): Displays courses for a specific semester.
searchCourse(): Searches for a specific course by name and shows its details.

The program lets users manage and query courses, adding new courses and filtering/displaying existing ones based on day, semester, or name.




