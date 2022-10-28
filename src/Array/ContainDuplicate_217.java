package Array;

import java.util.Hashtable;

public class ContainDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(h.containsKey(nums[i])){
                return true;
            }
            else{
                h.put(nums[i], 1);
            }
        }
        return false;
    }
    /**
     *     public boolean containsDuplicate(int[] nums) {
     *         HashSet<Integer> s = new HashSet<>();
     *         for(int i=0;i<nums.length;i++){
     *             s.add(nums[i]);
     *         }
     *         return s.size()==nums.length? false:true;
     *     }
     */
}
