package SixTeenDaysCompleteDSA.Arrays.TwoDARRAY;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {4,6,1},
                {10,8,7},
                {9,5,2}
        };
        System.out.println(Arrays.toString(linearSearch(arr,3)));

    }
    private static int[] linearSearch(int[][] arr, int target){
        if(arr.length==0)return new int[]{0,0};
        int i = 0 ;
        while(i<arr.length){
            int j = 0;
            while(j<arr[0].length){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
                j++;
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}
