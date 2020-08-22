public class demo410 {
    public int splitArray(int[] nums, int m) {
        long sum = 0;
        long min = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (min < nums[i]) {
                min = nums[i];
            }
        }
        if (sum == 0 || m == 0) {
            return (int) sum;
        }

        long tmp;
        long max = sum;
        long mid = 0;
        //System.out.println("min="+min+";max="+max);
        while (min <= max) {
            mid = (min + max) / 2;
            //System.out.println(mid);
            tmp = 0;
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (tmp + nums[i] > mid) {
                    tmp = nums[i];
                    j++;
                } else {
                    tmp += nums[i];
                }

                if (j == m) {
                    min = mid + 1;
                    break;
                } else {
                    if (i == nums.length - 1) {
                        if (tmp == mid && j == m-1) {
                            return (int) mid;
                        } else {
                            max = mid - 1;
                        }
                    }
                }
            }
        }
        return (int) min;
    }

    public static void main(String[] args) {
        int[] num1 = {7, 2, 5, 10, 8};
        int[] num2 = {1, 2, 3, 4, 5};
        int[] num3 = {2, 3, 1, 1, 1, 1, 1};
        int[] num4 = {5,2,4,1,3,6,0};
        System.out.println(new demo410().splitArray(num1,2));
        System.out.println(new demo410().splitArray(num2,2));
        System.out.println(new demo410().splitArray(num3, 5));
        System.out.println(new demo410().splitArray(num4, 2));
    }
}
