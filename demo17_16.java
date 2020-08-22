import java.util.Arrays;

public class demo17_16 {

    public int massage(int[] nums) {
        if(nums.length <= 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }else if(nums.length == 2){
            return nums[0] > nums[1] ? nums[0] : nums[1] ;
        }else {
            for(int i = 2;i<nums.length;i++){
                nums[i] =  max(nums,i-2) + nums[i];
            }
            return max(nums,nums.length);
        }

    }

    public static int max(int[] num ,int end){
        int max = num[0];
        for (int i = 0;i<num.length;i++){
            if(num[i]>max){
                max =num[i];
            }
        }
        return max;
    }
}
