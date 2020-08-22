import java.util.Arrays;

public class demo45 {
    public static void main(String[] args) {
        int[] nums ={2,3,1,1,4};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int len;
        int num = 0 ;
        int length = nums.length;
        while(nums.length>1) {
            len = nums.length;
            for (int i = len - 1; i >= 0; i--) {
                if (nums[i] >= len - i -1) {
                    length = i;
                }
            }
            num++;
            nums= Arrays.copyOfRange(nums,0,length+1);
        }
        return num;

    }
}
