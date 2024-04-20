package streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsCollectorsToMap {
    public static void main(String[] args) {

        ArrayList<StreamCar> cars = new ArrayList<>();
        cars.add(new StreamCar("Dodge", 250, 450, 4));
        cars.add(new StreamCar("Audi", 300, 6000, 5));
        cars.add(new StreamCar("BMW", 350, 6500, 5));
        cars.add(new StreamCar("Skoda", 150, 4500, 4));
        cars.add(new StreamCar("Seat", 120, 3500, 3));

        Map<String, StreamCar> carsMap = cars.stream()
                .collect(Collectors.toMap(car -> car.name, car -> car));
        System.out.println(carsMap);

        StreamCar car1 = carsMap.get("BMW");
        System.out.println(car1);

    }
}
