public class demo342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1073741824));

    }
    public static boolean isPowerOfFour(int num) {
        if( num < 4 ){
            return false;
        }
        int n=4;
        while(n >0){
            if(n == num){
                return true;
            }
            n = n << 2;
            System.out.println(n);
        }
        return false;
    }

}
