package SixTeenDaysCompleteDSA.String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        String top = strs[0];
        String bottom = strs[strs.length-1];
        int countscnd = 0;
        int i = 0;
        while(i<top.length() && i<bottom.length()){
            if(top.charAt(i)==bottom.charAt(i)){
                countscnd++;
                i++;
            }
            else {
                break;
            }
        }
        return bottom.substring(0,countscnd);
    }
}
