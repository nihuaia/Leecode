import com.sun.jdi.connect.Connector;

public class demo99 {
    TreeNode pre = null;
    TreeNode pro;
    int min = Integer.MIN_VALUE;
    int max;
    Boolean tag = true;

    public void recoverTree(TreeNode root) {
        visit(root);
        int tmp = pre.val;
        pre.val = pro.val;
        pro.val = tmp;

    }

    public void visit(TreeNode root) {
        if (root.left != null) {
            visit(root.left);
        }
        if (tag) {
            if (min > root.val) {
                pro = root;
                max = root.val;
                tag = false;

            } else {
                min = root.val;
                pre = root;
            }
        } else {
            if (root.val < max) {
                max = root.val;
                pro = root;
            }
        }
        if (root.right != null) {
            visit(root.right);
        }


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

