import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class demo130 {
    public void solve(char[][] board) {
        if (board.length != 0) {
            int length = board[0].length;
            int width = board.length;
            //找到边界的'O'
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            int[][] tag = new int[width][length];
            int m, n;
            for (int i = 0; i < length; i++) {
                if (board[0][i] == 'O') {
                    tag[0][i] = 1;
                    list1.add(0);
                    list2.add(i);
                }
                if (board[width - 1][i] == 'O') {
                    tag[width - 1][i] = 1;
                    list1.add(width - 1);
                    list2.add(i);
                }
            }
            for (int i = 0; i < width; i++) {
                if (board[i][0] == 'O') {
                    tag[i][0] = 1;
                    list1.add(i);
                    list2.add(0);
                }
                if (board[i][length - 1] == 'O') {
                    tag[i][length - 1] = 1;
                    list1.add(i);
                    list2.add(length - 1);
                }
            }
            while (list1.size() > 0) {
                m = list1.remove(0);
                n = list2.remove(0);
                if (m - 1 > 0 && board[m - 1][n] == 'O' && tag[m - 1][n] == 0) {
                    tag[m - 1][n] = 1;
                    list1.add(m - 1);
                    list2.add(n);
                }
                if (m + 1 < width && board[m + 1][n] == 'O' && tag[m + 1][n] == 0) {
                    tag[m + 1][n] = 1;
                    list1.add(m + 1);
                    list2.add(n);
                }
                if (n - 1 > 0 && board[m][n - 1] == 'O' && tag[m][n - 1] == 0) {
                    tag[m][n - 1] = 1;
                    list1.add(m);
                    list2.add(n - 1);
                }
                if (n + 1 < length && board[m][n + 1] == 'O' && tag[m][n + 1] == 0) {
                    tag[m][n + 1] = 1;
                    list1.add(m);
                    list2.add(n + 1);
                }
            }
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < length; j++) {
                    if (board[i][j] == 'O' && tag[i][j] == 0) {
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }
}
