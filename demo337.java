import org.w3c.dom.ls.LSException;

import java.time.temporal.Temporal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class demo337 {
    public int rob(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode tmp;
        int num = 0;
        if(root!=null){
            queue.offer(root);
            num ++;
        }
        while (num >0){
            tmp = queue.poll();
            if(tmp != null){
                list.add(tmp.val);
                queue.offer(tmp.left);
                queue.offer(tmp.right);
                if(tmp.left != null){
                    num++;
                }
                if(tmp.right != null){
                    num++;
                }
            }else{
                num--;
                list.add(0);
                queue.offer(null);
                queue.offer(null);
            }

        }
        if(list.size()==0){
            return 0;
        }else if(list.size()==1){
            return list.get(0);
        }else{
            int max = list.get(0);
            for(int i = 1;i<list.size();i++){
                if(max ==  list.get(i/2)){
                    num = findMax(list,i/2,i);
                    num += list.get(i);
                    list.set(i,num);
                    if(num > max){
                        max = num;
                    }
                }else{
                    num = max + list.get(i);
                    max = num;
                    list.set(i,max);
                }
            }
            return max;
        }

    }

    public int findMax(List<Integer> list,int j,int length){
        int max = 0;
        for(int i =0;i<length;i++){
            if(i == j){
                continue;
            }else{
                if(list.get(i)>max){
                    max = list.get(i);
                }
            }
        }
        return max;
    }
}


