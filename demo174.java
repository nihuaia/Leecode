import java.util.Arrays;

public class demo174 {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon.length==0){
            return 0;
        }
        int[][] min = new int[dungeon.length][dungeon[0].length];
        if(dungeon[0][0]>0){
            min[0][0] = 1;
        }else{
            min[0][0] = dungeon[0][0];
        }

        for(int i = 1;i<dungeon.length;i++){
            //System.out.println("in");
            dungeon[i][0]=dungeon[i-1][0]+dungeon[i][0];
            if(dungeon[i][0]<min[i-1][0]){
                //System.out.println(dungeon[i][0]-1);
                //System.out.println(min[i-1][0]);
                min[i][0] = dungeon[i][0];
            }else{
                min[i][0] = min[i-1][0];
            }
        }
        for(int i = 1;i<dungeon[0].length;i++){
            dungeon[0][i]=dungeon[0][i-1]+dungeon[0][i];
            if(dungeon[0][i]<min[0][i-1]){
                min[0][i]=dungeon[0][i];
            }else{
                min[0][i]=min[0][i-1];
            }
        }

        for(int i = 1;i<dungeon.length;i++){
            for (int j = 1;j<dungeon[0].length;j++){
                if(min[i-1][j]>min[i][j-1]){
                    dungeon[i][j]=dungeon[i-1][j]+dungeon[i][j];
                    if(dungeon[i][j]<min[i-1][j]){
                        min[i][j] = dungeon[i][j];
                    }else{
                        min[i][j]=min[i-1][j];
                    }
                }else{
                    dungeon[i][j]=dungeon[i][j-1]+dungeon[i][j];
                    min[i][j]=dungeon[i][j]-1<min[i][j-1]?dungeon[i][j]:min[i][j-1];
                }
            }
        }
        /*
        System.out.println(Arrays.toString(min[0]));
        System.out.println(Arrays.toString(min[1]));
        System.out.println(Arrays.toString(min[2]));
        System.out.println(Arrays.toString(dungeon[0]));
        System.out.println(Arrays.toString(dungeon[1]));
        System.out.println(Arrays.toString(dungeon[2]));

         */
        return min[dungeon.length-1][dungeon[0].length-1]>0?min[dungeon.length-1][dungeon[0].length-1]:-(min[dungeon.length-1][dungeon[0].length-1]-1);

    }

    public static void main(String[] args) {
        int[][] num1 = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int[][] num2 ={{0}};
        int[][] num3 ={{-1}};
        int[][] num4 ={{100}};
        int[][] num5 ={{0,-3}};
        int[][] num6 ={{0},{-3}};
        int[][] num7 ={{-3,5}};
        int[][] num8 ={{2},{1}};
        int[][] num9 ={{2,1}};
        System.out.println(new demo174().calculateMinimumHP(num1));

        System.out.println(new demo174().calculateMinimumHP(num2));
        System.out.println(new demo174().calculateMinimumHP(num3));
        System.out.println(new demo174().calculateMinimumHP(num4));
        System.out.println(new demo174().calculateMinimumHP(num5));
        System.out.println(new demo174().calculateMinimumHP(num6));
        System.out.println(new demo174().calculateMinimumHP(num7));
        System.out.println(new demo174().calculateMinimumHP(num8));
        System.out.println(new demo174().calculateMinimumHP(num9));

    }
}
