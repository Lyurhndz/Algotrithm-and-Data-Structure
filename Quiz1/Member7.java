// package Quiz1;

// public class Member7 {
//     public String name;
//     public int age;
//     public int workoutHours;
//     public double membershipFee;

//     public Member7(){

//     }

//     public Member7 (String name, int age, int who, double memfee){
//         this.name = name;
//         this.age = age;
//         this.workoutHours=who;
//         this.membershipFee=memfee;
//     }

//     public void print(){
//         System.out.println("Member Name: "+name);
//         System.out.println("Member Age"+age);
//         System.out.println("Workout Hours: "+workoutHours);
//         System.out.println("Membership Fee: "+membershipFee);
//     }

//     public void totalCost(){
//         if (workoutHours > 15) {
//             workoutHours= (workoutHours*10)/100;
//         }
//         int total = workoutHours*10000;
//         System.out.println("The total cost is: "+total); 
//     }
// }

// Member7.java
package Quiz1;

public class Member7 {
    public String name;
    public int age;
    public int workoutHours;
    public double membershipFee;

    public Member7() {
    }

    public Member7(String name, int age, int workoutHours, double membershipFee) {
        this.name = name;
        this.age = age;
        this.workoutHours = workoutHours;
        this.membershipFee = membershipFee;
    }

    public void print() {
        System.out.println("Member Name: " + name);
        System.out.println("Member Age: " + age);
        System.out.println("Workout Hours: " + workoutHours);
        System.out.println("Initial Membership Fee: " + membershipFee);
    }

    public void totalCost() {
        double discountedFee = membershipFee;
        
        // Apply 10% discount if workout hours exceed 15
        if (workoutHours > 15) {
            discountedFee = membershipFee * 0.9; // 10% discount
            System.out.println("Congratulations! You qualify for a 10% discount!");
        }
        
        System.out.println("Discounted Membership Fee: " + discountedFee);
        System.out.println("Total Cost (including workout hours): " + 
                          (discountedFee + (workoutHours * 10000)));
    }
}