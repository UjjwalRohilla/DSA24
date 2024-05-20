package EXAMPLES.InnerClasses;

import java.util.Random;

public class Outer {
    private final static int A = 10;
    private int outerNumber;
    private class inner{
        int a = 4;
        public void showCards() {
            System.out.println(Outer.A-this.a+outerNumber);
        }
    }

    public Outer(int outerNumber) {
        this.outerNumber = outerNumber;
    }
    private void callInnerMethod(Outer.inner inner){
        inner.showCards();
    }

    public static void main(String[] args) {
        inner inner = new Outer(11).new inner();
        inner.showCards();
    }
}
