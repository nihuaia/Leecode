public class demo1351 {

    public static void main(String[] args) {
        int[][] num = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3},{2,1,3,4}};
        System.out.println(countNegatives(num));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        int lenr = grid[0].length;
        int lenc = grid.length;
        for(int i = 0; i<lenc;i++){
            for(int j = 0;j<lenr;j++){
                if(grid[i][j]>=0)
                    count++;
                else
                    break;
            }
        }

        return lenc*lenr-count;
    }
}
