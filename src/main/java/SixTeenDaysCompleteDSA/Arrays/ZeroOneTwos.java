package SixTeenDaysCompleteDSA.Arrays;

import java.util.Arrays;

public class ZeroOneTwos {
    public static void main(String[] args) {
        int[] arr= {0, 2 ,1 ,2 ,0,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr){
        int low = 0;
        int mid = 0;
        int hi = arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(mid,low,arr);
                mid++;
                low++;
            } else if (arr[mid] == 2) {
                swap(mid,hi,arr);
                hi--;
            }else{
                mid++;
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
