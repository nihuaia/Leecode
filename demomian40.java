import java.util.Arrays;

public class demomian40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.sort(arr);
        result= Arrays.copyOfRange(arr,0,k);
        return result;
    }
}
