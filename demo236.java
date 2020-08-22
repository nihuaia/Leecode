import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class demo236 {
    public static void main(String[] args) {
        //这部分与其他的无关
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        int num =2;
        data:
        while(true){
            if(num == 2) {
                break data;
            }
        }
        System.out.println(num);




        //分隔符========================

        System.out.println(isUgly(14));

    }
    public static boolean isUgly(int num) {
        if(num<2){
            return false;
        }
        while(num % 5 == 0){
            num = num / 5 ;
        }
        while (num % 3 == 0){
            num = num / 3 ;
        }
        while (num % 2 ==0){
            num = num / 2;
        }
        if(num == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
