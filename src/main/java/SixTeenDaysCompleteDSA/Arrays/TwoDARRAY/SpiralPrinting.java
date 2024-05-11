package SixTeenDaysCompleteDSA.Arrays.TwoDARRAY;

public class SpiralPrinting {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printSpiral(arr);
    }
    private static void printSpiral(int[][] arr) {
        if(arr.length==0)return;
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        int total = row*col;


        int startingRow = 0;
        int endingRow = arr.length-1;
        int startingCol = 0;
        int endingCol = arr[0].length-1;

        while(count<total){
            //Col
            for (int sCol = startingCol; sCol <= endingCol; sCol++) {
                System.out.print(arr[startingRow][sCol]+" ");
                count++;
            }
            System.out.println();
            startingRow++;


            //Row
            for (int scRow = startingRow; scRow <=endingRow ; scRow++) {
                System.out.print(arr[scRow][endingCol]+" ");
                count++;
            }
            System.out.println();
            endingCol--;


            //ReverseCol
            for (int eCol = endingCol;eCol>=startingCol;eCol--){
                System.out.print(arr[endingRow][eCol]+" ");
                count++;
            }
            System.out.println();
            endingRow--;


            //ReverseRow
            for (int eRow = endingRow;eRow>=startingRow;eRow--){
                System.out.print(arr[eRow][startingCol]+" ");
                count++;
            }
            startingCol++;
            System.out.println();
        }
    }
}
