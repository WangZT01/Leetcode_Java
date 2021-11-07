package Recursion;

public class PowerofTwo_231 {

    public boolean isPowerOfTwo(int n) {


        if(n == 1){
            return false;
        }
        return isPowerOfTwo((int) Math.sqrt(n));
    }
}
