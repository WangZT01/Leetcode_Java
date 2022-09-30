package Two_Pointers;

public class GetEqualSybstring_1208 {

    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, right = 0;
        int sum = 0;
        int res = 0;
        while(right < s.length()){
            sum += Math.abs(s.charAt(right) - t.charAt(right));
            right++;

            while(sum > maxCost){
                sum -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
