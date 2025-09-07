package J18_Multi_Threading;

public class MT02_ThreadExample2 {
    public static void main(String[] args) {

        MyRunnable runnable0 = new MyRunnable();
        Thread thread0 = new Thread(runnable0);
        thread0.start();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread1 = new Thread(runnable1);
        thread1.start();

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable thread " + Thread.currentThread().getName() + " is running.");
        }
    }
}