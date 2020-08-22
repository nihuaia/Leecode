import java.util.Arrays;

public class demomian39 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int sum = 1 ;
        int i;
        for(i = 1;i<len;i++){
            if(nums[i]==nums[i-1]){
                sum ++;
                if(sum>len/2){
                    break;
                }
            }else{
               sum = 1;
            }
        }
        return i;


    }
}
