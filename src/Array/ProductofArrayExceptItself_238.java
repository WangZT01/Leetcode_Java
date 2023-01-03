package Array;

public class ProductofArrayExceptItself_238 {
    public int[] productExceptSelf(int[] nums) {

        int a[] = new int [nums.length];
        int prefix[] = new int [nums.length];
        int suffix[] = new int [nums.length];
        prefix[0] = 1;
        suffix[nums.length - 1] = 1;
        int pre = prefix[0];
        int suf = 1;
        for(int i = 1; i < nums.length; i++){
            prefix[i] = pre * nums[i - 1];
            pre = pre * nums[i - 1];
        }
        for(int i = nums.length - 1; i > 0; i--){
            suffix[i - 1] = suf * nums[i];
            suf = suf * nums[i];
        }
        for(int i = 0; i < a.length; i++){
            a[i] = prefix[i] * suffix[i];
        }
        return a;
    }
}
