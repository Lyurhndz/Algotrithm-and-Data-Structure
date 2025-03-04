import java.util.Scanner;

public class ArrayOfObjectsMod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle[] rectangleArray = null;
        int n;
        System.out.print("Input Array Length: ");
        n = sc.nextInt();
        rectangleArray = new Rectangle[n];

        for(int i = 0; i < rectangleArray.length; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }
        for (int i = 0; i < rectangleArray.length; i++) {
         System.out.println("Rectangle " + i);
         System.out.println("Width " + rectangleArray[i].width + ", length: " + rectangleArray[i].length);       
        }
    }
}
