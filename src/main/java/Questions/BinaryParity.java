package Questions;

import java.util.ArrayList;
import java.util.List;

public class BinaryParity {
    public static void main (String[] args) throws java.lang.Exception
    {
//        int input = 4;
//        List<Integer> binaries = new ArrayList<>();
//        while(input>1){
//            int remainder = input%2;
//            binaries.add(remainder);
//            input /= 2;
//        }
//        binaries.add(input);
//        int sum = 0;
//        for (int i = 0;i<binaries.size();i++){
//            sum +=binaries.get(i);
//        }
//        if(sum%2 == 0){
//            System.out.println("EVEN");
//        }else{
//            System.out.println("ODD");
//        }
        int n = 13;
        while(n!=0){
            n &=(n-1);
        }
        System.out.println(n);
    }
}
