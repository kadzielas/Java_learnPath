package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Car {
    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(name, car.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}

public class HashSetChallenge {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");
        names.add("Ola");
        names.add("Kasia");
        names.add("Adam");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet<Car> cars = new HashSet<>();
        Car car1 = new Car("Dodge");
        Car car2 = new Car("Citroen");
        Car car3 = new Car("Opel");
        cars.add(car1);
        cars.add(car1);
        cars.add(car2);
        cars.add(car2);
        cars.add(car3);
        cars.add(car3);

        Iterator<Car> iterator1 = cars.iterator();
        while (iterator1.hasNext()){
            Car str = iterator1.next();
            System.out.println(str);
        }

    }
}
