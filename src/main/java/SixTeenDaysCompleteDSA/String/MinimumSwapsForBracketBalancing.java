package SixTeenDaysCompleteDSA.String;

public class MinimumSwapsForBracketBalancing {
    private static int minimumNumberOfSwaps(String S){
        if(S.isEmpty())return 0;
        int open = 0;
        int close = 0;
        int unbalanced = 0;
        int swap = 0;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(ch=='['){
                open++;
                if(unbalanced>0){
                    swap+=unbalanced;
                    unbalanced--;
                }
            }else{
                close++;
                unbalanced = close-open;
            }
        }
        return swap;
    }
}
