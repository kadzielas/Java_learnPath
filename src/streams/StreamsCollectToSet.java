package streams;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsCollectToSet {
    public static void main(String[] args) {

        ArrayList<StreamCar> cars = new ArrayList<>();
        cars.add(new StreamCar("Dodge", 250, 450, 4));
        cars.add(new StreamCar("Audi", 300, 6000, 5));
        cars.add(new StreamCar("Audi", 300, 6000, 5));
        cars.add(new StreamCar("BMW", 350, 6500, 5));
        cars.add(new StreamCar("Skoda", 150, 4500, 4));
        cars.add(new StreamCar("Skoda", 150, 4500, 4));
        cars.add(new StreamCar("Seat", 120, 3500, 3));

        Set<StreamCar> set = cars.stream().filter(e -> e.price > 1000)
                .collect(Collectors.toSet());

        set.forEach(e -> System.out.println(e));

    }
}
