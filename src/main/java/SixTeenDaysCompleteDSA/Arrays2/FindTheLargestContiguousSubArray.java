package SixTeenDaysCompleteDSA.Arrays2;

public class FindTheLargestContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4};
        System.out.println(maxSubarraySum(arr,arr.length));
    }

    private static long maxSubarraySum(int[] arr, int n){
        if(arr.length==0)return 0;

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(sum+arr[i],arr[i]);
            max = Math.max(max,sum);
        }
        return max;
    }
}
