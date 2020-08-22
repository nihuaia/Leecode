import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo336 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        StringBuilder stringBuilder;
        for(int i =0;i<words.length;i++){
            map.put(words[i],i);
        }
        for(int i =0;i<words.length;i++){
            String tmpStr = words[i];
            while(tmpStr.length() > 2) {
                stringBuilder = new StringBuilder(tmpStr);
                stringBuilder.reverse();
                Integer integer = map.getOrDefault(stringBuilder.toString(), -1);
                if (integer != i && integer != -1) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(integer);
                    res.add(tmp);
                    if(tmpStr.length() == words[i].length()){
                        List<Integer> tmp2 = new ArrayList<>();
                        tmp2.add(integer);
                        tmp2.add(i);
                        res.add(tmp2);
                    }
                }
                if(tmpStr.charAt(tmpStr.length()-1) == tmpStr.charAt(tmpStr.length()-2)){
                    tmpStr = tmpStr.substring(0,tmpStr.length()-2);
                }else{
                    break;
                }
            }

        }
        return res;

    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(0,str.length()-2));

    }
}
