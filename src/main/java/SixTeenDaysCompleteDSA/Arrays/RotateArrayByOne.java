package SixTeenDaysCompleteDSA.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {

    }
    private static void rotateByOne(int[] arr){
        rotate(arr,0,arr.length-1);
        rotate(arr,1,arr.length-1);
    }

    private static void rotate(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
