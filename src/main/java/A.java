public class A {
    int a;

    public A(int a) {
        this.a = a;
    }

    class B{
        int b;
        public B(int b) {
            this.b = b;
        }
    }

    public static void main(String[] args) {
        A obj = new A(2);
        B obj2 = obj.new B(3);
        B obj3 = new A(1).new B(5);
    }
}
