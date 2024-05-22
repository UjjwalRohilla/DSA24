package SixTeenDaysCompleteDSA.Arrays.TwoDARRAY;

import java.util.*;

public class ThreeSumRe {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(arr);
        System.out.println(list);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==0)return new ArrayList<>();

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        int i = 0;

        while(i<nums.length){
            int isZero;
            int j = i+1;
            int k = nums.length-1;
            while(j<nums.length && j<k){
                if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    temp.add(k);
                    list.add(temp);
                    k--;
                    while(k>=0 && nums[k]==nums[k+1])k--;
                }
                j++;
                while(j<nums.length && nums[j]==nums[j-1]){
                    j++;
                }
            }
            i++;
            while(i<nums.length && nums[i]==nums[i-1])i++;
        }
        return list;
    }
}
