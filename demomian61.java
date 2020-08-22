import java.util.Arrays;

public class demomian61 {

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int num = 0 ;
        int i ;
        for(i = 0;i<nums.length;i++){
            if (nums[i] == 0) {
                num++;
            }else{
                break;
            }
        }
        if(num > 3){
            return true;
        }
        for(;i<nums.length - 1 ;i++){
            if(nums[i] == nums[i+1]){
                return false;
            }else if(nums[i+1]-nums[i] ==1) {
                continue;
            }else{
                num = num -(nums[i+1]-nums[i]) + 1;
            }
        }
        if(num == 0){
            return true;
        }else {
            return false;
        }

    }
}
