package collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car2{
    private String name;
    private int year;

        public Car2(String name, int year) {
            this.name = name;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

public class Iteration {
    public static void main(String[] args) {

        ArrayList<Car2> cars = new ArrayList<>();
        cars.add(new Car2("Opel", 2013));
        cars.add(new Car2("Ford", 2020));
        cars.add(new Car2("Audi", 2019));

//FOR
        for (int i = 0; i < cars.size(); i++){
            Car2 car = cars.get(i);
            System.out.println(car);
        }

        System.out.println(" ");

//FOREACH
        for(Car2 car : cars){
            System.out.println(car);
        }

        System.out.println(" ");

//Iterator
        Iterator<Car2> iterator = cars.iterator();
        while (iterator.hasNext()){
            Car2 car = iterator.next();
            System.out.println(car);
        }

    }
}
