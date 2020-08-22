public class demomian57 {

    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = nums.length-1;
        for(;i<j;){
            if(nums[i]+nums[j]>target){
                j--;
            }
            if(nums[i]+nums[j]<target){
                i++;
            }
            if(nums[i]+nums[j]==target){
                break;
            }
        }
        if(i<j){
            int[] res = new int[2];
            res[0] = nums[i];
            res[0] = nums[j];
            return res;
        }else{
            return new int[0];
        }



    }

}
