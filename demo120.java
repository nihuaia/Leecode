import java.util.*;

public class demo120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        List<Integer> res = triangle.get(len-1);
        List<Integer> tmp;
        for(int i = len -2;i>=0;i--){
            tmp = triangle.get(i);
            for(int j = 0;j<tmp.size();j++){
                res.set(j,tmp.get(j)+Math.min(res.get(j),res.get(j+1)));
            }
        }
        return res.get(0);
    }
}
