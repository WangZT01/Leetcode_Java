package Top100F;

public class MaximumSubarray_53 {
	
	public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
        	
        	for(int j = i; j < nums.length; j++) {
        		
        		sum += nums[j];
        		if(sum > max) {
        			max = sum;
        		}
        	}
        	sum = 0;
        }
        return max;
    }
	
	public static void  main(String args[]) {
		
		int a[] = {5,4,-1,7,8};
		System.out.println(maxSubArray(a));
		
	}
	
}
