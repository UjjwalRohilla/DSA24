package SixTeenDaysCompleteDSA.String;

import java.util.HashMap;
import java.util.Map;

public class PrintAllTheDuplicateCharactersInAString {
    void printAllDuplicates(String str){
        if(str.isEmpty())return;

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.putIfAbsent(str.charAt(i),0);
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1){
                System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());
            }
        }
    }
}
