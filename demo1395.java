import java.awt.desktop.PreferencesEvent;

public class demo1395 {
    public int numTeams(int[] rating) {
        int sum = 0;
        int temp;
        for(int i = 0;i<rating.length - 2;i++){
            temp = 0;
            for(int j = i + 1;j<rating.length-1;j++){
                if(rating[j] > rating[i]){
                    for(int k = 0;k<rating.length;k++){
                        if(rating[k] > rating[j]){
                            temp ++;
                        }
                    }
                    sum += temp;
                }else if(rating[j] < rating[i]){
                    for(int k = 0;k<rating.length;k++){
                        if(rating[k] < rating[j]){
                            temp ++;
                        }
                    }
                    sum += temp;

                }
            }
        }
        return sum;

    }
}
