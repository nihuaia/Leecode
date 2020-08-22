import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class demo93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        for(int i = 1;i< Math.min(4,s.length());i++){
            for(int j =i+1;j<Math.min(i+4,s.length());j++){
                for(int k = j+1;k<Math.min(j+4,s.length());k++){
                    if(s.length() - k < 4 && Integer.valueOf(s.substring(k,s.length()))>=0&& Integer.valueOf(s.substring(k,s.length()))<=255){
                        if(Integer.valueOf(s.substring(0,i))>=0 && Integer.valueOf(s.substring(0,i))<=255){
                            if(Integer.valueOf(s.substring(i,j))>=0 && Integer.valueOf(s.substring(i,j))<=255){
                                if(Integer.valueOf(s.substring(j,k))>=0 && Integer.valueOf(s.substring(j,k))<=255){
                                    if(s.substring(0,i).length()> 1 ){
                                        if(s.substring(0,i).charAt(0)=='0') {
                                            continue;
                                        }
                                    }
                                    if(s.substring(i,j).length()>1) {
                                        if (s.substring(i, j).charAt(0) == '0' ) {
                                            continue;
                                        }
                                    }
                                    if(s.substring(j,k).length()>1 ) {
                                        if (s.substring(j, k).charAt(0) == '0') {
                                            continue;
                                        }
                                    }
                                    if(s.substring(k,s.length()).length()>1 ) {
                                        if (s.substring(k, s.length()).charAt(0) == '0') {
                                            continue;
                                        }
                                    }
                                    res.add(s.substring(0,i)+"."+s.substring(i,j)+"."+s.substring(j,k)+"."+s.substring(k,s.length()));
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> list = new demo93().restoreIpAddresses("0279245587303");
        System.out.println(list.toString());
    }
}
