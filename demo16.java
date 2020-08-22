import java.awt.event.MouseAdapter;
import java.util.Arrays;
import java.util.Map;

public class demo16 {
    public int threeSumClosest(int[] nums, int target) {
        int min = Math.abs(target-(nums[0]+nums[1]+nums[2]));
        int res = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            int temp;
            while(left<right){
                temp = nums[i]+ nums[left]+nums[right];
                if(temp<target){
                    if(min>Math.abs(target-(nums[i]+nums[left]+nums[right]))){
                        min = Math.abs(target-(nums[i]+nums[left]+nums[right]));
                        res = nums[i]+nums[left]+nums[right];
                    }
                    left++;
                }else if(temp>target){
                    if(min>Math.abs(target-(nums[i]+nums[left]+nums[right]))){
                        min = Math.abs(target-(nums[i]+nums[left]+nums[right]));
                        res = nums[i]+nums[left]+nums[right];
                    }
                    right--;
                }else{
                    return target;
                }
            }
        }
        return res;

    }
}
