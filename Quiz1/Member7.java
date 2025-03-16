package Quiz1;

public class Member7 {
    public String name;
    public int age;
    public int workoutHours;
    public double membershipFee;

    public Member7(){

    }

    public Member7 (String name, int age, int who, double memfee){
        this.name = name;
        this.age = age;
        this.workoutHours=who;
        this.membershipFee=memfee;
    }

    public void print(){
        System.out.println("Member Name: "+name);
        System.out.println("Member Age"+age);
        System.out.println("Workout Hours: "+workoutHours);
        System.out.println("Membership Fee: "+membershipFee);
    }

    public void totalCost(){
        if (workoutHours > 15) {
            workoutHours= (workoutHours*10)/100;
        }
        int total = workoutHours*10000;
        System.out.println("The total cost is: "+total); 
    }
}