package Generics;

class Square<T extends Number>{
    private T wall;

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }

    public Square(T wall) {
        this.wall = wall;
    }

    @Override
    public String toString() {
        return "Square{" +
                "wall=" + wall +
                '}';
    }

    public double getSurfaceArea(double x){
        double result = wall.doubleValue();
        return result * result;
    }
}

public class ChallangeGenericSquare {
    public static void main(String[] args) {
        Square<Integer> square = new Square<>(10);
        System.out.println(square.getSurfaceArea(square.getWall()));

        Square<Float> squareFloat = new Square<>(5.7f);
        System.out.println(squareFloat.getSurfaceArea(squareFloat.getWall()));

    }
}
