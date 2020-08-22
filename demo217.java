import java.util.HashMap;
import java.util.Map;

public class demo217 {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Map map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else {
                map.put(nums[i],1);
            }
        }
        return false;

    }
}
