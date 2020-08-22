public class demomian21 {


    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int temp;
        while(i < j){
            for(;i<j;i++){
                if(nums[i]%2 == 0){
                    break;
                }
            }
            for(;j>i;j--){
                if(nums[j]%2 == 1){
                    break;
                }
            }
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;


    }
}
