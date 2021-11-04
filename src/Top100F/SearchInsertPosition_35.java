package Top100F;

public class SearchInsertPosition_35 {
	
	//O(n)
	public int searchInsert1(int[] nums, int target) {
        int i = 0;
        for(; i < nums.length; i++) {
        	if( target > nums[i]) {
        		continue;
        	}
        	else{
        		break;
        	}
        } 
        return i;
    }
	
	//O(logN) - binary search
	public static int searchInsert2(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        int mid = (start + end)/2;
        
        while(start <= end) {
        	mid = (start + end)/2; 
        	if( target > nums[mid]) {
        		start = mid + 1;
        	}
        	else if( target < nums[mid]) {
        		end = mid - 1;
        	}
        	else {
        		return mid;
        	}
        }
        
        return mid;
    }
	
	public static void main(String args[]) {
		
		int a[] = {1,3,6,7};
		System.out.println(searchInsert2(a, 1));
		
	}
}
