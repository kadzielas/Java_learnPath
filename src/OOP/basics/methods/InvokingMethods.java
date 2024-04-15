package OOP.basics.methods;

class Triangle {
    float a; // długość podstawy trójkąta
    float h; // wysokość trójkąta
    float surfaceArea; // pole powierzchni

    Triangle(float base, float height) {
        this.a = base;
        this.h = height;
    }
}

class MyMath {
    public void add(int a, int b) {
        a = 20;
        int result = a + b;
        System.out.println("result: " + result);
    }

    public void triangleSurface(Triangle tri) {
        tri.surfaceArea = (tri.a*tri.h)/2;
    }
}

public class InvokingMethods {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int a = 10;
        int b = 7;
        math.add(a, b);
        System.out.println("a: " + a); // a: 10 , gdy w metodzie a jest równe 20, więc wynik wychodzi 27
        Triangle triangle = new Triangle(10.0f, 5.0f);
        math.triangleSurface(triangle); // wywołanie metody z klasy MyMath, jako argument metody podajemy
        // obiekt klasy Triangle, czyli przekazanie danych do metody przez referencję
        System.out.println(triangle.surfaceArea); // 25

    }
}
