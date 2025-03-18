public class StudentMain {
    public static void main(String[] args) {
        Student7[] students = new Student7[8];
        students[0] = new Student7("Ahmad", "220101001", 2022, 78, 82);
        students[1] = new Student7("Budi", "220101002", 2022, 85, 88);
        students[2] = new Student7("Cindy", "220101003", 2021, 90, 87);
        students[3] = new Student7("Dian", "220101004", 2021, 76, 79);
        students[4] = new Student7("Eko", "220101005", 2023, 92, 95);
        students[5] = new Student7("Fajar", "220101006", 2020, 88, 85);
        students[6] = new Student7("Gina", "220101007", 2023, 80, 83);
        students[7] = new Student7("Hadi", "220101008", 2020, 82, 84);


        int highestUTS = findHighestUTS(students, 0, students.length - 1);
        System.out.println("Highest Midterm Score (UTS): " + highestUTS);

        int lowestUTS = findLowestUTS(students, 0, students.length - 1);
        System.out.println("Lowest Midterm Score (UTS): " + lowestUTS);

        double averageUAS = calculateAverageUAS(students);
        System.out.println("Average Final Score (UAS): " + averageUAS);
    }

    public static int findHighestUTS(Student7[] students, int low, int high) {
        if (low == high) {
            return students[low].midtermScore;
        }

        int mid = (low + high) / 2;
        int leftMax = findHighestUTS(students, low, mid);
        int rightMax = findHighestUTS(students, mid + 1, high);

        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    public static int findLowestUTS(Student7[] students, int low, int high) {
        if (low == high) {
            return students[low].midtermScore;
        }

        int mid = (low + high) / 2;
        int leftMin = findLowestUTS(students, low, mid);
        int rightMin = findLowestUTS(students, mid + 1, high);

        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }

    public static double calculateAverageUAS(Student7[] students) {
        int sum = 0;
        for (Student7 student : students) {
            sum += student.finalScore;
        }
        return (double) sum / students.length;
    }
}
