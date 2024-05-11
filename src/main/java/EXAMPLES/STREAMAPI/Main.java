package EXAMPLES.STREAMAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(2);
//        list.add(1);
//        list.add(9);
//        list.add(8);
//        list.add(6);
//
//        Stream<Integer> stream = list.stream();
////        List<Integer> sortedList = stream.filter(i-> i>5).collect(Collectors.toList());
//        List<Integer> collected = stream.filter(x -> x < 5).map(x -> x).collect(Collectors.toList());
//        System.out.println(collected);
//
//        list = list.stream().sorted((x,y)->x-y).collect(Collectors.toList());
//        System.out.println(list);

//        List<Integer> list = Stream.iterate(1,i-> i<100,j -> j+10).collect(Collectors.toList());
//        int counts = (int)list.stream().count();
//        System.out.println(list);
//        System.out.println(counts);

//        Stream<String> stream = Stream.of("Amateur","Professional","Legendary");
//        Optional<String> optionals = stream.max((i, j)-> i.length()-j.length());
//        System.out.println(optionals.get());

//        Stream<String> stream = Stream.of("Amateur","Professional","Legendary");
//        Optional<String> any = stream.findAny();
//        System.out.println(any.get());

        Stream<Integer> infinite = Stream.generate(()->1);
        Predicate<Integer> pre = i->i==1;
        boolean b = infinite.anyMatch(pre);
        System.out.println(b);

    }
}
