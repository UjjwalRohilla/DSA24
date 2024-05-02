package SixTeenDaysCompleteDSA.Arrays;

public class MinimumJumpInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};

    }
    private static int minJumps(int[] arr){
        int jump = 0;
        int pos = 0;
        int des = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            des = Math.max(des,arr[i]+i);
            if(pos==i){
                pos = des;
                jump++;
            }
        }
        return jump;
    }

}
