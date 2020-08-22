public class demo983 {
    public static void main(String[] args) {
        int[] days = {6,8,9,18,20,21,23,25};
        int[] costs ={2,10,41};
        int[] days1 = {1,4,6,7,8,20};
        int[] costs1 ={7,2,15};
        int[] days2 = {4,5,9,11,14,16,17,19,21,22,24};
        int[] costs2 ={1,4,18};
        System.out.println(mincostTickets(days2,costs2));
    }

    public static int mincostTickets(int[] days, int[] costs) {
        int result = 0;
        int breakpoint7 = 0;
        int breakpoint30 = 0;
        int num = 0;
        int num7 = 0;
        int temp30 = 0;
        int temp7 = 0;
        for(int i = 0;i<days.length;i++){
            if(days[i] > days[breakpoint30] + 29){
                if(costs[2]<costs[0]*num + costs[1]*num7){
                    result = temp30 +costs[2];
                    num = 0;
                    num7 = 0;
                    temp30 = result;
                }else {
                    temp30 = result;
                    breakpoint30 = i;
                    num = 0;
                    num7 = 0;
                }
            }
            if(days[i] > days[breakpoint7] + 6 ){
                if(costs[1] < costs[0] * num){
                    result = temp7 + costs[1];
                    num = 0;
                    num7 ++;
                    temp7 = result;
                }else {
                    temp7 = result;
                    breakpoint7 = i;
                    num = 0;
                }
            }else {

            }
            num++;
            result += costs[0];
        }

        if(costs[1] < costs[0] * num){
            result = temp7 + costs[1];
            num = 0;
            num7 ++;
        }
        if(costs[2]<costs[0]*num + costs[1]*num7){
            result = temp30 +costs[2];
        }

        return result;

    }

}
