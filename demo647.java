import java.util.ArrayList;
import java.util.List;

public class demo647 {
    public int countSubstrings(String s) {
        List<Integer> list = new ArrayList<>();
        int num = 0;
        int pre = -1;
        int step = 1;
        int now;
        //长度为1的字符串
        for(int i = 0;i<s.length();i++){
            num++;
            list.add(i);
        }
        //长度为1的字符串的拓展
        while(list.size()>0){
            now = list.remove(0);
            if(now <= pre){
                /**
                 当当前值小于取出来的值，说明一个循环结束了
                 即长度进行了加1
                */
                step++;
            }
            pre = now;
            if(now - step >=0 && now + step<s.length()) {
                if (s.charAt(now - step) == s.charAt(now + step)) {
                    num++;
                    list.add(now);
                }
            }
        }
        list.clear();
        step = 1;
        pre = -1;
        //长度为2的字符串
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                num++;
                list.add(i);
            }
        }
        //长度为2的字符串的拓展
        while(list.size()>0){
            now = list.remove(0);
            if(now <= pre){
                // 当当前值小于取出来的值，说明一个循环结束了
                step++;
            }
            pre = now;
            if(now - step >=0 && now + step + 1 < s.length()) {
                if (s.charAt(now - step) == s.charAt(now + step + 1)) {
                    num++;
                    list.add(now);
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(new demo647().countSubstrings("aaa"));
    }
}
