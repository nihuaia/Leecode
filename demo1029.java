import java.util.*;

public class demo1029 {

    public int twoCitySchedCost(int[][] costs) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < costs.length; i++) {
            map.put(i, costs[i][0] - costs[i][1]);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            //升序排序
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        int i = 0;
        for (; i < list.size() / 2; i++) {
            count += costs[list.get(i).getKey()][0];

        }
        for (; i < list.size(); i++){
            count += costs[list.get(i).getKey()][1];
        }
        return count;
    }
}
