package Array;

public class FindPivotIndex_724 {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for(int i = 0 ;i < nums.length; i++){
            right += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if( i - 1 >= 0)
                left = left + nums[i - 1];
            right = right - nums[i];
            if(left == right)
                return i;
        }
        return -1;

    }
}
