import java.nio.charset.IllegalCharsetNameException;
import java.util.Stack;

public class demo63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid.length;
        int length = obstacleGrid[0].length;
        int[][] res = obstacleGrid;
        if(width == 0){
            return 0;
        }
        res[width-1][length-1] = obstacleGrid[width-1][length-1] == 0?1:0;
        for(int i = width -2;i>=0;i--){
            if(obstacleGrid[i][length-1]==1){
                res[i][length-1]=0;
            }else {
                res[i][length-1] = res[i+1][length-1];
            }
        }
        for(int j = length - 2;j>=0;j--){
            if(obstacleGrid[width-1][j]==1){
                res[width-1][j]=0;
            }else{
                res[width-1][j]=res[width-1][j+1];
            }
        }
        for(int i = width - 2;i>=0;i--){
            for(int j = length - 2;j>=0;j--){
                if(obstacleGrid[i][j] == 1){
                    res[i][j] = 0;
                }else {
                    res[i][j] = res[i+1][j]+res[i][j+1];
                }
            }
        }
        return res[0][0];

    }

    public static void main(String[] args) {
        int[][] nums={{0,0,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,1,0,0},
                {1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,0,1},
                {0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0},
                {0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,0,0},
                {1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,1,0},
                {0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0},
                {0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0},
                {0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0},
                {0,0,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1},
                {0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
                {1,0,1,1,0,0,0,0,0,0,1,0,1,0,0,0,1,0},
                {0,0,0,1,0,0,0,0,1,1,1,0,0,1,0,1,1,0},
                {0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0},
                {0,0,0,0,0,0,1,0,1,0,0,1,0,1,1,1,0,0},
                {0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,1},
                {0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0},
                {1,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0,0},
                {0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0},
                {1,0,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,1},
                {1,0,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0}};
        System.out.println(new demo63().uniquePathsWithObstacles(nums));
    }
}