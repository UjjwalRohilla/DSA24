package EXAMPLES.Overriding;

public class A {
    private int abc = 5;
    public void print(){
        System.out.println("this is A class method");
    }

    public A() {
    }
    public static void checking(){
        System.out.println("Static method in A");
    }

    public A(int abc) {
        this.abc = abc;
    }

    public CharSequence setAbc(int abc) {
        this.abc = abc;
        return "";
    }

    @Override
    public String toString() {
        return "A{" +
                "abc=" + abc +
                '}';
    }
}
