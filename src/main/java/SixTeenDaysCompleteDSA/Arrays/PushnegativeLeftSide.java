package SixTeenDaysCompleteDSA.Arrays;

import java.util.Arrays;

public class PushnegativeLeftSide {
    public static void main(String[] args) {
        int[] arr = new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6,8};
        shiftNegToLeft(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shiftNegToLeft(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            while (i<arr.length && arr[i]<0){
                i++;
            }
            while (j>=0 && arr[j]>=0){
                j--;
            }
            if(i<j){
                swap(i,j,arr);
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
