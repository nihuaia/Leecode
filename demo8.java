public class demo8 {
    public static void main(String[] args) {
        System.out.println(new demo8().myAtoi("     "));
    }
    public int myAtoi(String str) {
        int i;
        for(i= 0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                break;
            }
        }
        str = str.substring(i,str.length());
        if(str.length() == 0){
            return 0;
        }
        i = 0;
        if(str.charAt(0)=='+' || str.charAt(0)=='-'){
            char ch = str.charAt(0);
            str = str.substring(1,str.length());
            if(str.length() == 0){
                return 0;
            }
            while(0<=str.charAt(i)-'0' && str.charAt(i)-'0'<10){
                i++;
                if(i == str.length()){
                    break;
                }
            }
            if(i == 0){
                return 0;
            }else{
                str = str.substring(0,i);
                for(i = 0;i<str.length();i++){
                    if(str.charAt(i)=='0'){
                        i++;
                    }
                }
                str = str.substring(i,str.length());
                if(ch == '+'){
                    if(str.length() > 13 || Long.parseLong(str)>Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }else{
                        return Integer.parseInt(str);
                    }
                }else{
                    if(str.length() > 13 || Long.parseLong(str)>Integer.MAX_VALUE){
                        return Integer.MIN_VALUE;
                    }else{
                        return 0-Integer.parseInt(str);
                    }

                }
            }
        }else if(0<=str.charAt(i)-'0' && str.charAt(i)-'0'<10){
            while(0<=str.charAt(i)-'0' && str.charAt(i)-'0'<10){
                i++;
                if(i == str.length()){
                    break;
                }
            }
            str = str.substring(0,i);
            for(i = 0;i<str.length();i++){
                if(str.charAt(i)=='0'){
                    i++;
                }
            }
            str = str.substring(i,str.length());
            if(str.length() > 13 || Long.parseLong(str)>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else {
                return Integer.parseInt(str);
            }
        }else{
            return 0;
        }
    }
}
