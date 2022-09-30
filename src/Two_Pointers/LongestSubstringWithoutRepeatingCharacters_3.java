package Two_Pointers;

import java.util.Hashtable;

public class LongestSubstringWithoutRepeatingCharacters_3 {

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int res = 0;
        Hashtable<Character, Integer> window = new Hashtable<Character, Integer>();

        while(right < s.length()){
            char x = s.charAt(right);
            if(window.containsKey(x)){
                window.replace(x, window.get(x) + 1);
            }
            else{
                window.put(x,1);
            }
            right++;

            while(window.get(x) > 1){
                char y = s.charAt(left);
                window.replace(y, window.get(y) - 1);
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("res"));
    }
}
