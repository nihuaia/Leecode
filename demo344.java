public class demo344 {
    public static void main(String[] args) {
        char[] chars = {'x','v','d','f','c'};
        reverseString(chars);

    }

    public static void reverseString(char[] s) {
        char ch;
        int len = s.length;
        for (int i = 0;i<len/2;i++){
            ch = s[i];
            s[i] = s[len-1-i];
            s[len-i-1] = ch ;
        }
        System.out.println(s);
    }
}
