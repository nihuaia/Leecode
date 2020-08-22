public class demo520 {
    public boolean detectCapitalUse(String word) {
        if(word.length() ==0){
            return true;
        }else if(word.equals(word.toUpperCase())){
            return true;
        }else{
            for(int i = 1;i<word.length();i++){
                if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
                    return false;
                }
            }
            return true;
        }


    }
}
