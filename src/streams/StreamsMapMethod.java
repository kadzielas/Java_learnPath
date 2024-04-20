package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsMapMethod {
    public static void main(String[] args) {

        ArrayList<StreamCar> cars = new ArrayList<>();
        cars.add(new StreamCar("Dodge", 250, 450, 4));
        cars.add(new StreamCar("Audi", 300, 6000, 5));
        cars.add(new StreamCar("BMW", 350, 6500, 5));
        cars.add(new StreamCar("Skoda", 150, 4500, 4));
        cars.add(new StreamCar("Seat", 120, 3500, 3));

        List<Integer> carsPrice = cars.stream()
                .filter(e -> e.price < 4000)
                .map(StreamCar::getPrice).collect(Collectors.toList());
                System.out.println(carsPrice);
    }
}
