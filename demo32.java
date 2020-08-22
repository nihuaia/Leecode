import java.util.Stack;

public class demo32 {
    public int longestValidParentheses(String s) {
        int max = 1;
        int num1;
        int i,j;
        for(i = 0;i<s.length();i++){
            if(s.charAt(i) != ')'){
                break;
            }
        }
        s = s.substring(i,s.length());
        if(s.length() == 0){
            if( i == 0){
                return 0;
            }else{
                return 1;
            }
        }
        Stack<Integer> stack = new Stack<>();
        for(i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(1);
            }else{
                for(j = stack.size()-1;j>=0;j--){
                    if(stack.get(j) == 1){
                        break;
                    }
                    if(stack.get(j)<0){
                        j = -1;
                        break;
                    }
                }
                if(j<0){
                    stack.push(-1);
                }
                if(j>=0){
                    num1 = 1;
                    while(stack.size() > j){
                        num1 += stack.pop();
                    }
                    while (stack.size() > 0 && stack.peek() % 2 == 0) {
                        num1 += stack.pop();
                    }
                    stack.push(num1);
                }

            }
        }
        while(stack.size()>0){
            num1 = stack.pop();
            if(num1 >max){
                max = num1;
            }
        }
        return max;
    }
}
