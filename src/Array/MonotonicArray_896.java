package Array;

public class MonotonicArray_896 {
    public boolean isMonotonic(int[] nums) {

        boolean in = true;
        for(int i = 0; i < nums.length - 1; i++){
            if( nums[i] < nums[i+1]){
                in = false;
                break;
            }
        }
        boolean de = true;
        for(int i = 0; i < nums.length - 1; i++){
            if( nums[i] > nums[i+1]){
                de = false;
                break;
            }
        }
        return in || de;
    }
    /**
     * public boolean isMonotonic(int[] nums) {
     *     if (nums.length <= 2) {
     *         return true;
     *     }
     *     int preDiff = nums[1] - nums[0];
     *     for (int i = 2; i < nums.length; i++) {
     *         int currDiff = nums[i] - nums[i - 1];
     *         if (currDiff * preDiff < 0) {
     *             return false;
     *         }
     *
     *         preDiff = currDiff != 0 ? currDiff : preDiff;
     *
     *     }
     *     return true;
     * }
     */
}
