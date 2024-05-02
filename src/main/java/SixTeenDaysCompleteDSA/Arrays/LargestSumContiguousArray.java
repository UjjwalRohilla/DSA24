package SixTeenDaysCompleteDSA.Arrays;

public class LargestSumContiguousArray {

    public static void main(String[] args) {

    }
    private static long maxSubarraySum(int arr[], int n){
        long bestSum = Integer.MIN_VALUE;
        long currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            bestSum = Math.max(currentSum,bestSum);
        }
        return bestSum;
    }
}
