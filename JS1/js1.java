import java.util.Scanner;

//SELECTION
// public class js1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Program to Calculate the Final Grade");
//         System.out.println("====================================");
//         System.out.print("Input the Assignment score: ");
//         int assig = sc.nextInt();
//         System.out.print("Input the Quiz score: ");
//         int quiz = sc.nextInt();
//         System.out.print("Input the Mid-term score: ");
//         int mid = sc.nextInt();
//         System.out.print("Input the Final-term score: ");
//         int fin = sc.nextInt();
//         System.out.println("====================================");
//         System.out.println("====================================");
//         if (assig < 0 || quiz < 0 || mid < 0 || fin < 0
//                 || assig > 100 || quiz > 100 || mid > 100 || fin > 100) {
//             System.out.println("Invalid grade");
//             System.out.println("====================================");
//             System.out.println("====================================");
//         } else {
//             double finalscore = (assig * 0.20) + (quiz * 0.20) + (mid * 0.30) + (fin * 0.30);
//             System.out.println(finalscore);

//             if (finalscore > 80 && finalscore <= 100) {
//                 System.out.println("Letter Grade: A");
//             } else if (finalscore > 73 && finalscore <= 80) {
//                 System.out.println("Letter Grade: B+");
//             } else if (finalscore > 65 && finalscore <= 73) {
//                 System.out.println("Letter Grade: B");
//             } else if (finalscore > 60 && finalscore <= 65) {
//                 System.out.println("Letter Grade: C+");
//             } else if (finalscore > 50 && finalscore <= 60) {
//                 System.out.println("Letter Grade: C");
//             } else if (finalscore > 39 && finalscore <= 50) {
//                 System.out.println("Letter Grade: D");
//             } else {
//                 System.out.println("Letter Grade: E");
//             }

//             System.out.println("====================================");
//             if (finalscore > 50) {
//                 System.out.println("CONGRATULATIONS! YOU PASSED!");
//             } else {
//                 System.out.println("YOU FAILED.");
//             }
//         }
//     }
// }

// LOOPING
// public class js1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your NIM: ");
//         String nim = scanner.nextLine();

//         int n = Integer.parseInt(nim.substring(nim.length() - 2));

//         if (n < 10) {
//             n += 10;
//         }

//         for (int i = 1; i <= n; i++) {
//             if (i == 6 || i == 10) {
//                 continue;
//             }

//             if (i % 2 != 0) {
//                 System.out.print("* ");
//             } else {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// ARRAY
// public class js1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String[] course = { "Pancasila", "KTI", "CTPS", "Matdas", "English",
//                 "Daspro", "Daspro Practice", "K3" };
//         int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
//         float[] grades = new float[8];
//         String[] lettergrades = new String[8];
//         float[] valueWeight = new float[8];
//         System.out.println("============================");
//         System.out.println("Porgram to Calculate the GPA");
//         System.out.println("============================");
//         for (int i = 0; i < course.length; i++) {
//             System.out.print("Input the score of the course " + course[i] + ": ");
//             grades[i] = sc.nextFloat();
//         }
//         for (int i = 0; i < grades.length; i++) {
//             if (grades[i] > 80 && grades[i] <= 100) {
//                 lettergrades[i] = "A";
//                 valueWeight[i] = 4;
//             } else if (grades[i] > 73 && grades[i] <= 80) {
//                 lettergrades[i] = "B+";
//                 valueWeight[i] = 3.5f;
//             } else if (grades[i] > 65 && grades[i] <= 73) {
//                 lettergrades[i] = "B";
//                 valueWeight[i] = 3;
//             } else if (grades[i] > 60 && grades[i] <= 65) {
//                 lettergrades[i] = "C+";
//                 valueWeight[i] = 2.5f;
//             } else if (grades[i] > 50 && grades[i] <= 60) {
//                 lettergrades[i] = "C";
//                 valueWeight[i] = 2;
//             } else if (grades[i] > 39 && grades[i] <= 50) {
//                 lettergrades[i] = "D";
//                 valueWeight[i] = 1;
//             } else {
//                 lettergrades[i] = "E";
//                 valueWeight[i] = 0;
//             }
//         }
//         double sum = 0, totalcredit = 0;
//         for (int i = 0; i < valueWeight.length; i++) {
//             sum = sum + (valueWeight[i] * sks[i]);
//             totalcredit = totalcredit + sks[i];
//         }
//         double finalgrade = sum / totalcredit;
//         System.out.println("============================");
//         System.out.println("Conversion Score Results");
//         System.out.println("============================");
//         System.out.println(
//                 String.format("%-30s %-20s %-20s %-20s", "~COURSE", "~GRADES", "~LETTER GRADE", "~VALUE WEIGHT"));
//         for (int i = 0; i < course.length; i++) {
//             System.out.println(
//                     String.format("%-30s %-20s %-20s %-20s", course[i], grades[i],
//                             lettergrades[i], valueWeight[i]));
//         }

//         System.out.println("============================");
//         System.out.printf("IP: %.2f", finalgrade);
//     }
// }

//FUNCTION
public class js1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] stocks = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
        int[] price = { 75000, 50000, 60000, 10000 };
        displayIncome(stocks, price);

        displayChangeBranch4(stocks);
    }

    static void displayIncome(int[][] stocks, int[] price) {
        for (int i = 0; i < stocks.length; i++) {
            int totalIncome = 0;
            for (int j = 0; j < stocks[i].length; j++) {
                totalIncome += stocks[i][j] * price[j];
            }
            System.out.println("Total income for each branch " + (i + 1) + ": " + totalIncome);
        }
    }

    static void displayChangeBranch4(int[][] stocks) {
        int changeStock[] = { 1, 2, 0, 5 };
        for (int i = 0; i < stocks.length; i++) {
            stocks[3][i] -= changeStock[i];
            System.out.println("The new stock in branch 4 is : " + stocks[3][i]);
        }
    }
}