package SixTeenDaysCompleteDSA.Arrays;

public class FindtheDuplicateNumber {
    //1,3,4,2,2
    public int findDuplicate(int[] nums) {
        int s = nums[0];
        int f = nums[0];
        do{
            s = nums[s];
            f = nums[nums[f]];
        }while(s!=f);

        f = nums[0];
        while(s!=f){
            s = nums[s];
            f = nums[f];
        }
        return s;
    }
}
