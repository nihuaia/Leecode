import java.util.Arrays;

public class demo1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] temp1 = Arrays.copyOfRange(nums,0,n);
        //System.out.println(Arrays.toString(temp1));
        int[] temp2 = Arrays.copyOfRange(nums,n,2*n);
        for(int i = 0;i<2*n;i++){
            if( i % 2 ==1){
                nums[i] = temp2[i/2];
            }else{
                nums[i] = temp1[i/2];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(new demo1470().shuffle(nums,3)));
    }
}
