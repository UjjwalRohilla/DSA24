package Questions.Arrays;

import java.util.Arrays;

public class MoveAllNegNumToEnd {
    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-7,-5,11,6};
        segregateElements(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void segregateElements(int[] arr, int n) {
        int[] ans = new int[arr.length];
        int start = 0;
        int end = ans.length-1;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]<0){
                ans[end] = arr[i];
                end--;
            }else{
                ans[start] = arr[i];
                start++;
            }
        }
        int s = start;
        int l = ans.length-1;
        while(s<l){
            swap(ans,s,l);
            s++;
            l--;
        }
        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    private static void swap(int[] ans, int s, int l) {
        int temp = ans[s];
        ans[s] = ans[l];
        ans[l] = temp;
    }
}
