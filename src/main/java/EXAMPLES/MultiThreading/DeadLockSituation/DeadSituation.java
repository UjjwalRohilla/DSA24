package EXAMPLES.MultiThreading.DeadLockSituation;

public class DeadSituation {


    public static void main(String[] args) {
        String lock1 = "ujjwal";
        String lock2 = "rohilla";
        System.out.println("Main Method/Thread started");

        Thread thread1 = new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Thread1 arrived");
                }
            }
        });

        Thread thread2 = new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("Thread2 arrived");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
