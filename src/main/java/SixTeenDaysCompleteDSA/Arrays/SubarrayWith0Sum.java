package SixTeenDaysCompleteDSA.Arrays;

import java.util.HashMap;

public class SubarrayWith0Sum {

    public static void main(String[] args) {
        System.out.println(findSumCountKth(new int[]{1,2,4,2,-6,4,3},3));
    }
    static boolean findSumBoolean(int[] arr,int n) {
        if(arr.length==0)return false;
        int sum = 0;
        HashMap<Integer,Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum = sum+arr[i];
            if(sum==0)return true;

            if(m.containsKey(sum))return true;

            m.putIfAbsent(sum,0);
//            m.put(sum,m.get(sum)+1);
        }
        return false;
    }

    static int findSumCount(int[] arr,int n) {
        if(arr.length==0)return 0;
        int sum = 0;
        HashMap<Integer,Integer> m = new HashMap<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+arr[i];
            if(sum==0)count++;

            if(m.containsKey(sum)){
                count +=m.get(sum);
            }

            m.putIfAbsent(sum,0);
            m.put(sum,m.get(sum)+1);
        }
        return count;
    }


    static int findSumCountKth(int[] nums,int k) {
        if(nums.length==0)return 0;
        int sum = 0;
        HashMap<Integer,Integer> m = new HashMap<>();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            if(sum==k)count++;

            if(m.containsKey(sum-k)){
                count +=m.get(sum-k);
            }

            m.putIfAbsent(sum,0);
            m.put(sum,m.get(sum)+1);
        }
        return count;
    }
}
