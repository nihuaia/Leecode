public class demolcp06 {
    public static void main(String[] args) {
        int[] nums ={4,2,1};
        System.out.println(minCount(nums));

    }
    public static int minCount(int[] coins) {
        int count = 0;
        for(int i = 0 ;i<coins.length;i++){
            if( coins[i]%2 == 0){
                count = count + coins[i]/2;
                System.out.println(count);
            }
            else{
                count = count + coins[i]/2 + 1;
                System.out.println(count);
            }
        }
        return count;
    }
}
