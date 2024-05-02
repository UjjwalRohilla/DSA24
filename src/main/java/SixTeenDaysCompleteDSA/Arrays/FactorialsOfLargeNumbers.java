package SixTeenDaysCompleteDSA.Arrays;

import java.util.ArrayList;


//PENDING
public class FactorialsOfLargeNumbers {
    public static void main(String[] args) {
        System.out.println(factorial(897));
    }
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> ans = new ArrayList<>();

        int n = 2;
        int factorial = 1;
        while(n<=N){
            factorial *=n;
            n++;
        }
        ans.add(factorial);
        return ans;
    }
}
