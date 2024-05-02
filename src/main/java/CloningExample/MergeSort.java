package CloningExample;

import java.util.Arrays;

public class MergeSort {
    static int COUNT = 0;
    public static void main(String[] args) {
        int[] arr = {10,10,9};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(COUNT);
    }
    private static int[] mergeSort(int[] arr){
        if(arr.length==0) return new int[]{};
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeHelper(left,right);
    }

    private static int[] mergeHelper(int[] left, int[] right) {
        int[] newArray = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<left.length && j<right.length){
            if(left[i]>right[j]){
                COUNT += ((left.length-1)-i)+1;
                newArray[k]=right[j];
                j++;
            }else {
                newArray[k] = left[i];
                i++;
            }
            k++;
        }
        while (i<left.length){
            newArray[k] = left[i];
            i++;k++;
        }
        while (j<right.length){
            newArray[k] = right[j];
            j++;k++;
        }
        return newArray;
    }
}
