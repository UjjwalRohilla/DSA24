package SixTeenDaysCompleteDSA.Arrays;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int count = 1 ;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                count++;
            }
        }
        return count;
    }
}
