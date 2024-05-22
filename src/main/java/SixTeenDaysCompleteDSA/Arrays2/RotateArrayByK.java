package SixTeenDaysCompleteDSA.Arrays2;

public class RotateArrayByK {
    public void rotate(int[] arr, int n) {
        if(arr.length==0)return;

        reverse(0,arr.length-1,arr);
        reverse(1,arr.length-1,arr);
    }

    private void reverse(int first, int last, int[] arr) {
        while(first<=last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
