package Questions.Arrays;

public class MinMax {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -4, 5, 3};
        System.out.println(findSum(arr,arr.length));

    }
    public static int findSum(int A[],int N)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<A.length;i++){
            min = Math.min(A[i],min);
            max = Math.max(A[i],min);
        }
        return Math.abs(min+max);
    }
}
