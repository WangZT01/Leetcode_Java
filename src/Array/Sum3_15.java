package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList();

        for( int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    l.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                    while(nums[left] == nums[left - 1] && left < right)
                        left++;
                    while(nums[right] == nums[right + 1] && left < right)
                        right--;
                }
                else if( sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
            while(nums[i] == nums[i + 1] && i < nums.length - 2)
                i++;

        }
        return l;
    }
}
