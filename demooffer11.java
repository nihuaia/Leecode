public class demooffer11 {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            System.out.println(mid);
            if (numbers[mid] <= numbers[right]) {
                right = mid - 1;
                System.out.println("right=" + right);
            } else {
                left = mid + 1;
                System.out.println("left= " + left);
            }
        }
        return numbers[mid];
    }

    public static void main(String[] args) {
        System.out.println(new demooffer11().minArray(new int[]{3, 1, 1}));
    }
}
