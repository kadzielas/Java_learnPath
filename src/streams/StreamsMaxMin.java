package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMaxMin {
    public static void main(String[] args) {

        ArrayList<StreamCar> cars = new ArrayList<>();
        cars.add(new StreamCar("Dodge", 250, 450, 4));
        cars.add(new StreamCar("Audi", 300, 6000, 5));
        cars.add(new StreamCar("BMW", 350, 6500, 5));
        cars.add(new StreamCar("Skoda", 150, 4500, 4));
        cars.add(new StreamCar("Seat", 120, 3500, 3));

        StreamCar carHighestPrice = cars.stream()
                .max((car1, car2) -> car1.price > car2.price ? 1 : -1)
                .get();
        System.out.println(carHighestPrice);

        StreamCar carLowestPrice = cars.stream()
                .min((car1, car2) -> car1.price > car2.price ? 1 : -1)
                .get();
        System.out.println(carLowestPrice);
    }
}
