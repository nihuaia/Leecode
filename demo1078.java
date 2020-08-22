import java.util.ArrayList;
import java.util.Arrays;

public class demo1078 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOcurrences("alice is a good girl she is a good student","a","good")));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> arrayList = new ArrayList();
        String[] split = text.strip().split("\\s+");
        for(int i=0;i<split.length-2;i++){
            if(split[i].equals(first) && split[i+1].equals(second))
                arrayList.add(split[i+2]);
        }
        return arrayList.toArray(new String[0]);
    }
}
