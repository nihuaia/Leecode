import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class demo572 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(t == null){
            return true;
        }else{
            List<TreeNode> list = new ArrayList<>();
            list.add(s);
            TreeNode temp;
            boolean flag;
            while(list.size()>0){
                temp = list.remove(0);
                if(temp.val == s.val){
                    flag = check(temp,t);
                    if(flag == true){
                        return true;
                    }
                }
                if(temp.left != null){
                    list.add(temp.left);
                }
                if(temp.right != null){
                    list.add(temp.right);
                }
            }
            return false;
        }
    }

    public  static boolean check(TreeNode s,TreeNode t){
        List<TreeNode> temp1 = new ArrayList<>();
        List<TreeNode> temp2 = new ArrayList<>();
        TreeNode tempTree1 ;
        TreeNode tempTree2 ;
        temp1.add(s);
        temp2.add(t);
        while(temp1.size()>0 && temp2.size()>0){
            tempTree1 = temp1.remove(0);
            tempTree2 = temp2.remove(0);
            if(tempTree1.left == null && tempTree2.left == null){
                continue;
            }else if(tempTree1.left != null && tempTree2.left != null && tempTree1.left.val == tempTree2.left.val){
                temp1.add(tempTree1.left);
                temp2.add(tempTree2.left);
            }else{
                return false;
            }

            if(tempTree1.right == null && tempTree2.right == null){
                continue;
            }else if(tempTree1.right != null && tempTree2.right != null && tempTree1.right.val == tempTree2.right.val){
                temp1.add(tempTree1.right);
                temp2.add(tempTree2.right);
            }else {
                return false;
            }
        }
        return true;
    }
}
