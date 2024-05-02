package SixTeenDaysCompleteDSA.String;

public class PalindromeString {
    int isPalindrome(String S) {
        int l = 0;
        int r = S.length()-1;
        while (l<r){
            if(S.charAt(l)!=S.charAt(r))return 0;
            l++;
            r--;
        }
        return 1;
    }
}
