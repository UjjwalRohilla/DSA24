package SixTeenDaysCompleteDSA.String;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class WordBreak {
    public static void main(String[] args) {
        String str = "isamsung";
        ArrayList<String> al = new ArrayList<>();
        al.add("i");
        al.add("sam");
        al.add("sun");
        al.add("samsung");
        System.out.println(wordBreak(str.length(),str,al));
    }
    public static int wordBreak(int n, String s, ArrayList<String> dictionary ) {
        if(s.isEmpty())return 1;

        for (int i = 1; i <= n; i++) {
            String prefix = s.substring(0,i);
            if(dictionary.contains(prefix) && wordBreak(n-i,s.substring(i),dictionary)==1){
                return 1;
            }
        }
        return 0;
    }
}
