package SixTeenDaysCompleteDSA.Arrays2;

public class SortZeroOneTwos {
    public static void sort012(int[] a, int n) {
        if(a.length==0)return;
        int low = 0;
        int mid = 0;
        int high= a.length-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(mid,low, a);
                mid++;low++;
            } else if (a[mid] == 2) {
                swap(high,mid,a);
                high--;
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
