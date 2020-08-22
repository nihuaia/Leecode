import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class demo100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        TreeNode tmp1;
        TreeNode tmp2;
        list1.add(p);
        list2.add(q);
        while (list1.size() > 0 && list2.size() > 0) {
            tmp1 = list1.remove(0);
            tmp2 = list2.remove(0);
            if (tmp1 == null && tmp2 == null) {
                continue;
            } else if (tmp1 != null && tmp2 != null && tmp1.val == tmp2.val) {
                list1.add(tmp1.left);
                list1.add(tmp1.right);
                list2.add(tmp2.left);
                list2.add(tmp2.right);
                continue;
            }else {
                return false;
            }
        }
        return true;


    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


