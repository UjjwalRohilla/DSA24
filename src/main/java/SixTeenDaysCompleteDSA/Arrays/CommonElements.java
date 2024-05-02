package SixTeenDaysCompleteDSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {

//        int[] A = {1, 5, 10, 20, 40, 80};
//        int[] B = {6, 7, 20, 80, 100};
//        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        int[] A = {1,1,1};
        int[] B = {1,1,1};
        int[] C = {1,1,1};


        ArrayList<Integer> ans = commonElements(A,B,C,A.length,B.length,C.length);
        System.out.println(ans);
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        if(n1==0 || n2==0 || n3==0) return new ArrayList<>();

        int a = 0;
        int b = 0;
        int c = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(a<n1 && b<n2 && c<n3){
            if(A[a] == B[b] && B[b]==C[c]){
                ans.add(A[a]);
                a++;b++;c++;
                while((a<n1 && b<n2 && c<n3) && (A[a]==A[a-1] && B[b]==B[b-1] && C[c]==C[c-1])){
                    a++;b++;c++;
                }
            } else if (A[a] < B[b] && A[a] < C[c]) {
                a++;
            } else if (B[b] < A[a] && B[b] < C[c]) {
                b++;
            }else {
                c++;
            }
        }
        return ans;
    }
}

