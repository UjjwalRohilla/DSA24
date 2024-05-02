package SixTeenDaysCompleteDSA.Arrays;

public class MinimumSwapsAndKTogether {
    public static int minSwap (int[] arr, int n, int k) {
        if(arr.length==0)return 0;

        int fav = 0;
        int nonFav = 0;
        for (int j : arr) {
            if (j <= k) fav++;
        }
        for (int i = 0; i < fav; i++) {
            if(arr[i]>k)nonFav++;
        }
        int l = 0;
        int r = fav-1;
        int res = Integer.MAX_VALUE;
        while (r<n){
            res = Math.min(res,nonFav);
            r++;
            if(r<n && arr[r]>k) nonFav++;
            if(r<n && arr[l]>k) nonFav--;
            l++;
        }
        return (res==Integer.MAX_VALUE)?0:res;
    }
}
