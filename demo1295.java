

public class demo1295 {
    public static void main(String[] args) {
        int[] num={12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if((int)Math.log10(nums[i])%2==1) {
                count++;
                System.out.println(nums[i]);
            }
        }
        return count;
    }
}
