package SixTeenDaysCompleteDSA.Arrays;

import java.util.Arrays;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        int[] ans = findMinMax(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        return new int[]{min,max};



        //        Arrays.sort(arr);
//        int min = arr[0];
//        int max = arr[arr.length-1];
//        return new int[]{min,max};
    }
}
