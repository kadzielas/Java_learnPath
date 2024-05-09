package threads.lifecycle;

public class TimedWaiting {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        Thread.sleep(200);
        System.out.println("Thread state: " + thread.getState());
    }
}
