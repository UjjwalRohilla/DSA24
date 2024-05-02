package Questions.Arrays;

import java.util.Arrays;

public class KthElement {
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        if(arr.length == 0)return 0;
        Arrays.sort(arr);
        return arr[k-1];
    }
}
