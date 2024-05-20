package SixTeenDaysCompleteDSA.String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToDecimal("XIV"));
    }
    public static int romanToDecimal(String str) {
        if(str.isEmpty())return 0;

        Map<Character,Integer> map =  new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n = str.length();
        int count = 0;
        for (int i = 0;i<n;i++){
            if(i<n-1 && map.get(str.charAt(i))<map.get(str.charAt(i+1))){
                count += map.get(str.charAt(i+1))-map.get(str.charAt(i));
                i++;
            }else {
                count += map.get(str.charAt(i));
            }
        }
        return count;
    }
}
