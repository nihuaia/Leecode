public class javamian15 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(-1));
    }


    public static int hammingWeight(int n) {
        int total = 0;
        long num;
        if(n>= 0){
            num = n ;
        }else{
            num = (long)Integer.MAX_VALUE *2 + 2 + n ;
        }
        System.out.println(num);
        while(num >0){
            if(num % 2 == 1){
                total ++;
            }
            num /= 2;
        }
        return total;
    }
}
