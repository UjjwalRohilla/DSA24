package SixTeenDaysCompleteDSA.Arrays3;

import java.util.Arrays;

public class ZeroOnesTwos {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,2,2,0,1};
        sort012(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort012(int[] a, int n) {
        if(a.length==0)return;

        int start = 0;
        int mid = 0;
        int end = n-1;

        while(mid<=end){
            if(a[mid]==0){
                swap(start,mid,a);
                start++;
                mid++;
            } else if (a[mid]==2) {
                swap(mid,end,a);
                end--;
            }else {
                mid++;
            }
        }
    }

    private static void swap(int x, int y, int[] a) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
