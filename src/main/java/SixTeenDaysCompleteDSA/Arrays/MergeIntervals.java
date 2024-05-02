package SixTeenDaysCompleteDSA.Arrays;

import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {
    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> store = new Stack<>();
        store.push(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int startPoint2 = intervals[i][0];
            int endPoint2 = intervals[i][1];

            int[] popArray = store.pop();

            int startPoint1 = popArray[0];
            int endPoint1 = popArray[1];

            //1 3    arr1
            // 2 5   arr2
            int maxEnd = Math.max(endPoint1,endPoint2);
            if(endPoint1>startPoint2){
                int[] pushNew = new int[]{startPoint1,maxEnd};
                store.push(pushNew);
            }else{
                store.push(popArray);
                store.push(intervals[i]);
            }
        }
        int[][] ans = new int[store.size()][2];
        for (int i = store.size()-1; i >= 0; i--) {
            int[] storing = store.pop();
            ans[i][0] =storing[0];
            ans[i][1] = storing[1];
        }
        return ans;
    }
}
