package Questions.Arrays;

import java.util.Arrays;

public class MergeTwoArraysBigO1Space {
    public static void main(String[] args) {
        long[] arr1 = {1,3,5,7};
        long[] arr2 = {0,2,6,8,9};
        merge(arr1,arr2, arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println((4+1)/2);
    }
    public static void merge(long[] arr1, long[] arr2, int n, int m)
    {
        if(arr1.length==0 || arr2.length==0) return;

        int i = 0;
        int j = 0;
        while(i<n){
            if(arr1[i]>arr2[j]){
                swap(arr1,arr2,i,j);
                i++;
                Arrays.sort(arr2);
            }else{
                i++;
            }
        }
    }

    private static void swap(long[] arr1, long[] arr2, int i, int j) {
        long temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}
