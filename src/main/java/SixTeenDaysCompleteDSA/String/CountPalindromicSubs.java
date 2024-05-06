package SixTeenDaysCompleteDSA.String;

public class CountPalindromicSubs {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(countPS(str));
    }
    static long countPS(String str){
        return checkSubs("",str);
    }

    private static long checkSubs(String p, String up) {
        if(up.isEmpty()){
            if(p.isEmpty())return 0;
            boolean isPalindrome = checkPalindrome(p);
            if(isPalindrome)return 1;
            return 0;
        }
        long count = 0;
        char ch = up.charAt(0);
        count+=checkSubs(p+ch,up.substring(1));
        count+=checkSubs(p,up.substring(1));

        return count;
    }

    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}
