//package collections;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//class Car{
//    private String name;
//    private int year;
//
//        public Car(String name, int year) {
//            this.name = name;
//            this.year = year;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public int getYear() {
//            return year;
//        }
//
//        public void setYear(int year) {
//            this.year = year;
//        }
//
//        @Override
//        public String toString() {
//            return "Car{" +
//                    "name='" + name + '\'' +
//                    ", year=" + year +
//                    '}';
//        }
//    }
//
//public class Iteration {
//    public static void main(String[] args) {
//
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(new Car("Opel", 2013));
//        cars.add(new Car("Ford", 2020));
//        cars.add(new Car("Audi", 2019));
//
////FOR
//        for (int i = 0; i < cars.size(); i++){
//            Car car = cars.get(i);
//            System.out.println(car);
//        }
//
//        System.out.println(" ");
//
////FOREACH
//        for(Car car : cars){
//            System.out.println(car);
//        }
//
//        System.out.println(" ");
//
////Iterator
//        Iterator<Car> iterator = cars.iterator();
//        while (iterator.hasNext()){
//            Car car = iterator.next();
//            System.out.println(car);
//        }
//
//    }
//}
