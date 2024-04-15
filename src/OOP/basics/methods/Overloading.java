package OOP.basics.methods;

class RectangleOverLoading {

    float side1, side2;
    RectangleOverLoading(){
        this(10.0f);
    }
    RectangleOverLoading(float v){
        side1 = side2 = v;
    }
    RectangleOverLoading(float side1, float side2){
        this.side1 = side1;
        this.side2 = side2;
    }
}
class MathOverloading {
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public int add(int a, int b){
        return a + b;
    }
    public float add(float a, float b){
        return a + b;
    }
}
public class Overloading {
    public static void main(String[] args) {
        MathOverloading math = new MathOverloading();
        int a = 12;
        int b = 3;
        System.out.println(math.add(a, b));
        float f1 = 10.0f;
        float f2 = 12.0f;
        System.out.println(math.add(f1, f2));

        int c = 5;
        System.out.println(math.add(a, b, c));

        RectangleOverLoading rect = new RectangleOverLoading();
        System.out.println(rect.side1);

        RectangleOverLoading rect2 = new RectangleOverLoading(12.0f);
        System.out.println(rect2.side1);
    }
}
