package SixTeenDaysCompleteDSA.Arrays2;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3};


    }
    public static int doUnion(int[] a, int n, int[] b, int m) {
        if(a.length==0 || b.length==0)return 0;

        int i = 0;
        int j = 0;


        List<Integer> list = new ArrayList<>();


        while(i<n && j<m){
            //skip duplicates
            while(i>0 && i<n && a[i]==a[i-1]){
                i++;
            }
            while(j>0 && j<m && b[i]==b[i-1]){
                j++;
            }


            //exh
            if(i>=n){
                list.add(b[j]);
                j++;
                continue;
            }
            if(j>=m){
                list.add(a[i]);
                i++;
                continue;
            }

            if(a[i]<b[j]){
                list.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                list.add(b[j]);
                j++;
            }else{
                list.add(a[i]);
                i++;j++;
            }
        }
        return list.size();
    }
}
