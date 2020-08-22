import java.awt.desktop.PreferencesEvent;

public class demomian29 {
    public int[] spiralOrder(int[][] matrix) {
        int len = 0;
        if(matrix.length==0){
            return new int[0];
        }
        int[] res = new int[matrix.length*matrix[0].length];
        int m = 0;
        int i;
        int j = 0;
        while(len<matrix.length*matrix[0].length) {
            for (i = m; i < matrix[0].length-m; i++) {  //从左到右进行访问
                res[len++] = matrix[j][i];
            }
            if(len == matrix.length*matrix[0].length){
                break;
            }
            i--;
            for (j = m+ 1; j < matrix.length-m; j++) {
                res[len++] = matrix[j][i];
            }
            if(len == matrix.length*matrix[0].length){
                break;
            }
            j--;
            for (i--; i >= m; i--) {
                res[len++] = matrix[j][i];
            }
            if(len == matrix.length*matrix[0].length){
                break;
            }
            i++;
            for (j--; j > m; j--) {
                res[len++] = matrix[j][i];
            }
            j++;
            m++;
        }
        return res;
    }
}
