import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class demo696 {
    public int countBinarySubstrings(String s) {
        if(s.length() == 0){
            return 0;
        }else{
            int res = 0;
            List<Integer> list = new ArrayList<>();
            int pre = 0;
            for(int i = 1;i<s.length();i++){
                //出现数字转换
                if(s.charAt(i) != s.charAt(i-1)){
                    list.add(i-pre);
                    pre = i;
                }
                if(i == s.length()-1){
                    list.add(s.length()-pre);
                }
            }
            System.out.println(list.toString());
            for(int i = 1;i<list.size();i++){
                res += Math.min(list.get(i-1),list.get(i));
            }

            return res;
        }
    }


    public static void main(String[] args) {
        System.out.println(new demo696().countBinarySubstrings("10101"));
        System.out.println(new demo696().countBinarySubstrings("00110011"));
    }
}
