package lambda;

interface Addition{
    int add(int a, int b);
}

interface MathOperation <T> {
    T operate(T a, T b);
}

public class LambdaBasics {

    public void test(Addition addition){
        System.out.println(addition.add(100,50));
    }

    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a + b;
        System.out.println(addition.add(11,6));

        LambdaBasics lambdaBasics = new LambdaBasics();
        lambdaBasics.test(addition);
        lambdaBasics.test((a,b) -> a*2 + b);

        MathOperation<Float> addition2 = (a,b) -> a + b;
        System.out.println(addition2.operate(10.0f, 6.0f));

        MathOperation<Integer> substraction = (a,b) -> a - b;
        System.out.println(substraction.operate(100, 77));

    }
}
