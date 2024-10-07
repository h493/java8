package optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    static Optional<String> ofNullable(){

//        return Optional.ofNullable("string");
        return Optional.ofNullable(null);
    }

    static Optional<String> of(){

        return Optional.of("String");
       // return Optional.of(null); ***Need to pass value
    }

    static Optional<String> empty(){

        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(ofNullable());
        System.out.println(of());
        System.out.println(empty());
    }
}
