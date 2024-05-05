package streams;

import java.util.Optional;

public class StreamsOptionalCreateOfNullableEmpty {
    public static void main(String[] args) {
        // Optional.of() can not be null
        Optional<String> opt1 = Optional.of("Test");
        System.out.println(opt1.get());

        //error
        //Optional<String> opt2 = Optional.of(null);

        Optional<String> opt3 = Optional.ofNullable("Optional 3");
        System.out.println(opt3.get());

        Optional<String> opt4 = Optional.ofNullable(null);
        System.out.println(opt4);

        Optional<String> opt5 = Optional.empty();
        System.out.println(opt5);

        Integer integer = Integer.valueOf(10);
        Optional<Integer> optInt = Optional.ofNullable(integer);
        if (optInt.isPresent()){
            System.out.println(optInt);
        } else {
            System.out.println("null xd");
        }

        optInt.ifPresent(i -> System.out.println(i));
        optInt.ifPresent(System.out::println);
    }
}
