import java.util.HashMap;
import java.util.*;

public class demo718 {
    public static void main(String[] args) {
        int[] numA = {0,0,0,0,1};
        int[] numB = {1,0,0,0,0};
        int[] numA1= {1,2,3,2,1};
        int[] numB1= {3,2,1,4,7};
        System.out.println(new demo718().findLength(numA,numB));
        System.out.println(new demo718().findLength(numA1,numB1));
    }
    public int findLength(int[] A, int[] B) {
        int min = 0;
        int max = A.length>B.length?B.length:A.length;
        int mid = 0;
        int res = 0;
        Boolean flag ;
        while(min <= max){
            flag = false;
            mid = (min + max) >> 1;
            for(int i =0;i<=A.length-mid;i++){
                for(int j =0;j<=B.length-mid;j++){
                    if(Arrays.equals(A,i,i+mid,B,j,j+mid)){
                        if(mid > res){
                            res = mid;
                        }
                        flag = true;
                        break;
                    }
                }
                if(flag == true){
                    break;
                }
            }
            if(flag == true){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
            //System.out.println(mid);
        }
        return res;
    }
}
