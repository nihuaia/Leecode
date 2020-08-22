import java.util.Arrays;

public class demo1025 {
    public boolean divisorGame(int N) {
        boolean[] flag = new boolean[N+1];
        flag[0] = flag[1] = false;
        Arrays.fill(flag,false);
        for(int i = 2;i<=N;i++){
            for(int j = 1;j<i;j++){
                if(i % j == 0 && flag[i-j]==false){
                    flag[i] = true;
                    break;
                }
            }
            flag[i] = false;
        }
        return flag[N];
    }
}
