package streams;

import java.util.Optional;

public class StreamsOptionalFilter {
    public static void main(String[] args) {
//        Optional<String> opt = Optional.ofNullable("Tekst");
        Optional<String> opt = Optional.ofNullable(null);

        opt.map(str -> str + " oraz informacje")
                .filter(str -> str.length() > 5)
                .or(() -> Optional.ofNullable("Nowy string"))
                .ifPresent(System.out::println);
    }
}
