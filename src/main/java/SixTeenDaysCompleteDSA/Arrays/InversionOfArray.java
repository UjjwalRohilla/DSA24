package SixTeenDaysCompleteDSA.Arrays;

import java.util.Arrays;

public class InversionOfArray {
    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr, arr.length));
    }
    static long inversionCount(long[] arr, long N)
    {
        return mergeSort(arr,0,arr.length-1);
    }

    private static int mergeSort(long[] arr, int s, int e) {
        int count = 0;

        if(e-s==1){
            return count;
        }


        int mid = s+(e-s)/2;

        count += mergeSort(arr,s,mid);
        count += mergeSort(arr,mid,e);

        count += mergeHelper(arr,s,mid,e);
        return count;
    }

    private static int mergeHelper(long[] arr, int s, int mid, int e) {
        long[] temp = new long[(e-s)+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        int count = 0;

        while (i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                count += (mid-i)+1;
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k] = arr[i];
            i++;k++;
        }
        while (j<=e){
            temp[k] = arr[j];
            j++;k++;
        }

        for (int l = 0; l < temp.length; l++) {
            arr[s+l] = temp[l];
        }

        return count;
    }


//    SOLUTION 1 NOT INPLACE SORT
//    static int COUNT = 0;
//    private static int[] mergeSort(int[] arr){
//        if(arr.length==0) return new int[]{};
//        if(arr.length==1){
//            return arr;
//        }
//        int mid = arr.length/2;
//        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
//        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return mergeHelper(left,right);
//    }
//
//    private static int[] mergeHelper(int[] left, int[] right) {
//        int[] newArray = new int[left.length+right.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i<left.length && j<right.length){
//            if(left[i]>right[j]){
//                COUNT += ((left.length-1)-i)+1;
//                newArray[k]=right[j];
//                j++;
//            }else {
//                newArray[k] = left[i];
//                i++;
//            }
//            k++;
//        }
//        while (i<left.length){
//            newArray[k] = left[i];
//            i++;k++;
//        }
//        while (j<right.length){
//            newArray[k] = right[j];
//            j++;k++;
//        }
//        return newArray;
//    }
}
