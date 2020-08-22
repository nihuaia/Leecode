import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class demo297 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(3);
        String str = list.toString();
        System.out.println(str);
        System.out.println(str.substring(1,str.length()-1));
        String strR = str.substring(1,str.length()-1);
        String[] split = strR.split(", ");
        for(int i =0;i<split.length;i++){
            if(split[i].equals("null")){
                continue;
            }
            System.out.println(Integer.parseInt(split[i]));
        }
        int i = 0;


    }
}
