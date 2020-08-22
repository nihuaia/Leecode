public class demo16_17 {
    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int count = nums[0] ;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]+count>nums[i]){
                count = count + nums[i];
                if(count > max){
                    max = count;
                }
            }else {
                count = nums[i];
            }
        }
        if(count > max){
            max = count ;
         }
        return max;

    }
}
