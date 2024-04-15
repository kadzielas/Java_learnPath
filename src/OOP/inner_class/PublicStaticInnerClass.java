package OOP.inner_class;

import OOP.interfaces.Car;

class CarObject {
    private String modelName;
    private String manufacturer;
    private int year;

    public static class CarObjectBuilder{

        private CarObject car = new CarObject();

        public CarObjectBuilder setModelName(String modelName){
            car.modelName = modelName;
            return this;
        }

        public CarObjectBuilder setManufacturer(String manufacturer) {
            car.manufacturer = manufacturer;
            return this;
        }

        public CarObjectBuilder setYear(int year){
            car.year = year;
            return this;
        }

        public CarObject getCar(){
            return this.car;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}

public class PublicStaticInnerClass {
    public static void main(String[] args) {

        CarObject car = new CarObject.CarObjectBuilder().setModelName("X5").setManufacturer("Niggy").setYear(2023).getCar();
        System.out.println(car.getModelName() + car.getManufacturer() + car.getYear());

        System.out.println(car);
    }
}
