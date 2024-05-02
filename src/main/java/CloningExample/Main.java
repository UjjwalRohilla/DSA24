package CloningExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        SupportsClonable obj1 = new SupportsClonable(5,list);
        SupportsClonable obj2 = obj1.clone();
        System.out.println(obj2==obj1);
        System.out.println(obj1.getList()==obj2.getList());
        System.out.println(obj1.getSize()==obj2.getSize());
    }
}
