package EXAMPLES.MultiThreading.RunnableInpl;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1 lambda iterate = "+i);
            }
        });

        Runnable runnable = ()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 2 lambda iterate = "+i);
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
