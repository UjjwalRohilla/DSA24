package SixTeenDaysCompleteDSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PermutationInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

    }


    //TC = n! * n
    //SC = O(n)+O(n)
    private List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums,ds,ans,freq);
        return ans;
    }

    private void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if(ds.size()== nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }



    //TC = n! * n
    private List<List<Integer>> permute1(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute1(0,nums,ans);
        return ans;
    }

    private void recurPermute1(int index, int[] nums, List<List<Integer>> ans) {
        if(index==nums.length){
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }

        for (int i = index;i<nums.length;i++){
            swap(i,index,nums);
            recurPermute1(index+1,nums,ans);
            swap(i,index,nums);
        }

    }

    private void swap(int i, int index, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
