package Recursion;

public class PowerofThree_326 {

    public boolean isPowerOfThree(int n) {

        if( n == 1){
            return true;
        }
        if( n % 3 != 0 || n == 0){
            return false;
        }

        return isPowerOfThree(n/3);
    }

    /**
     * If a number is 0 or less, we return a false value. Because any number level cannot be 0 or less.
     *
     * True The values we need to return: 3 ^ 0, 3 ^ 1, 3 ^ 2 ... 3 ^ 19.
     *
     * Why is the final value 3 ^ 19?
     * The reason is that the maximum level of 3 in the range of Integer values is 3 ^ 19:
     * 3 ^ 20> Integer.MAX_VALUE.
     *
     * 3 ^ 19 is divisible only by numbers 3 ^ 0, 3 ^ 1, 3 ^ 2 ... 3 ^ 18 without remainder.
     * Therefore, if there is no remainder left when dividing 3 ^ 19 by n, we return true.
     *
     * class Solution {
     *     public boolean isPowerOfThree(int n) {
     *         return n > 0 && 1162261467 % n == 0;
     *     }
     * }
     */

    /**
     *
     * base changing formula for logarithms
     *
     * class Solution {
     *     public boolean isPowerOfThree(int n) {
     *         if (n <= 0) return false;
     *
     *         double res = 0;
     *         res = Math.log10(n) / Math.log10(3.00);
     *
     *         if(res % 1 == 0) return true;
     *         return false;
     *     }
     * }
     */
}
