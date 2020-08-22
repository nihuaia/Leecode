public class demo290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abaa","dog cat cat dog"));

    }
    public static boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        int i=0;
        int j;
        if(pattern.length() != s.length){
            return false;
        }
        for(i=0;i<pattern.length();i++){
            for(j=i+1;j<pattern.length();j++){
                if(pattern.charAt(i)==pattern.charAt(j)){
                    if(!s[i].equals(s[j])){
                        return false;
                    }
                }
            }
        }
        for(i=0;i<s.length;i++){
            for(j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    if(pattern.charAt(i)!=pattern.charAt(j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
