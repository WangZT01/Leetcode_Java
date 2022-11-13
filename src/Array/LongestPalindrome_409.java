package Array;

import java.util.Hashtable;

public class LongestPalindrome_409 {
    public int longestPalindrome(String s) {
        Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
        for (char c : s.toCharArray()){
            if(h.containsKey(c)){
                h.replace(c, h.get(c) + 1);
            }
            else{
                h.put(c, 1);
            }
        }
        int sum = 0;
        boolean single = false;
        for(char x : h.keySet()){
            if( h.get(x) % 2 == 0){
                sum += h.get(x);
            }
            else{
                single = true;
                sum += (h.get(x) - 1);
            }
        }
        if(single){
            return sum+1;
        }
        else{
            int i = 0;

            return sum;
        }

    }
    /**
     *     public int longestPalindrome(String s) {
     *         int[] charCount = new int[128];
     *
     *         for (char c : s.toCharArray()) {
     *             charCount[c]++;
     *         }
     *
     *         int len = 0;
     *
     *         for (int count : charCount) {
     *             len += 2 * (count / 2);
     *         }
     *
     *         return len < s.length() ? len + 1 : len;
     *     }
     */
}
