import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class demo1014 {
    public static void main(String[] args) {
        int[] num = {8,1,5,2,6};
        System.out.println(new demo1014().maxScoreSightseeingPair(num));
    }
    public int maxScoreSightseeingPair(int[] A) {
        int res = A[0] + A[1] -1;
        int max;
        int index = A.length-1;
        int[] temp = A.clone();
        for(int i = 0;i<A.length;i++){
            temp[i] = temp[i] - i;
        }
        //System.out.println(Arrays.toString(temp));
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<A.length;i++){
            map.put(temp[i],i);
        }
        Arrays.sort(temp);

        for(int i = 0;i<A.length;i++){
            max = i;
            while(index >= 0 ){
                if(map.get(temp[index])<=i){
                    index--;
                }else{
                    break;
                }
            }
            if(index < 0){
                break;
            }
            if(max + A[i] + temp[index] >res){
                res  = A[i] + temp[index] + max;
            }

        }
        return res;


    }
}
