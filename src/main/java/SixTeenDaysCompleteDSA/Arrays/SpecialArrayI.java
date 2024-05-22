package SixTeenDaysCompleteDSA.Arrays;

public class SpecialArrayI {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(isArraySpecial(arr));
    }
    public static boolean isArraySpecial(int[] nums) {
        if(nums.length==0)return true;

        boolean trueEven;
        if(nums[0]%2==0){
            trueEven = false;
        }else {
            trueEven = true;
        }

        for (int i = 1; i < nums.length; i++) {
            if(!(trueEven) && !(nums[i]%2 == 0)){
                trueEven = true;
            } else if (trueEven && nums[i]%2 == 0) {
                trueEven = false;
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean isArraySpecialOPT(int[] nums){
        if(nums.length==0)return true;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i]%2==0 && nums[i+1]%2==0)return false;
        }
        return true;
    }
}
