import com.sun.jdi.ArrayReference;

import javax.swing.*;
import java.rmi.RMISecurityManager;
import java.sql.ClientInfoStatus;
import java.util.*;

public class demo632 {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] res = new int[2];
        int[] tag = new int[nums.size()];
        int flag = 0;
        int index;
        Arrays.fill(tag,0);
        List<Integer> tmp = new ArrayList<>();
        int[] loc = new int[nums.size()];
        for(int i = 0;i<nums.size();i++){
            tmp.add(nums.get(i).get(tag[i]));
            loc[i] = nums.get(i).get(tag[i]);
            tag[i]++;
        }
        int[] maxAndMin = MaxAndMin(tmp);
        int distance  = maxAndMin[0] - maxAndMin[1];
        res[0] = maxAndMin[1];
        res[1] = maxAndMin[0];

        System.out.println("I am coming");
        System.out.println(tmp.toString());
        System.out.println(Arrays.toString(loc));
        while(true){
            index = find(loc,maxAndMin[1]);
            if(tag[index] == nums.get(index).size()){
                tmp.add(Integer.MAX_VALUE);
            }else {
                tmp.add(nums.get(index).get(tag[index]));
                loc[index] = nums.get(index).get(tag[index]);
                tag[index]++;
            }
            tmp.remove(maxAndMin[2]);
            maxAndMin = MaxAndMin(tmp);
            if(maxAndMin[0] == Integer.MAX_VALUE){
                break;
            }
            if(maxAndMin[0] - maxAndMin[1]<distance){
                distance = maxAndMin[0] - maxAndMin[1];
                res[0] = maxAndMin[1];
                res[1] = maxAndMin[0];
            }
            System.out.println();
            System.out.println(tmp.toString());
            System.out.println(Arrays.toString(loc));
        }

        return res;
    }

    public int find(int[] nums,int num){
        int i = 0;
        for(;i<nums.length;i++){
            if(nums[i]== num){
                break;
            }
        }
        return i;
    }

    public int[] MaxAndMin(List<Integer> list){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int flag =  0;
        for(int i = 0; i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
            if(list.get(i)<min){
                min = list.get(i);
                flag = i;
            }
        }
        return new int[]{max,min,flag};
    }

    public static void main(String[] args) {
        /*
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(1,2,3));
        nums.add(Arrays.asList(1,2,3));
        nums.add(Arrays.asList(1,2,3));
        int[] res1 = new demo632().smallestRange(nums);
        System.out.println(Arrays.toString(res1));
        */



       /* List<List<Integer>> nums1 = new ArrayList<>();
        nums1.add(Arrays.asList(4,10,15,24,26));
        nums1.add(Arrays.asList(0,9,12,20));
        nums1.add(Arrays.asList(5,18,22,30));
        int[] res = new demo632().smallestRange(nums1);
        System.out.println(Arrays.toString(res));*/


        List<List<Integer>> nums2 = new ArrayList<>();
        nums2.add(Arrays.asList(0,26,29,29,42,42,44));
        nums2.add(Arrays.asList(-8,48,59,61,62,65,69,70));
        nums2.add(Arrays.asList(7,37,44,45));
        nums2.add(Arrays.asList(-5,42,62,64,70,71,72));
        nums2.add(Arrays.asList(14,16,17,17,17,18));
        nums2.add(Arrays.asList(-15,60,70,73,74,75,76));
        nums2.add(Arrays.asList(15,15,15,16));
        int[] res2 = new demo632().smallestRange(nums2);
        System.out.println(Arrays.toString(res2));
    }
}
