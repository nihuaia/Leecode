import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo110 {
    public boolean isBalanced(TreeNode root) {
        int length = 1;
        int min=-1;
        TreeNode tmp;
        List<TreeNode> list = new ArrayList<>();
        Map<TreeNode,Integer> map = new HashMap<>();
        if(root!=null) {
            list.add(root);
            map.put(root,1);
        }else{
            return true;
        }
        while(list.size()>0){
            tmp = list.remove(0);
            length = map.get(tmp);
            if(min != -1 && length - min >=2 && min== -1){
                return false;
            }
            map.remove(tmp);
            if(tmp.left == null || tmp.right == null){
                min = length;
            }
            if(tmp.left != null){
                list.add(tmp.left);
                map.put(tmp.left,length+1);
            }
            if(tmp.right != null){
                list.add(tmp.right);
                map.put(tmp.right,length+1);
            }

        }
        return true;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
