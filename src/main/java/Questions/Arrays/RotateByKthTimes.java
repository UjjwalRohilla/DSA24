package Questions.Arrays;

import java.util.Arrays;

public class RotateByKthTimes {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        //7 6 5 4 3 2 1
        //2 3 4 5 6 7 1
        rotate(arr,1000);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int k) {
        if(arr.length==0) return;
        k = k%arr.length;
        swapNTimes(arr,0,arr.length-1);
        swapNTimes(arr,0,k-1);
        swapNTimes(arr,k,arr.length-1);
    }
    public static void swapNTimes(int[] arr, int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
