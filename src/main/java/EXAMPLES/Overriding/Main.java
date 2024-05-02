package EXAMPLES.Overriding;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(56);
        B obj2 = new B();
        B.checking();
    }

}
