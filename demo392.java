public class demo392 {
    public boolean isSubsequence(String s, String t) {
        if(t.length() == 0){
            return true;
        }
        int i = 0;
        int j = 0;
        for (; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
                if (j == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new demo392().isSubsequence("abc", "ahbgdc"));
    }

}
