import java.util.Arrays;

public class demo684 {

    public static void main(String[] args) {
        int[][] num = {{1,2}, {2,3}, {3,4}, {1,4}, {1,5}};
        System.out.println(Arrays.toString(findRedundantConnection(num)));
    }

    public static int[] findRedundantConnection(int[][] edges) {
        int len = edges.length;
        int[] tag = new int[len+1];
        int m=0;
        int n=0;
        int min;
        int max;
        for(int i = 0;i<=len;i++){
            tag[i] = i;
        }
        //System.out.println(Arrays.toString(tag));
        for(int i = 0;i<len;i++){
            m = edges[i][0];
            n = edges[i][1];
            if (tag[m]==tag[n]){
                break;
            }else{
                min = tag[m]>tag[n]?tag[n]:tag[m];
                max = tag[m]<tag[n]?tag[n]:tag[m];
                for(int j = 0;j<=len;j++){
                    if(tag[j]==max){
                        tag[j]=min;
                    }
                }
                //System.out.println(Arrays.toString(tag));
            }
        }
        min = m>n?n:m;
        max = m<n?n:m;
        int[] result = new int[2];
        result[0]=min;
        result[1]=max;
        return result;

    }
}
