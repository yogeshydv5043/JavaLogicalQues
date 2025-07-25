package LambdaAndStream;

import java.util.Optional;

public class LambdaWithOptional {


    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");

        optional.ifPresent(s -> System.out.println("Value is : " + s));
    }
}
