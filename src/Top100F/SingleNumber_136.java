package Top100F;

public class SingleNumber_136 {

    public int singleNumber(int[] nums) {
        int a = nums[0];
        for(int i = 1; i < nums.length; i++){
            a = a ^ nums[i];
        }
        return a;
    }

}
