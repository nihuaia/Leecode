import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> tmp = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i,j;
        for(i = 0,j=0;i<nums1.length && j< nums2.length;){
            if(nums1[i] ==nums2[j]){
                tmp.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[] res = new int[tmp.size()];
        for(i = 0;i<tmp.size();i++){
            res[i] = tmp.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        System.out.println(Arrays.toString(new demo350().intersect(num1,num2)));
    }

}
