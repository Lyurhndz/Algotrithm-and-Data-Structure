import java.util.Scanner;

public class PowerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the element number: ");
        int element = input.nextInt();

        Power7[] png = new Power7[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Input the base number for "+(i+1)+"th element: ");
            int basis = input.nextInt();
            System.out.print("Input exponent for "+(i+1)+"th element: ");
            int exp = input.nextInt();
            png[i] = new Power7(basis, exp);
        } 

        System.out.println("POWER RESULT USING BRUTEFORCE:");
        for (Power7 p : png) {
            System.out.println(p.baseNumber+"^"+p.exponent+": "+p.poweBF(p.baseNumber, p.exponent));
        }
        System.out.println("POWER RESULT USING DIVIDE AND CONQUER:");
        for (Power7 p : png) {
            System.out.println(p.baseNumber+"^"+p.exponent+": "+p.powerDC(p.baseNumber, p.exponent));
        }
    }
}
