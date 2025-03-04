import java.util.Scanner;

public class arrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[3];
        Scanner sc = new Scanner(System.in);

        // rectangleArray[0] = new Rectangle();
        // rectangleArray[0].length = 110;
        // rectangleArray[0].width = 30;

        // rectangleArray[1] = new Rectangle();
        // rectangleArray[1].length = 80;
        // rectangleArray[1].width = 40;

        // rectangleArray[2] = new Rectangle();
        // rectangleArray[2].length = 100;
        // rectangleArray[2].width = 20;

        for (int i = 0; i < 3; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle "+i);

            System.out.print("Input lenght: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }

        // System.out.println("First rectangle, width: "+rectangleArray[0].width+", length: "+rectangleArray[0].length);
        // System.out.println("Second rectangle, width: "+rectangleArray[1].width+", length: "+rectangleArray[1].length);
        // System.out.println("Third rectangle, width: "+rectangleArray[2].width+", length: "+rectangleArray[2].length);

        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle "+i);
            System.out.println("width: "+rectangleArray[0].width+", length: "+rectangleArray[0].length);
        }

    }
    
}
//1.2.3
// 1. no, because the rectangle class only need attributes while the other class that call the object will do what it will do with the object. in this case, only show their attributes value.

