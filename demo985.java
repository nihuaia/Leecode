import java.util.Arrays;

public class demo985 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] temp = new demo985().sumEvenAfterQueries(A,queries);
        System.out.println(Arrays.toString(temp));

    }
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        if(A.length ==0){
            return new int[0];
        }
        int[] res = new int[A.length];
        int sum = 0;
        for(int i = 0; i<A.length;i++){
            if(A[i]%2==0){
                sum += A[i];
            }
        }
        System.out.println(sum);
        int val;
        int index;
        for(int i = 0;i<queries.length;i++){
            val = queries[i][0];
            index = queries[i][1];
            if(A[index] % 2 == 0){
                sum -= A[index];
            }
            A[index] += val;
            if(A[index] % 2 ==0){
                sum += A[index];
            }
            res[i] = sum;
        }
        return res;
    }
}
