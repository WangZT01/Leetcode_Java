public class binarySearch_704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while(left <= right){
            middle = left + (right - left)/2;
            if(nums[middle] < target){
                left = middle + 1;
            }
            if(nums[middle] > target){
                right = middle - 1;
            }
            if(nums[middle] == target){
                return middle;
            }
        }
        return -1;
    }
}
