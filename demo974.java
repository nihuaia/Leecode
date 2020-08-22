import java.util.HashMap;
import java.util.Map;

public class demo974 {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        System.out.println(new demo974().subarraysDivByK(nums,5));
    }

    public int subarraysDivByK(int[] A, int K) {
        int res = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>(K);
        map.put(0,1);
        for(int i = 0;i<A.length;i++){
            sum += A[i];
            res += map.getOrDefault((sum%K+K)%K,0);
            map.put((sum%K+K)%K,map.getOrDefault((sum%K+K)%K,0)+1);
            System.out.println(sum + "           "+res);
        }
        return res;

    }



}
