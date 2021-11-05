package Recursion;

public class ReverseString_344 {

    public void reverseString(char[] s) {

        swap(s, 0);

    }
    public char[] swap(char[] s, int n){

        if(n == s.length/2){
            return s;
        }
        else{
            char t = s[n];
            s[n] = s[s.length-n-1];
            s[s.length-n-1] = t;
            return swap(s, n+1);
        }
    }

    /***
     * public void reverseString(char[] s) {
     *         if (s == null || s.length <= 1) {
     *             return;
     *         }
     *
     *         int left = 0;
     *         int right = s.length - 1;
     *         while (left < right) {
     *             s[left] = (char) (s[left] ^ s[right]);  ex-or A^b^A = b
     *             s[right] = (char) (s[left] ^ s[right]);
     *             s[left] = (char) (s[left] ^ s[right]);
     *             left++;
     *             right--;
     *         }
     *     }
     */
}
