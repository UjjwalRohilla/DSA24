package SixTeenDaysCompleteDSA.Arrays;

public class ThreeWayPartitioning {
    public void threeWayPartition(int[] array, int a, int b) {
        if(array.length==0)return;
        int n = array.length;
        int l = 0;
        int r = n-1;
        int i = 0;
        while(i<=r){
            if(array[i]<a){
                swap(array,l,i);
                l++;
                i++;
            } else if (array[i] > b) {
                swap(array,i,r);
                r--;
            }else {
                i++;
            }
        }
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
