import java.util.HashSet;
import java.util.Set;

public class demo219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int min = k<nums.length?k:nums.length;
        for(int i = 0;i<min;i++){
            set.add(nums[i]);
        }
        if(min == nums.length){
            if(set.size()<nums.length){
                return true;
            }else{
                return false;
            }
        }else {
            if (set.size() < k) {
                return true;
            } else {
                for (int i = k; i < k; i++) {
                    set.add(nums[i]);
                    if (set.size() < k) {
                        return true;
                    }
                    set.remove(nums[i - k]);
                }
                return false;
            }
        }
    }
}
