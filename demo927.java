import java.util.*;

public class demo927 {
    public int[] threeEqualParts(int[] A) {
        int[] result = new int[2];
        int sum = 0;
        result[0] = -1;
        result[1] = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<A.length;i++){
            if(A[i]==1){
                sum ++;
                map.put(sum,i);
            }
        }
        if(sum == 0){
            result[0] = 0;
            result[1] = A.length-2;
            return result;
        }
        if(sum % 3 ==0){
            if(map.get(sum/3*2+1)-map.get(sum/3*2)>2) {
                result[0] = map.get(sum / 3);
                result[1] = map.get(sum / 3 * 2 + 1) - 1;
            }

        }
        return result;

    }
}
