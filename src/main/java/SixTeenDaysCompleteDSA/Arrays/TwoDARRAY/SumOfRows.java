package SixTeenDaysCompleteDSA.Arrays.TwoDARRAY;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SumOfRows {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 11},
                {2, 12, 1},
                {7,8,7}
        };
        System.out.println(sumOfRows(arr));
    }
    private static List<Integer> sumOfRows(int[][] arr){
        if(arr.length==0)return new LinkedList<>();
        int row = 0;
        int col = 0;

        List<Integer> list = new ArrayList<>();
        while(row<arr.length){
            int totalOfRow = 0;
            while(col<arr[0].length){
                totalOfRow+=arr[row][col];
                col++;
            }
            list.add(totalOfRow);
            row++;
            col = 0;
        }
        return list;
    }
}
