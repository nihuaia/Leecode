import java.util.Arrays;

public class demo44 {
    public boolean isMatch(String s, String p) {
        int i,j,start;
        start = 0;
        for(i = 0;i<p.length() && i<s.length();i++){
            if(p.charAt(i)=='*'){
                break;
            }else{
                if(p.charAt(i)=='?'){
                    continue;
                }else{
                    if(p.charAt(i)==s.charAt(i)){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        p = p.substring(i,p.length());
        s = s.substring(i,s.length());
        for(i = p.length()-1,j=s.length()-1;i>=0 && j>=0;i--,j--){
            if(p.charAt(i)=='*'){
                break;
            }else{
                if(p.charAt(i)=='?'){
                    continue;
                }else{
                    if(p.charAt(i)==s.charAt(j)){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        p = p.substring(0,i + 1);
        s = s.substring(0,j + 1);

        //System.out.println(p);
        //System.out.println(s);
        if(s.length() == 0){
            for(i=0;i<p.length();i++){
                if(p.charAt(i)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(s.length() != 0 && p.length()==0){
            return false;
        }
        //System.out.println("I can do it");
        String[] split = p.split("[*]");
        System.out.println(Arrays.toString(split));
        for(i = 0; i< split.length;i++){
            if(split[i].length()==0){
                //System.out.println(i);
                continue;
            }
            //System.out.println(i);
            for(j = start;j<s.length()-split[i].length()+1;j++){
                System.out.println(i+"===="+split[i]+"===="+j);
                if(compare(s.substring(j,j+split[i].length()),split[i])){
                    //System.out.println("i am coming");
                    start = j+split[i].length();
                    break;
                }
            }

            if(i==split.length-1){
                if(j>s.length()-split[i].length()){
                    return false;
                }else{
                    break;
                }
            }else{
                if(j<s.length()-split[i].length()){
                    continue;
                }else{
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean compare(String s,String t){
        for(int i =0;i<s.length();i++){
            if(t.charAt(i)=='?'){
                continue;
            }else{
                if(t.charAt(i)==s.charAt(i)){
                    continue;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(new demo44().isMatch("c","*?*"));
        System.out.println(new demo44().isMatch("missingtest","mi*ing?s*t"));
        System.out.println(new demo44().isMatch("bbacccc","*ca*b*"));
    }
}
