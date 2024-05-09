package threads.lifecycle;

public class Terminated {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("Thread run");
            }
        });

        thread.start();
        Thread.sleep(10);
        System.out.println(thread.getState());

    }
}
