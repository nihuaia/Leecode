import java.util.*;

public class demomian06 {
    public static void main(String[] args) {
        System.out.println(method());

    }
    public static int[] method(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        List<Integer> list = new Vector<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return new int[0];
    }
    
    
}
