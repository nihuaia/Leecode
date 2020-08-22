import java.util.*;

public class demo207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0;i<prerequisites.length;i++){
            for(int j = 1;j<prerequisites[i].length;j++){
                map.put(prerequisites[i][j],map.getOrDefault(prerequisites[i][j],new ArrayList<>()));
                map.get(prerequisites[i][j]).add(prerequisites[i][0]);
            }
        }
        for(int i =0;i<prerequisites.length;i++){
            map1.put(prerequisites[i][0],map1.getOrDefault(prerequisites[i][0],0)+prerequisites[i].length-1);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<numCourses;i++){
            if(!map1.containsKey(i)){
                stack.push(i);
            }
        }
        // map:出度  map1:入度
        int tmp;
        List<Integer> listTmp;
        while(!stack.isEmpty()){
            tmp = stack.pop();
            numCourses--;
            listTmp = map.get(tmp);
            if(listTmp == null){
                continue;
            }
            for(int i =0 ;i<listTmp.size();i++){
                tmp = listTmp.get(i);
                map1.put(tmp,map1.get(tmp)-1);
                if(map1.get(tmp) == 0){
                    stack.push(tmp);
                }
            }
        }
        if(numCourses == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[][] num1 = {{1,0},{0,1}};
        int[][] num2 = {{1,0},{2,0}};
        int[][] num3 = {{0,1},{0,2}};
        int[][] num4 ={{1,0},{1,2},{0,1}};
        /*boolean b = new demo207().canFinish(2, num1);
        boolean b1 = new demo207().canFinish(3, num2);
        System.out.println(new demo207().canFinish(3,num3));*/
        boolean b2 = new demo207().canFinish(3, num4);
        System.out.println(b2);
    }
}
