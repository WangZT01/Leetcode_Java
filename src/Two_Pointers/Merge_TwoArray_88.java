package Two_Pointers;

public class Merge_TwoArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int final_pointer = m + n - 1;
        for(; pointer1 >= 0 && pointer2 >= 0; ){

            if(nums2[pointer2] >= nums1[pointer1]){
                nums1[final_pointer] = nums2[pointer2];
                pointer2--;
                final_pointer--;
            }
            else{
                nums1[final_pointer] = nums1[pointer1];
                pointer1--;
                final_pointer--;
            }
        }

        for(;pointer2 >= 0;){

            nums1[final_pointer] = nums2[pointer2];
            pointer2--;
            final_pointer--;
        }
    }
}
