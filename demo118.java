import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class demo118 {
    public static void main(String[] args) {
        System.out.println(generate(0));
    }

    public static List<Integer> generate(int rowIndex) {
        ArrayList<Integer> listold = new ArrayList<>();
        ArrayList<Integer> listnew = new ArrayList<>();
        int i;
        int len;
        listold.add(1);
        if (rowIndex == 1) {
            return listold;
        }

        for (int j = 2; j <= rowIndex+1; j++) {
            if (j % 2 == 0) {
                len = listold.size();
                listnew.clear();
                listnew.add(1);
                for (i = 1; i < (len + 2) / 2; i++) {
                    listnew.add(listold.get(i - 1) + listold.get(i));
                }
                for (; i <= len; i++) {
                    listnew.add(listnew.get(len - i));
                }
            } else {
                len = listnew.size();
                listold.clear();
                listold.add(1);
                for (i = 1; i < (len + 2) / 2; i++) {
                    listold.add(listnew.get(i - 1) + listnew.get(i));
                }
                for (; i <= len; i++) {
                    listold.add(listold.get(len - i));
                }
            }
        }
        if(rowIndex % 2 == 0){
            return listold;
        }else{
            return listnew;
        }

    }
}
