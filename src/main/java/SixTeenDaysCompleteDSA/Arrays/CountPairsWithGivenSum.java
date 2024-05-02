package SixTeenDaysCompleteDSA.Arrays;

import java.util.HashMap;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        System.out.println(getPairsCount(new int[]{1,5,7,1},4,6));
    }
     static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int b = k-arr[i];
            if(m.containsKey(b)){
                ans+=m.get(b);
            }
            m.putIfAbsent(arr[i],0);
            m.put(arr[i],m.get(arr[i])+1);
        }
        return ans;
    }
}