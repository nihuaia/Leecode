import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int num = 1;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                if(num > nums.length / 3){
                    result.add(nums[i-1]);
                }
                num = 1;
            }else{
                num ++;
            }
        }
        if(num > nums.length/3){
            result.add(nums[nums.length-1]);
        }
        return result;
    }
}
