public class TriangleArray {
    public static void main(String[] args) {
        Triangle7 triangleArray[] = new Triangle7[4];
        triangleArray[0]=new Triangle7(10, 4);
        triangleArray[1]=new Triangle7(20, 10);
        triangleArray[2]=new Triangle7(15, 6);
        triangleArray[3]=new Triangle7(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Triangle "+i);
            System.out.println("The area is "+triangleArray[i].countArea());
            System.out.printf("The perimeter is %.2f%n", triangleArray[i].countPerimeter());
            System.out.println();
        }
    }
}
