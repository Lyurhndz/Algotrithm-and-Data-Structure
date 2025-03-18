public class Power7 {

    int baseNumber, exponent;
    Power7(int n, int e){
        this.baseNumber=n;
        this.exponent=e;
    }

    int poweBF(int n, int e){
        int result=1;
        for (int i = 0; i < e; i++) {
            result = result*n;
        }
        return result;
    }

    int powerDC(int n, int e){
        if (e==1) {
            return n;
        }else{
            if (e%2==1) {
                return (powerDC(n, e/2)*powerDC(n, e/2)*n);
            }else {
                return (powerDC(n, e/2)*powerDC(n, e/2));
            }
        }
    }
}
