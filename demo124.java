import java.awt.event.MouseAdapter;
import java.sql.SQLOutput;

public class demo124 {
    public long res = Integer.MIN_VALUE;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxPathSum(TreeNode root) {
        if(root != null){
            long temp = max(root);
            return (int)res;


        }

        return 0;

    }

    public long max(TreeNode root){
        long tempA = Integer.MIN_VALUE;
        long tempB = Integer.MIN_VALUE;
        if(root.left != null){
            tempA = max(root.left);
        }
        if(root.right != null){
            tempB = max(root.right);
        }

        res = Math.max(res, Math.max(root.val+tempA,Math.max(root.val,Math.max(root.val+tempB,root.val+tempA+tempB))));

        return Math.max(Math.max(root.val+tempA,root.val+tempB),root.val);

    }
}
