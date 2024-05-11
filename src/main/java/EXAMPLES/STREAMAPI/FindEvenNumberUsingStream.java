package EXAMPLES.STREAMAPI;

import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumberUsingStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filterEvenNumbers(list));
    }
    private static List<Integer> filterEvenNumbers(List<Integer> list){
        return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }
}
