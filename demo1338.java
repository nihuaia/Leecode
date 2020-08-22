import java.util.*;

public class demo1338 {
    public static void main(String[] args) {
    }

    public static int minSetSize(int[] arr) {
        int len = arr.length;
        int count = 0;
        int num = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<Integer,Integer> mapping:list){
            count += mapping.getValue();
            num++;
            if(count >= len/2 + len%2){
                break;
            }
        }
        return num;


    }
}
