package SixTeenDaysCompleteDSA.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {85 ,25, 1, 32 ,54 ,6};
        int[] b = {85,2};
        System.out.println(doUnion(a,a.length,b,b.length));
    }
    public static int doUnion(int[] a, int n, int[] b, int m)
    {
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            ans.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            ans.add(b[i]);
        }
        return ans.size();
//        int i = 0;
//        int j = 0;
//        List<Integer> ans = new ArrayList<>();
//        while(i<a.length || j<b.length){
//            while (i>0 && i< a.length && a[i]==a[i-1]){
//                i++;
//            }
//            while (j>0 && j<b.length && b[j]==b[j-1]){
//                j++;
//            }
//            if(i>=a.length){
//                ans.add(b[j]);
//                j++;
//                continue;
//            }
//            if(j>=b.length){
//                ans.add(a[i]);
//                i++;
//                continue;
//            }
//            if(a[i]<b[j]){
//                ans.add(a[i]);
//                i++;
//            } else if (a[i]>b[j]) {
//                ans.add(b[j]);
//                j++;
//            }else{
//                ans.add(a[i]);
//                i++;j++;
//            }
//        }
//        return ans.size();
    }
}
