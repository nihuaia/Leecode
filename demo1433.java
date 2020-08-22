import java.util.Arrays;

public class demo1433 {

    public boolean checkIfCanBreak(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        int i = 0;
        int len = s1.length();
        for(;i<len;i++){
            if(chars1[i]>chars2[i])
                break;
        }
        if(i == len){
            return true;
        }else{
            for(i =0;i<len;i++){
                if(chars1[i]<chars2[i])
                    break;
            }
            if(i==len){
                return true;
            }else{
                return false;
            }
        }


    }
}
