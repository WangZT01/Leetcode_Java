package Recursion;

public class PowerofTwo_231 {

    public boolean isPowerOfTwo(int n) {

        if(n == 1){
            return true;
        }
        if(n % 2 == 1 || n == 0) {
            return false;
        }
        return isPowerOfTwo(n/2); //only the last judgement can be record
    }

    /**
     * public boolean isPowerOfTwo(int n) {
     * 	if(n == 1) return true;
     * 	if(n == 0 || n % 2 != 0) return false;
     * 	return isPowerOfTwo(n/2);
     * }
     */
}
