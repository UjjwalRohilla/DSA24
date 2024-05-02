package SixTeenDaysCompleteDSA.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationsOfAGivenString {
    public static void main(String[] args) {

    }
    public List<String> find_permutation(String S) {
        return helper("",S);
    }

    private List<String> helper(String p, String up) {
        if(up.isEmpty()){
            List<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        List<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = up.substring(0,i);
            String l = up.substring(i,p.length());
            ans.addAll(helper(f+ch+l,up.substring(1)));
        }
        Collections.sort(ans);
        return ans;
    }
}
