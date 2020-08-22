import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class demo1394 {
    public String str = "";
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        String str = list.toString();
        str = str.substring(1,str.length()-1);
        System.out.println(str);

        System.out.println("abab".contains("abb"));
        System.out.println(str);

        int num = 28;
        System.out.println((int)Math.sqrt(28));
        System.out.println(num);


    }


}
