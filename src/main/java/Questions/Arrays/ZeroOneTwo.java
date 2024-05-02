package Questions.Arrays;

public class ZeroOneTwo {
    public static void sort012(int a[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;mid++;
            }else if(a[mid]==2){
                swap(a,mid,high);
                high--;
            }else{
                mid++;
            }
        }
    }
    public static void swap(int a[],int first , int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
