package SixTeenDaysCompleteDSA.String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static boolean areIsomorphic(String str1,String str2) {

        if(str1.length()!=str2.length())return false;

        Map<Character,Character> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char original = str1.charAt(i);
            char replacement = str2.charAt(i);

            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }else {
                    return false;
                }
            }else {
                if(map.get(original)!=replacement)return false;
            }
        }
        return true;
    }
}
