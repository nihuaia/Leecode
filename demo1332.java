public class demo1332 {
    public static void main(String[] args) {
        String s = "";
        System.out.println(removePalindromeSub(s));

    }

    public static int removePalindromeSub(String s) {
        int count = 0;
        int i;
        int len = s.length();
        while(len > 0){
            for(i=0;i<len/2;i++){
                if(s.charAt(i)!=s.charAt(len-1-i)){
                    break;
                }
            }
            if( i == len/2 ){
                count ++;
                break;
            }
            if(i != 0){
                count ++;
                s = s.substring(i,len-i);
            }
            if(s.charAt(i+1) == s.charAt(len-1-i)){
                count ++;
                s = s.substring(i+1,len-i);
                len = s.length();
            }else if(s.charAt(i) == s.charAt(len-2-i)){
                count ++;
                s = s.substring(i+1,len-1-i);
                len = s.length();
            }else {
                count += 2;
                s=s.substring(i+1,len-2-i);
                len = s.length();
            }
        }
        return count;
    }

    public static boolean check(String st){
        int i;
        for(i = 0;i<st.length()/2;i++){
            if (st.charAt(i)!=st.charAt(st.length()-1-i))
                break;
        }
        if(i == st.length()/2){
            return true;
        }else {
            return false;
        }
    }
}
