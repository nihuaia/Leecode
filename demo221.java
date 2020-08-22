import jdk.swing.interop.SwingInterOpUtils;

public class demo221 {
    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};
        System.out.println(maximalSquare(matrix));
    }



    public static int maximalSquare(char[][] matrix) {
        int sum=0;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    sum++;
                }
            }
        }
        //System.out.println(sum);
        boolean tag;
        int len = (int)Math.sqrt(sum)-1;
        while(len > 0) {
            for (int i = 0; i + len < matrix.length; i++) {
                for(int j = 0;j + len <matrix[0].length;j++){
                    tag = true;
                    falg:
                    for(int m = i;m < i+len+1;m++){
                        for(int n = j;n < j+len+1;n++){
                            if(matrix[m][n]=='0'){
                                tag = false;
                                break falg;
                            }
                        }
                    }
                    if(tag){
                        return len + 1 ;
                    }
                }
            }
            len --;
        }
        if(sum > 0){
            return 1;
        }else {
            return 0;
        }
    }
}
