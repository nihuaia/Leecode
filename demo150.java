import java.util.Stack;

public class demo150 {

    public static void main(String[] args) {
        String[] strings = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(strings));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        stack.push(trans(tokens[0]));
        stack.push(trans(tokens[1]));
        int num1;
        int num2;
        for(int i = 2;i<tokens.length;i++){
            if(tokens[i].equals("*")){
                num1 = stack.pop();
                num2 = stack.pop();
                System.out.println(num1 +tokens[i]+num2);
                System.out.println(num1*num2);
                stack.push(num1 * num2);

            }else if(tokens[i].equals("/")){
                num1 = stack.pop();
                num2 = stack.pop();
                System.out.println(num1 +tokens[i]+num2);
                System.out.println(num1/num2);
                stack.push(num2 / num1);
            }else if(tokens[i].equals("+")){
                num1 = stack.pop();
                num2 = stack.pop();
                System.out.println(num1 +tokens[i]+num2);
                System.out.println(+num1+num2);
                stack.push(num1 + num2);
            }else if(tokens[i].equals("-")){
                num1 = stack.pop();
                num2 = stack.pop();
                System.out.println(num1 +tokens[i]+num2);
                System.out.println(num2-num1);
                stack.push(num1 - num2);
            }else{
                stack.push(trans(tokens[i]));
            }
        }
        return stack.pop();
    }
    public static int trans(String str){
        char[] chars = str.toCharArray();
        int sum = 0;
        if(chars[0]=='-'){
            for(int i=1;i<chars.length;i++){
                sum = sum*10 + chars[i]-'0';
            }
            sum = 0 - sum;
        }else{
            for(int i=0;i<chars.length;i++){
                sum = sum*10 + chars[i]-'0';
            }
        }
        return sum;

    }
}
