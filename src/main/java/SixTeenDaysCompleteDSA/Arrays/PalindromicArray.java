package SixTeenDaysCompleteDSA.Arrays;

public class PalindromicArray {
    public static void main(String[] args) {
        System.out.println(palinArray(new int[]{121 ,131 ,20},3));
    }
    public static int palinArray(int[] a, int n) {
        if(a.length==0) return 0;
        for (int i = 0; i < a.length; i++) {
            String num = String.valueOf(a[i]);
            boolean checkPalin = check(num);
            if(!checkPalin){
                return 0;
            }
        }
        return 1;
    }

    private static boolean check(String num) {
        int l = 0;
        int r = num.length()-1;
        while (l<r){
            if(num.charAt(l)!=num.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }




    public static int palinArrayWithoutString(int[] a, int n) {
        if(a.length==0) return 0;
        for (int i = 0; i < a.length; i++) {
            int ans = 0;
            int temp = a[i];
            while(temp>0){
                int r = temp%10;
                temp/=10;
                ans = (ans*10)+r;
            }
            if(ans != a[i])return 0;
        }
        return 1;
    }
}
