package SixTeenDaysCompleteDSA.Arrays;

import java.util.HashMap;

public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        long[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        long[] a2 = {11, 3, 7, 1, 7};
        int n = a1.length;
        int m = a2.length;
        System.out.println(isSubset(a1,a2,n,m));
    }
    public static String isSubset( long a1[], long a2[], long n, long m) {
        if(a1.length==0 && a2.length==0)return "Yes";
        if(a1.length==0 || a2.length==0)return "No";

        HashMap<Long,Long> map = new HashMap<>();
        boolean isSubset = true;
        for (long num: a1) {
            map.putIfAbsent(num,0L);
            map.put(num,map.get(num)+1);
        }

        for (int i = 0; i < a2.length; i++) {
            if(map.containsKey(a2[i])){
                if(map.get(a2[i])>0){
                    map.put(a2[i],map.get(a2[i]-1));
                }else{
                    isSubset = false;
                }
            }else{
                isSubset = false;
            }
        }
        if(isSubset){
            return "Yes";
        }
        return "No";
    }
}
