public class demo507 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        int sum = 1;
        for(int i = 2;i<=(int)Math.sqrt(num);i++){
            if(num % i ==0 ){
                System.out.println(i);
                sum = sum + sum/i + i;
            }
        }
        System.out.println(sum);
        if(sum == num ){
            return true;
        }else{
            return false;
        }

    }
}
