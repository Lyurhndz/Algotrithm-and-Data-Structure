public class Triangle7 {
    public int base, height;

    public Triangle7(){

    }

    public Triangle7(int a, int t){
        base=a;
        height=t;
    }

    int countArea(){
        return (base*height)/2;
    }

    double countPerimeter(){
        double side=Math.sqrt((base/2)*(base/2)+height*height);
        return base+2*side;
    }
}
