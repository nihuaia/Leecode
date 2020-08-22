import java.awt.event.MouseAdapter;
import java.util.Arrays;

public class demo628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length-1;
        return nums[len]*Math.max(nums[len-1]*nums[len-2],nums[0]*nums[1]);


    }
}
