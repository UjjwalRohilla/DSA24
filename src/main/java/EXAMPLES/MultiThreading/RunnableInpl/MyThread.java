package EXAMPLES.MultiThreading.RunnableInpl;

public class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10;i++){
            System.out.println("Value of i is "+i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }


}
