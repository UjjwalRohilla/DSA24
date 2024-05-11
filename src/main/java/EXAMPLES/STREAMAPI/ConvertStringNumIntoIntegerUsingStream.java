package EXAMPLES.STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringNumIntoIntegerUsingStream {
    public static void main(String[] args) {
        String[] str = {"1","2","3"};
        List<Integer> strToNum = convertToInteger(str);
        int total = 0;
        for (int n : strToNum) {
            System.out.print(total+ " + " + n + " = ");
            total += n;
            System.out.println(total);
            System.out.println();
        }
    }
    public static List<Integer> convertToInteger(String[] nums){
         return Arrays.stream(nums).map(i -> Integer.parseInt(i)).collect(Collectors.toList());
    }
}
