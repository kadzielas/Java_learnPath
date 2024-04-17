package Generics;

class Point<T>{
    private T x;
    private T y;
    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }
    public T getX() {
        return x;
    }
    public void setX(T x) {
        this.x = x;
    }
    public T getY() {
        return y;
    }
    public void setY(T y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Trio<T, U, V>{
    private T first;
    private U second;
    private V third;

    public Trio(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Trio{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}

public class genericsBasic {
    public static void main(String[] args) {

        Point<Integer> pointInt = new Point<>(10,20);
        System.out.println(pointInt.toString());

        Point<String> pointString = new Point<>("Hel", "lo");
        System.out.println(pointString.toString());

        Trio<String, String, Integer> myInfo = new Trio<>("Sebastian", "Kadziela", 23);
        System.out.println(myInfo.toString());
        myInfo.setFirst("Aha");
        System.out.println(myInfo.toString());
        System.out.println(myInfo.hashCode());

    }
}
