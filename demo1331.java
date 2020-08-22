import java.util.Arrays;
import java.util.*;

public class demo1331 {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length ==0){
            return arr;
        }
        int[] copy = arr.clone();
        Arrays.sort(copy);
        Map<Integer,Integer> map = new HashMap<>();
        map.put(copy[0],1);
        int j = 2;
        for(int i = 1;i<copy.length;i++){
            if(copy[i] != copy[i-1]){
                map.put(copy[i],j);
                j++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;

    }
}
