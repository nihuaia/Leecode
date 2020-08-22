import java.util.HashMap;
import java.util.Map;

public class demo205 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            char ch;
            Map<Character,Character> map = new HashMap<>();
            for(int i = 0;i<s.length();i++){
                if(map.keySet().contains(s.charAt(i))){
                    ch = map.get(s.charAt(i));
                    if(ch != t.charAt(i)){
                        return false;
                    }
                }else if(map.values().contains(t.charAt(i))){
                    return false;
                }else{
                    map.put(s.charAt(i),t.charAt(i));
                }
            }
            return true;
        }

    }
}
