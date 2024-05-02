package Questions.Maths;

import java.util.Scanner;

public class SumOfDigits {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int sum = 0;
            while(N!=0){
                sum+=N%10;
                N = N/10;
            }
            System.out.println(sum);
        }

    }
}
