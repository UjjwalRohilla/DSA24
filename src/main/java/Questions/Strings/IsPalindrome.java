package Questions.Strings;

public class IsPalindrome {
    int isPalindrome(String S) {
        int start = 0;
        int last = S.length()-1;
        while(start<last){
            if(S.charAt(start)!=S.charAt(last)){
                return 0;
            }
            start++;last--;
        }
        return 1;
    }
}
