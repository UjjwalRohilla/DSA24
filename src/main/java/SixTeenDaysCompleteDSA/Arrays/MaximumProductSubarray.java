package SixTeenDaysCompleteDSA.Arrays;

public class MaximumProductSubarray {
    private static long maxProduct(int[] arr, int n) {
        int maximum = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for (int i = 0;i<n;i++){
            if(prefix==0)prefix = 1;
            if(suffix==0) suffix = 1;

            prefix *=arr[i];
            suffix *=arr[n-i-1];

            maximum = Math.max(maximum,Math.max(prefix,suffix));
        }
        return maximum;
    }
}
