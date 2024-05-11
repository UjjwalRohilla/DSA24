package SixTeenDaysCompleteDSA.Arrays.TwoDARRAY;

public class WavePrint {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        wavePrinting(arr);
    }

    private static void wavePrinting(int[][] arr) {
        if(arr.length==0)return;
        for (int col = 0; col < arr[0].length; col++) {
            if(col%2==0){
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col]);
                }
            }else{
                for (int row = arr.length-1; row >=0 ; row--) {
                    System.out.print(arr[row][col]);
                }
            }
        }
    }
}
