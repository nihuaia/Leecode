public class demo268 {
    public static void main(String[] args) {
        int[] nums ={3,0,1};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int i;
        int j;
        int num=nums[0];
        boolean flag = false;
        if(num==len){
            flag=true;
            num=nums[1];
        }
        for(i=1;i<len;i++){
            j=num;
            num = nums[num];
            if(num == len){
                flag = true;
                nums[j]=-2;
                break;
            }else{
                nums[j] = -1 ;
            }
        }
        for(i=0;i<len;i++){
            if(nums[i]>=0){

            }
        }
        if(!flag){
            return len;
        }
        for(i=0;i<len;i++){
            if(nums[i] != -1){
                break;
            }
        }
         return i;
    }
}
