public class demo292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(4));

    }
    public static boolean canWinNim(int n) {
        if(n<1){
            return true;
        }
        if(n % 4 == 0){
            return false;
        }else{
            return true;
        }

    }
}
