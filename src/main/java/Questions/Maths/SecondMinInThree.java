package Questions.Maths;

import java.util.Scanner;

public class SecondMinInThree {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        for (int i = 0; i < t; i++) {
            int a = x.nextInt();
            int b = x.nextInt();
            int c = x.nextInt();
            if((a<b && a>c) || (a>b && a<c)){
                System.out.println(a);
            }else if((b<a && b>c) || (b>a && b<c)){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }

    }
}
