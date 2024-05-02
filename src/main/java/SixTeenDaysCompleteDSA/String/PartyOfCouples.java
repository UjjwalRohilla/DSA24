package SixTeenDaysCompleteDSA.String;


//Link
//https://www.geeksforgeeks.org/problems/alone-in-couple5507/1
public class PartyOfCouples {
    static int findSingle(int n, int[] arr){
        if(arr.length==0)return 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
}
