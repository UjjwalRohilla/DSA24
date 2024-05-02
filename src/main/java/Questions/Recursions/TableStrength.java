package Questions.Recursions;

import java.util.ArrayList;
import java.util.List;

public class TableStrength {
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] arr = {5,5,6,8};
        List<Integer> ans = maximum(0,arr,0);
        int max = Integer.MIN_VALUE;
        for (int n : ans) {
            max = Math.max(max,n);
        }
        System.out.println(max);
    }
    public static List<Integer> maximum(int p, int[] up, int i){
        if(i>=up.length){
            List<Integer> list = new ArrayList<>();
            while(p>0){
                list.add(p%10);
                p = p/10;
            }
            int min = Integer.MAX_VALUE;
            for (int n : list) {
                min = Math.min(min,n);
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(min*list.size());
            return temp;
        }
        List<Integer> ans = new ArrayList<>();
        int n = up[i];
         ans.addAll(maximum((p*10)+n,up,i+1));
         ans.addAll(maximum(p,up,i+1));

         return ans;
    }
}
