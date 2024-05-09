package threads.lifecycle;

class TestThread extends Thread{
    Thread mainThread;
    public TestThread(String name, Thread mainThread) {
        super(name);
        this.mainThread = mainThread;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started.");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println("Main thread state: " + mainThread.getState());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(getName() + " finished.");
    }
}
public class Waiting {
    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = Thread.currentThread(); // Main thread

        TestThread thread1 = new TestThread("thread1", mainThread);

        thread1.start();
        thread1.join();

        System.out.println("Main thread.");

    }
}
