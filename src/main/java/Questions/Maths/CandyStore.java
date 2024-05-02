package Questions.Maths;

import java.util.Scanner;

public class CandyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int ans = 0;
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(x>=y){
                System.out.println(y);
                break;
            }
            ans = x + ((y-x)*2);
            System.out.println(ans);
        }
    }
}
