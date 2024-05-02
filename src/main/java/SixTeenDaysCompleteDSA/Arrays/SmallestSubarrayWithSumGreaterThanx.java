package SixTeenDaysCompleteDSA.Arrays;

public class SmallestSubarrayWithSumGreaterThanx {

    public static void main(String[] args) {
        int[] a = {1 ,4 ,45 ,6 ,0 ,19};
        int x = 51;
        System.out.println(smallestSubWithSum(a,a.length,x));
    }

    // {1,4,45,6,0,19}
    public static int smallestSubWithSum(int[] a , int n, int x) {
        if(a.length==0)return 0;
        int i = 0,j=0;
        int sum=0;
        int minC = Integer.MAX_VALUE;
        while(i<=j && j<n){
            while(sum<=x && j<n){
                sum+=a[j++];
            }
            while (sum>x && i<j){
                minC = Math.min(minC,j-i+1);
                sum-=a[i];
                i++;
            }
        }
        return minC;
    }
}
