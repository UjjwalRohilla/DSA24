package SixTeenDaysCompleteDSA.String;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedStringInASequence {

    public static void main(String[] args) {
        String[] arr = {"ghi" ,"ghi" ,"aaa" ,"ghi" ,"ghi" ,"ghi" ,"ghi"};
        System.out.println(secFrequent(arr,arr.length));
    }

    static String secFrequent(String[] arr, int N) {
        if(arr.length==0)return "";

        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.putIfAbsent(arr[i],0);
            map.put(arr[i],map.get(arr[i])+1);
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        String key = "";
        String firstKey = "";
        String secondKey = "";
        int value = 0;
        String ans = "";
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            key = entry.getKey();
            value = entry.getValue();
            if(firstMax<value){
                secondKey = firstKey;
                firstKey = key;
                secondMax = firstMax;
                firstMax = value;
                if(secondMax>0){
                    ans = secondKey;
                }
            } else if (secondMax<value && firstMax>value) {
                secondMax = value;
                secondKey = key;
                ans = secondKey;
            }
        }
        return ans;
    }
}
