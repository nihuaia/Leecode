import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class demo98 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);


        Integer[] objects = list.toArray(new Integer[list.size()]);
    }
}
