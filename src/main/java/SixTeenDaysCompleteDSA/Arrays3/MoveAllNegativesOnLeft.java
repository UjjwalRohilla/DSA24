package SixTeenDaysCompleteDSA.Arrays3;

import java.util.Arrays;

public class MoveAllNegativesOnLeft {
    public static void main(String[] args) {
        int[] arr = {0,-5,2,7,-9,-11,11,24,4};
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void move(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int i = 0;

        while(i<=end){
            if(arr[i]>=0){
                swap(start,i,arr);
                start++;
            }else {
                swap(end,i,arr);
                end--;
            }
            i++;
        }
    }

    private static void swap(int x, int y, int[] arr) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
