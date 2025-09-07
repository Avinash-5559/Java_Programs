package J18_Multi_Threading;

public class MT01_ThreadExample1 {
    public static void main(String[] args) {

        MyThread thread0 = new MyThread();
        thread0.start();

        MyThread thread1 = new MyThread();
        thread1.start();

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
                //Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        }
    }
}