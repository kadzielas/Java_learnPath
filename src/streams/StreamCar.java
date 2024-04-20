package streams;

import java.util.Comparator;
import java.util.Objects;

public class StreamCar implements Comparator<StreamCar> {
    public String name;
    public int topSpeed;
    public int price;
    public int rating;

    @Override
    public int compare(StreamCar o1, StreamCar o2) {
        return o1.name.compareTo(o2.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamCar streamCar = (StreamCar) o;
        return Objects.equals(name, streamCar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "StreamCar{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    public StreamCar(String name, int topSpeed, int price, int rating) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.price = price;
        this.rating = rating;
    }
}
