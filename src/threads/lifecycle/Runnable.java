package threads.lifecycle;


public class Runnable {
    public static void main(String[] args) {

        Thread thread = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    try {
                        Thread.sleep(400);
                        System.out.println(i);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
        System.out.println(thread.getState());

    }
}
