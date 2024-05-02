package SixTeenDaysCompleteDSA.String;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    static List<Integer> nextPermutation(int N, int[] arr){
        if(arr.length==0)return new ArrayList<>();
        int s = -1;
        List<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i]>arr[i-1]){
                s = i-1;
                break;
            }
        }
        if(s!=-1){
            for (int i = arr.length-1; i >= s+1; i--) {
                if(arr[i]>arr[s]){
                    swap(i,s,arr);

                    swaps(s+1,arr.length-1,arr);
                    break;
                }
            }
        }else{
            swaps(0,arr.length-1,arr);
        }
        for (int num :
                arr) {
            list.add(num);
        }
        return list;
    }

    private static void swaps(int i, int j, int[] arr) {
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
