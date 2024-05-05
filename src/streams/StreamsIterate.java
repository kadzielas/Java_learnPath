package streams;

import java.util.stream.Stream;

public class StreamsIterate {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1).limit(10)
                .forEach(s -> System.out.println(s));

        System.out.println("\n");

        Stream.iterate(0, n -> n < 5, n -> n + 1)
                .forEach(s -> System.out.println(s));

    }
}
