package SixTeenDaysCompleteDSA.Arrays.TwoDARRAY;

public class LargestRowInArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 1},
                {2, 12, 1},
                {7,8,7}
        };
        System.out.println(largestRowInSum(arr));
    }
    private static int largestRowInSum(int[][] arr){
        int largestRow = -1;
        int i = 0;
        int j = 0;
        int maxSum = Integer.MIN_VALUE;
        while(i<arr.length){
            int currentSum = 0;
            while(j<arr[0].length){
                currentSum+=arr[i][j];
                j++;
            }
            if(maxSum<currentSum){
                largestRow = i;
                maxSum = currentSum;
            }
            i++;
        }
        return largestRow;
    }
}
