// package Quiz1;

// public class MemberMain {
//     public static void main(String[] args) {
//         Member7 memberArray[] = new Member7[5];

//         memberArray[0] = new Member7("dono", 42, 19, 10000);
//         memberArray[1] = new Member7("tono", 18, 21, 10000);
//         memberArray[2] = new Member7("lala", 36, 15, 10000);
//         memberArray[3] = new Member7("lila", 38, 16, 10000);
//         memberArray[4] = new Member7("joko", 41, 20, 10000);

//         int count = 0;
//         for (int i = 0; i < memberArray.length; i++) {
//             if (memberArray[i].age > 35 && memberArray[i].age < 40) {
//                     count++;
//             }
//         }
//         System.out.println("The count number of member aged between 35 and 40 is "+count);

//         int sumwho = 0;
//         for (int i = 0; i < memberArray.length; i++) {
//             if (memberArray[i].age > 40) {
//                sumwho = sumwho+memberArray[i].workoutHours; 
//             }
//         }
//         System.out.println("The total workout hours for members above 40 years old is "+sumwho);


//         for (int i = 0; i < memberArray.length; i++) {
//             System.out.println("Member "+ (i+1));
//             System.out.println("Name "+memberArray[1].name);
//             System.out.println("Age: "+memberArray[i].age);
//             System.out.println("Workout Hours: "+memberArray[i].workoutHours);
//             memberArray[i].print();
//             memberArray[i].totalCost();
//         }
//     }
    
// }

// MemberMain.java
package Quiz1;

public class MemberMain {
    public static void main(String[] args) {
        Member7 memberArray[] = new Member7[5];

        memberArray[0] = new Member7("dono", 42, 19, 100000);
        memberArray[1] = new Member7("tono", 18, 21, 100000);
        memberArray[2] = new Member7("lala", 36, 15, 100000);
        memberArray[3] = new Member7("lila", 38, 16, 100000);
        memberArray[4] = new Member7("joko", 41, 20, 100000);

        int count = 0;
        for (int i = 0; i < memberArray.length; i++) {
            if (memberArray[i].age > 35 && memberArray[i].age < 40) {
                count++;
            }
        }
        System.out.println("The count number of members aged between 35 and 40 is " + count);

        int sumwho = 0;
        for (int i = 0; i < memberArray.length; i++) {
            if (memberArray[i].age > 40) {
                sumwho = sumwho + memberArray[i].workoutHours; 
            }
        }
        System.out.println("The total workout hours for members above 40 years old is " + sumwho);

        for (int i = 0; i < memberArray.length; i++) {
            System.out.println("\nMember " + (i + 1));
            // System.out.println("Name: " + memberArray[i].name);
            // System.out.println("Age: " + memberArray[i].age);
            // System.out.println("Workout Hours: " + memberArray[i].workoutHours);
            memberArray[i].print();
            memberArray[i].totalCost();
        }
    }
}