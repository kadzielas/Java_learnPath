package streams;

import java.util.ArrayList;

public class StreamsBasics {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Asia");
        arr.add("Dominik");
        arr.add("Adam");
        arr.add("Ola");
        arr.add("Daniel");

        arr.stream().filter(e -> e.length() > 3 && e.length() < 7)
                .filter( e -> e.startsWith("A") || e.startsWith("D"))
                .forEach(e -> System.out.println(e));

        ArrayList<StreamCar> cars = new ArrayList<>();
        cars.add(new StreamCar("Dodge", 250, 450, 4));
        cars.add(new StreamCar("Audi", 300, 6000, 5));
        cars.add(new StreamCar("BMW", 350, 6500, 5));
        cars.stream().filter(e -> e.price > 1000)
                .forEach(e -> System.out.println(e));
    }
}
