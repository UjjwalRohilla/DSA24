package Questions.Matrix;

public class MaxOneInARow {
    public static void main(String[] args) {
        int[][] arr = {
                {0 ,0, 0 ,1 ,1, 1 ,1 ,1, 1},
                {0 ,0 ,0 ,0, 1 ,1 ,1, 1 ,1},
                {0 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,1}
        };
        System.out.println(rowWithMax1s(arr));
    }
    private static int rowWithMax1s(int[][] arr) {
        int maxcount = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            int temp = 0;
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]==1)temp++;
            }
            if(maxcount<temp){
                maxcount = temp;
                ans = i;
            }
        }
        return ans;
    }
}
