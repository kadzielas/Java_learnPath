package exceptions;

class TestException extends Exception {
    public TestException() {
        super("TestException happened");
    }

    public TestException(String message) {
        super(message);
    }


}

public class ThrowException {

    public int test(int number) throws TestException {
        if(1 == 1) throw new TestException();
        return 1;
    }
    public int divide(int number, int divisor) throws ArithmeticException {
        return number / divisor;
    }

    public static void main(String[] args) {

        try {

            int numArr[] = {0,1,2,3,4,5};
            int a = numArr[2];
            int divisor = numArr[0];

            if(divisor == 0) throw new ArithmeticException("Dzielenie przez zero");

        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally code");
        }


        //        catch (Exception exception){
//            exception.printStackTrace();
//        }

        System.out.println("Program continues");

        ThrowException throwException = new ThrowException();

        try {
            throwException.divide(10,0);
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            throwException.test(10);
        }catch (TestException exception){
            exception.printStackTrace();
        }

    }
}
