package SixTeenDaysCompleteDSA.Arrays3;

public class LongestContiguosMaxSum {
    long maxSubarraySum(int[] arr, int n){
        if(arr.length==0)return -1;

        int max = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < n; i++) {
            current = Math.max(current+arr[i],arr[i]);
            max = Math.max(current,max);
        }
        return max;
    }
}
