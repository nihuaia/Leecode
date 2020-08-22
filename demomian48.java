public class demomian48 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int result = 1;
        int num = 1;
        int k = 0;
        int j;
        char[] chars = s.toCharArray();
        for(int i = 1;i<s.length();i++){
            for(j =k ;j< i;j++ ){
                if(chars[j]==chars[i]){
                    num = i-j;
                    k = j+1;
                    if(num >result){
                        result = num;
                    }
                    break;
                }
            }
            if(j==i){
                num = num +1;
                if(num > result){
                    result = num;

                }
            }
        }
        return  result;
    }
}
