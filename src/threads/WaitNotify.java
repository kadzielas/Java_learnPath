package threads;

import java.util.LinkedList;

class House{
    public LinkedList<String> delivery = new LinkedList<>();

    public void waitForDelivery(){
        synchronized (delivery) {
            System.out.println("Waiting for delivery.");
            while (delivery.isEmpty()){
                try {
                    delivery.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            System.out.println("Pizza has been received: " + delivery.poll());
        }
    }

    public void pizzaGuy(){
        synchronized (delivery){
            System.out.println("Pizza has been delivered!");
            delivery.add("Special pizza");
            delivery.notify();
        }
    }
}
public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        House house = new House();
        Thread customer = new Thread(new Runnable() {
            @Override
            public void run() {
                house.waitForDelivery();
            }
        });
        customer.start();

        Thread.sleep(3000);

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                house.pizzaGuy();
            }
        });

        producer.start();
        customer.join();

    }
}
