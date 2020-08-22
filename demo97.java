public class demo97 {
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean tag = false;
        if(s1.length()==0 && s2.length()==0 && s3.length() ==0){
            return true;
        }
        if (s1.length() > 0 && s2.length() > 0 && s3.length() > 0 && s1.charAt(0) == s3.charAt(0) && s2.charAt(0) == s3.charAt(0)) {
            if (s1.charAt(0) == s3.charAt(0)) {
                tag = isInterleave(s1.substring(1, s1.length()), s2, s3.substring(1, s3.length()));
            }
            if (tag == true) {
                return true;
            } else {
                tag = isInterleave(s1, s2.substring(1, s2.length()), s3.substring(1, s3.length()));
            }
            return tag;
        }else{
            if(s1.length() >0 && s3.length()>0 && s1.charAt(0)==s3.charAt(0)){
                return isInterleave(s1.substring(1, s1.length()), s2, s3.substring(1, s3.length()));
            }
            if(s2.length() >0 && s3.length()>0 && s2.charAt(0)==s3.charAt(0)){
                 return isInterleave(s1, s2.substring(1, s2.length()), s3.substring(1, s3.length()));
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(new demo97().isInterleave("bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa",
                "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab",
                "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab"));
    }
}
