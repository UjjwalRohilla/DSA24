package SixTeenDaysCompleteDSA.Arrays3;

import java.util.ArrayList;
import java.util.List;

public class FindTheUnion {
    public static int doUnion(int[] a, int n, int[] b, int m) {
        if(n==0 || m==0)return 0;

        int x = 0;
        int y = 0;

        List<Integer> list = new ArrayList<>();

        while(x<n && y<m){
            //remove duplicates

            while(x>0 && x<n && a[x] == a[x-1]){
                x++;
            }
            while(y>0 && y<m && b[y] == b[y-1]){
                y++;
            }

            //
            if(x>=n){
                list.add(b[y]);
                y++;
                continue;
            }
            if(y>=m){
                list.add(a[x]);
                x++;
                continue;
            }


            //
            if(a[x]< b[y]){
                list.add(a[x]);
                x++;
            } else if (a[x] > b[y]) {
                list.add(b[y]);
            }else {
                list.add(a[x]);
                x++;
                y++;
            }
        }
        return list.size();
    }
}
