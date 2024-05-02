package SixTeenDaysCompleteDSA.Arrays;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==0)return new ArrayList<>();
        Arrays.sort(nums);
        int curr;
        int first,last;
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for (int j = i+1; j < nums.length; j++) {
                int find = -(nums[i]+nums[j]);
                if(hashMap.containsKey(find)){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[find]);
                    Collections.sort(ans);
                    list.add(ans);
                }
                hashMap.putIfAbsent(find,0);
                hashMap.put(find,hashMap.get(find)+1);
            }
        }
        return list;
    }
}
