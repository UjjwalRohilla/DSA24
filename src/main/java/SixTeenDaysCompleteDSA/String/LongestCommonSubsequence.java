package SixTeenDaysCompleteDSA.String;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        System.out.println(longestCommonSubsequence(s1,s2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1.isEmpty() || text2.isEmpty())return 0;

        return findLongestSubs(text1,text2);
    }

    private static int findLongestSubs(String text1, String text2) {
        if(text1.isEmpty() || text2.isEmpty()){
            return 0;
        }

        char ch1 = text1.charAt(0);
        char ch2 = text2.charAt(0);

        if(ch1 == ch2){
            return 1 + findLongestSubs(text1.substring(1),text2.substring(1));
        }else {
            return Math.max(findLongestSubs(text1.substring(1),text2),
                    longestCommonSubsequence(text1,text2.substring(1)));
        }
    }
}
