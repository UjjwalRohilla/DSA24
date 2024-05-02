package SixTeenDaysCompleteDSA.String;

public class SplitTheBinaryStringIntoSubstringsWithEqualNumberOf0sAnd1s {
    public static int maxSubStr(String str) {
        if(str.isEmpty())return -1;

        int n = str.length();
        int x = 0,y=0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)=='0'){
                x++;
            }else{
                y++;
            }
            if(x==y)c++;
        }
        if(x!=y){
            return -1;
        }
        return c;
    }
}
