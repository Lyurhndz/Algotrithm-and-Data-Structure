|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020138|
| Nama |  Devin Rianto |
| Kelas | TI - 1I |
| Repository |https://github.com/Lyurhndz/Algotrithm-and-Data-Structure/tree/main|

# Labs #5 Brute Force and Divide Conquer

## 5.2 Calculating Factorial Using Brute Force and Divide and Conquer Algorithms

The solution is implemented in Factorial7.java & FactorialMain.java, and below is screenshot of the result.

![image](https://github.com/user-attachments/assets/5e7cb42e-9385-4552-8f83-ca1cbc49405a)

**Brief explanaton:** There are 3 main step: 

*Factorial7.java:*
contain two methods to calculate factorial using Brute Force, which is a simple loop, and using Divide Conquer, 
which is recursive approach.

*FactorialMain.java*
1. Input a number as a base.
2. Creating object to use Factorial methods.
3. Print the result of the final calculation of factorial based from the inputted number using BF and DC methods.

**Questions:**
1. *if* is the base case where the recursion stop wher there no further division is needed.
   While *else* is where the function calls itself. The recursive step where the problem is divided into smalller
   subproblem until it reaches the base case.
2. Yes, it is possible

   ![image](https://github.com/user-attachments/assets/9f8b5f92-92f2-4f52-8a2b-af7254bb8fe4)
   
3. *facto = facto * i;* is used in the Brute Force method, multiplying numbers step by step in a loop.
   While *int facto = n * factorialDC(n-1);* s used in the Divide and Conquer method, breaking the problem into smaller parts using recursion.
4. factorialBF(): Uses a loop to calculate the factorial step by step.
   factorialDC(): Uses recursion to break the problem into smaller parts and solve them.


## 5.3 Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms

The solution is implemented in Power7.java & PowerMain.java, and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/f555cf1c-47b0-4611-9fe6-c7e8d9f9d4a1)

**Brief explanationn:** There are 3 main step:

*Power7.java:*
1. Initializes two integer variables (baseNumber and exponent).
2. Initializes parameterized constructor.
3. Set up two methods using Brute Force approach and Divide Conquer approach.

*PowerMain.java*
1. Input the element number. Give new value to index of the array.
2. Input base number and exponent however as much as the index of the array allow.
3. Print the result of the final calculation of exponentiation using BF and DC methods.

**Questions:**
1. powerBF(): Multiplies the base number by itself repeatedly using a loop.
   powerDC(): Breaks the problem into smaller parts using recursion, making it faster for large exponents.
2. Yes, there is. It's in the return line
   
   ![image](https://github.com/user-attachments/assets/2d907dec-9fc0-48c3-823d-41765f732a84)
   
3. Yes, it can use the class attributes. Here how it would work.
   
   ![image](https://github.com/user-attachments/assets/391a501a-1259-41df-88a7-498af2bc7bf3)
   
4. powerBF(): Multiplies the base number by itself repeatedly.
   powerDC(): Breaks the problem into smaller parts and combines the results, making it more efficient.

## 5.4 Calculating Array Sum Using Brute Fore and Divide and Conquer Algorithms

The solution is implemented in Sum7.java & SumMain.java and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/09cdffbe-0528-4e50-b53b-ecc4072dc57d)

**Brief explanationn:** There are 4 main step:

*Sum7.java:*
1. Initializes one double variable (profits).
2. Initializes parameterized constructor.
3. Set up two methods using Brute Force approach and Divide Conquer approach.

*SumMain.java*
1. Input the element number to set up how many profits values to enter.
2. Creating an object.
3. Input profits as many as inputted in the element number and store it in object.
4. Print the result of the final calculation of the total profits using BF and DC methods

**Questions:**
1. *mid* is being used to split the array into two halves, break the problem into smaller parts.
2. *double lsum = totalDC(arr, l, mid);*
   *double rsum = totalDC(arr, mid + 1, r);*
   These line is being used to calculate the sum of the left and right halves of the array separately.
3. Adding lsum and rsum combines the results of the two halves to get the total sum of the array.
4. The base case is when there’s only one element (l == r), and the method returns that element.
5. It splits the array into smaller parts, calculates the sum of each part, and combines the results to get the total sum.

## 5.5 Assignment

The solution is implemented in Student7.java & StudentMain.java and below is the screenshot of the result.

![image](https://github.com/user-attachments/assets/56babc7a-ea31-409c-a7cf-c097609ae735)
![image](https://github.com/user-attachments/assets/6e7d9818-9fac-44ac-819d-56c194acad7d)

