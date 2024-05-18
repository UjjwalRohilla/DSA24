package SixTeenDaysCompleteDSA.String;

import java.util.ArrayList;
import java.util.List;

public class StringSubsequence {
    public static void main(String[] args) {
        String first = "ABCDGH";
        String second = "AEDFHR";

        System.out.println(lcsOptimise(first.length(),second.length(),first,second));
    }

    static int lcs(int x, int y, String s1, String s2) {
        if(x==0 || y==0)return 0;
        List<String> list1 = subsequence("",s1);
        List<String> list2 = subsequence("",s2);

        int maxString = Integer.MIN_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            int currentString = 0;
            for (int j = 0; j < list2.size(); j++) {
                if(list1.get(i).equals(list2.get(j))){
                    currentString = list1.get(i).length();
                    maxString = Math.max(maxString,currentString);
                    break;
                }
            }
        }
        return maxString;
    }

    public static List<String> subsequence(String p , String up){
        if(up.isEmpty()){
            List<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        List<String>  list = new ArrayList<>();
        char ch = up.charAt(0);
        list.addAll(subsequence(p+ch,up.substring(1)));
        list.addAll(subsequence(p,up.substring(1)));

        return list;
    }

    static int lcsOptimise(int x, int y, String s1, String s2) {
        if(x==0 || y==0)return 0;
        return maxCommonSubS(s1.length()-1,s2.length()-1,s1,s2);
    }

    private static int maxCommonSubS(int index1 , int index2 ,String s1, String s2) {
        if(index1<0 || index2<0)return 0;

        if(s1.charAt(index1)==s2.charAt(index2)){
            return 1 + maxCommonSubS(index1-1,index2-1,s1,s2);
        } else {
            return Math.max(maxCommonSubS(index1-1,index2,s1,s2),
                    maxCommonSubS(index1,index2-1,s1,s2));
        }
    }
}
