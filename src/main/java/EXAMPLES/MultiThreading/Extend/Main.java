package EXAMPLES.MultiThreading.Extend;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Thread1 thread1 = new Thread1("thread1");
        thread1.start();
        System.out.println("Main Thread ended");

    }

}
