import java.util.Arrays;

public class demo1370 {
    public static void main(String[] args) {
        System.out.println('a'<'b');
        System.out.println(sortString("leetcode"));

    }

    public static String sortString(String s) {
        int[] num = new int[26];
        String str="";
        int min = 0;
        for(int i = 0;i<s.length();i++){
            num[s.charAt(i)-'a']++;
        }
        boolean tag = true;
        while(true){
            tag = true ;
            for(int i = 0 ; i< 26 ;i++){
                if( num[i] != 0){
                    str = str + (char)(i+'a');
                    num[i] -- ;
                    tag = false;
                }
            }
            for(int i = 25 ; i >= 0;i--){
                if( num[i] != 0){
                    str = str + (char)(i+'a');
                    num[i] -- ;
                    tag = false;
                }
            }
            if(tag){
                break;
            }
        }
        return str ;
    }

}
