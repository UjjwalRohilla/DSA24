package SixTeenDaysCompleteDSA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripletSumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4 ,45, 6 ,10 ,8};
        System.out.println(find3Numbers3(arr,arr.length,13));
    }
    public static boolean find3Numbers(int[] A, int n, int X) {
        if(A.length==0)return false;

        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                for (int k = j+1; k < A.length; k++) {
                    if((A[i]+A[j]+A[k])==X){
                        System.out.println(A[i]+"+"+A[j]+"+"+A[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }




    ////N2
    public static boolean find3Numbers2(int[] A, int n, int X) {
        if(A.length==0) return false;
        for (int i = 0; i < A.length - 2; i++) {
            Set<Integer> set = new HashSet<>();
            int current = X-A[i];
            for (int j = i+1; j < A.length; j++) {
                if(set.contains(current-A[j])){
                    System.out.println(A[i]+"+"+A[j]+"+"+(current-A[j]));
                    return true;
                }
                set.add(A[j]);
            }
        }
        return false;
    }

    public static boolean find3Numbers3(int[] A, int n, int X) {
        if(A.length==0){
            return false;
        }
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            int l = i+1;
            int r = A.length-1;
            while (l<r){
                int tempSum = A[i]+A[l]+A[r];
                if(tempSum==X){
                    return true;
                } else if (tempSum < X) {
                    l++;
                }else {
                    r--;
                }
            }
        }
        return false;
    }
}
