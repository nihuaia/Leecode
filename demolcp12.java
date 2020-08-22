import java.util.Arrays;

class Check{
    public boolean check(int[] nums,int limit,int day){
        int maxValue = 0;
        int total = 0;
        int useday = 1;
        for(int i = 0;i<nums.length;i++){
            maxValue = Math.max(nums[i],maxValue);
            if(total + nums[i] - maxValue <limit){
                total += nums[i];
            }else{
                useday++;
                total = nums[i];
                maxValue = nums[i];
            }
        }
        return useday <= day;

    }
}

public class demolcp12 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3};
        System.out.println(minTime(nums,2));
    }

    public static int minTime(int[] time, int m) {
        int high = 0;
        int mid = 0;
        int low = 0;
        Check flag = new Check();
        for(int i = 0;i<time.length;i++){
            high += time[i];
        }
        while (low<high){
            mid = (low + high) >>> 1;
            if(flag.check(time,mid,m)){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low + 1 ;

    }
}
