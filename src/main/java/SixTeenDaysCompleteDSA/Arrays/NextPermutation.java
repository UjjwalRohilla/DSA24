package SixTeenDaysCompleteDSA.Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] nums) {
        if (nums.length == 0) return;
        int n = nums.length;
        int k = n - 2;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] <= nums[i - 1]) {
                k--;
            } else {
                break;
            }
        }

        if (k == -1) {
            reverse(0, n - 1, nums);
            return;
        }

        for (int i = n-1; i > 0; i--) {
            if(nums[i]>nums[k]){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                break;
            }
        }

        reverse(k+1,n-1,nums);
    }

    private static void reverse(int i, int j, int[] nums) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}