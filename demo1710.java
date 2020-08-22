import java.util.Arrays;

public class demo1710 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        if(nums.length == 0){
            return -1;
        }else {
            Arrays.sort(nums);
            count = 1;
            for(int i = 1;i<nums.length;i++){
                if(nums[i] == nums[i-1]){
                    count++;
                }else{
                    if(count > nums.length/2){
                        return nums[i-1];
                    }
                    count = 1 ;
                }
            }
            if(count>nums.length/2){
                return nums[nums.length-1];
            }else{
                return -1;
            }
        }
    }

}
