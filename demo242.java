import java.util.Arrays;

public class demo242{
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        System.out.println(Arrays.toString(chars1));
        System.out.println(Arrays.toString(chars1).equals(Arrays.toString(chars2)));

        if(chars1.equals(chars2)){
            return true;
        }else{
            return false;
        }


    }
}
