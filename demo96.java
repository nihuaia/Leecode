import java.util.Arrays;

public class demo96 {
    public int numTrees(int n) {
        int[] res = new int[n+1];
        Arrays.fill(res,0);
        res[0] = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                res[i] += res[j-1]*res[i-j];
            }
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(new demo96().numTrees(0));
        System.out.println(new demo96().numTrees(1));
        System.out.println(new demo96().numTrees(2));
        System.out.println(new demo96().numTrees(3));
        System.out.println(new demo96().numTrees(4));

    }
}
