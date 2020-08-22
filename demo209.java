public class demo209 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        System.out.println(minSubArrayLen(11,nums));

    }

    public static int minSubArrayLen(int s, int[] nums) {
        int result;
        int i = 0;
        int j = 0;
        int sum = 0;
        for(;i<nums.length;i++){
            if(sum + nums[i] >= s){
                break;
            }else{
                sum += nums[i];
            }
        }
        if(i == nums.length){
            return -1;
        }else {
            result = i+1;
            for (; i < nums.length; i++){
                sum += nums[i];
                for(;j<nums.length;j++){
                    if(sum - nums[j] >= s){
                        sum -= nums[j];
                    }else{
                        break;
                    }
                }
                if(i-j+1<result){
                    result = i-j+1;
                }
            }
            return  result;
        }
    }

}
