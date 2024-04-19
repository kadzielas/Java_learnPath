package lambda;

@FunctionalInterface
interface MathInterface{
    int operate(int a, int b);
    default int add(int a, int b) {
        return a + b;
    }
    default int substract(int a, int b){
        return a - b;
    }
    default int multiply(int a, int b){
        return a * b;
    }
    default int divide(int a, int b){
        return a / b;
    }
}

class MathClass implements MathInterface{
    @Override
    public int multiply(int a, int b) {
        System.out.println("MathClass multiply");
        return a * b;

    }

    @Override
    public int operate(int a, int b) {
        System.out.println("MathClass operate");
        return a + b;
    }
}

public class DefaultMethodsInterface {
    public static void main(String[] args) {

        MathInterface math = (int a, int b) -> a * b;

        System.out.println(math.operate(10,30));
        System.out.println(math.substract(50, 20));
        System.out.println(math.divide(100,25));

        MathClass mathClass = new MathClass();
        System.out.println(mathClass.operate(100,100));
        System.out.println(mathClass.multiply(20,40));
        System.out.println(mathClass.substract(300,150));

    }
}
