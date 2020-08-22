public class demo67 {
    public static void main(String[] args) {
        System.out.println(new demo67().addBinary("1","111"));
    }
    public String addBinary(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        String res = "";
        int flag = 0;
        int tempa ;
        int tempb ;
        while (lena > 0 && lenb > 0){
            tempa = a.charAt( --lena) - '0';
            tempb = b.charAt( --lenb) - '0';
            res = (char)((tempa + tempb + flag) % 2 +'0') + res;
            flag = (tempa + tempb + flag) / 2;
        }
        while(lena>0){
            tempa = a.charAt(--lena) - '0';
            res = (char)((tempa + flag) % 2 + '0') + res;
            flag = (tempa + flag) / 2;

        }
        System.out.println(res);
        System.out.println(lenb);
        while(lenb>0){
            System.out.println(lenb);
            tempb = b.charAt(--lenb) - '0';
            res = (char)((tempb + flag) % 2 + '0') + res;
            flag = (tempb + flag) / 2;
        }
        System.out.println(res);
        if(flag != 0) {
            return flag + res;
        }else{
            return res;
        }
    }
}
