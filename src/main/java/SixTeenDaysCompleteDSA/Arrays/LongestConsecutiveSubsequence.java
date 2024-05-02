package SixTeenDaysCompleteDSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1, 4};
        System.out.println(findLongestConseqSubseq(arr,arr.length));
    }
//    static int findLongestConseqSubseq(int[] arr, int N) {
//        int longest = 1;
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            int currentNum = arr[i]+1;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j]==currentNum){
//                    count++;
//                    currentNum++;
//                    j=-1;
//                }
//            }
//            longest = Math.max(longest,count);
//        }
//        return longest;
//    }

    static int findLongestConseqSubseq(int[] arr,int N){
        if(arr.length==0)return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int n : set) {
//            int cnt = 1;
            if(!set.contains(n-1)){
                int cnt = 1;
                int nextNum = n;
                while(set.contains(nextNum+1)){
                    cnt++;
                    nextNum++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }

}
