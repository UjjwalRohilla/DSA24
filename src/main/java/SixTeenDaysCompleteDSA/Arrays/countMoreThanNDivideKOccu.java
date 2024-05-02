package SixTeenDaysCompleteDSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class countMoreThanNDivideKOccu {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2 ,2 ,1 ,2 ,3, 3};
        System.out.println(countOccurence(arr,arr.length,4));
    }
    public static int countOccurence(int[] arr, int n, int k) {
        if(arr.length==0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int barrier = n/k;
        int counter = 0;
        for (int num : arr) {
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>barrier)counter++;
        }
        return counter;
    }
}
