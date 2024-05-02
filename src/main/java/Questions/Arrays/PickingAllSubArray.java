package Questions.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PickingAllSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

    }
    public static int allSubs(int[] arr){
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            bestSum = Math.max(bestSum,currentSum);
        }
        return bestSum;
    }
}
