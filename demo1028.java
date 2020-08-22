import javax.swing.text.TextAction;
import javax.swing.text.rtf.RTFEditorKit;
import java.util.*;

public class demo1028 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        System.out.println(new demo1028().recoverFromPreorder("1-2--3--4-5--6--7"));
    }
    public TreeNode recoverFromPreorder(String S) {
        Map<TreeNode,Integer> map = new HashMap<>();
        if(S.length()==0){
            return null;
        }
        int temp = nums(S);
        int tempNum ;
        TreeNode tempNode ;
        TreeNode root = new TreeNode(Integer.parseInt(S.substring(0,temp)));
        System.out.println(root + "   "+root.val);
        S = S.substring(temp,S.length());
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        map.put(root,0);
        while(stack.size()>0 && S.length() > 0){
            //System.out.println(flag);
            tempNum = numS(S);
            S = S.substring(tempNum,S.length());
            tempNum = tempNum;
            while (tempNum < stack.size()){
                tempNode = stack.peek();
                if(map.get(tempNode) == 0){
                    tempNode.left = null;
                    map.put(tempNode,1);
                    System.out.println(tempNode.val +"的左孩子为空");
                }else if(map.get(tempNode) == 1){
                    tempNode.right = null;
                    map.put(tempNode,2);
                    System.out.println(tempNode.val +"的右孩子为空");
                }else{
                    stack.pop();
                }

            }
            temp = nums(S);
            //System.out.println(queue.peek().val);
            if(map.get(stack.peek())==0){
                TreeNode left = new TreeNode(Integer.parseInt(S.substring(0,temp)));
                System.out.println("left      "+left.val);
                stack.peek().left = left;
                map.put(stack.peek(),1);
                map.put(left,0);
                stack.push(left);
            }else if(map.get(stack.peek())==1){
                TreeNode right = new TreeNode(Integer.parseInt(S.substring(0,temp)));
                stack.peek().right = right;
                System.out.println("right      "+right.val);
                map.put(stack.peek(),2);
                stack.push(right);
                map.put(right,0);
            }
            S = S.substring(temp,S.length());
            //System.out.println(S + "   "+stack.size());
        }
        while(stack.size()>0){
            tempNode = stack.pop();
            if(map.get(tempNode)==0){
                tempNode.left = null;
                map.put(tempNode,1);
            }else if(map.get(tempNode)==1){
                tempNode.right = null;
            }

        }

        return root;
    }
    public static int nums(String s){
        int i = 0;
        for(i = 0;i<s.length();i++){
            if(s.charAt(i)-'0' < 0  || s.charAt(i)-'0'> 9){
                break;
            }
        }
        return i;
    }
    public static int  numS(String s){
        int i;
        for(i = 0;i<s.length();i++){
            if(s.charAt(i) != '-' ){
                break;
            }
        }
        return i;
    }
}
