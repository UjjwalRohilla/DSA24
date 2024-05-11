package SixTeenDaysCompleteDSA.Arrays.TwoDARRAY;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,9,10},
                {12,44,56,60},
                {74,80,91,100}
        };

        System.out.println(Arrays.toString(binarySearch(arr,12)));
    }
    private static int[] binarySearch(int[][] arr , int target){
        if(arr.length==0)return new int[]{-1,-1};
        int row = arr.length;
        int col = arr[0].length;

        int start = 0 ;
        int end = row*col-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            int element = arr[mid/col][mid%col];

            if(element==target) return new int[]{mid/col,mid%col};
            else if (element>target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
