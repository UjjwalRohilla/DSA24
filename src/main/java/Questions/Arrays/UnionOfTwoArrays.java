package Questions.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3,3,3};
        int[] b = {3,3,3,4};
        System.out.println(intersection(a,b));
    }
    public static int doUnion(int[] a, int[] b) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a.length || j<b.length){
            //skip duplicate
            while(i>0 && i<a.length && a[i]==a[i-1]){
                i++;
            }
            while(j>0 && j<b.length && b[j]==b[j-1]){
                j++;
            }
            //
            if(i>=a.length){
                ans.add(b[j]);
                j++;
                continue;
            }
            if(j>=b.length){
                ans.add(a[i]);
                i++;
                continue;
            }
            //comparison
            if(a[i]>b[j]){
                ans.add(b[j]);
                j++;
            } else if (a[i]<b[j]) {
                ans.add(a[i]);
                i++;
            }else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans.size();
    }
    public static int intersection(int[] a, int[] b) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a.length || j<b.length){
            //skip duplicate
            while(i>0 && i<a.length && a[i]==a[i-1]){
                i++;
            }
            while(j>0 && j<b.length && b[j]==b[j-1]){
                j++;
            }

            if(i>=a.length || j>=b.length){
                break;
            }

            //comparison
            if(a[i]>b[j]){
                j++;
            } else if (a[i]<b[j]) {
                i++;
            }else{
                intersection.add(a[i]);
                i++;
                j++;
            }
        }
        return intersection.size();
    }
}
