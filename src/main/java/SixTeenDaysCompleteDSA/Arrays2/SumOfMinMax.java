package SixTeenDaysCompleteDSA.Arrays2;

public class SumOfMinMax {
    public static void main(String[] args){
        int[] arr = {-2, 1, -4, 5, 3};

    }
    public static int findSum(int[] A,int N) {
        if(N==0)return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }
        return min+max;
    }
}
