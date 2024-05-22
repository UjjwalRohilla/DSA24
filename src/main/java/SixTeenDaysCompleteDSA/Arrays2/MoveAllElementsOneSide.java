package SixTeenDaysCompleteDSA.Arrays2;

import java.util.Arrays;

public class MoveAllElementsOneSide {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveAllNegative(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void moveAllNegative(int[] arr){
        if(arr.length==0)return;

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            while(arr[start]<0){
                start++;
            }
            while(arr[end]>=0){
                end--;
            }
            swap(start,end,arr);
        }
    }

    private static void swap(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
