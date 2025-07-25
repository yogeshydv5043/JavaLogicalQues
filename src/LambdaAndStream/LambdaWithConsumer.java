package LambdaAndStream;

import java.util.function.Consumer;

public class LambdaWithConsumer {

    public static void main(String[] args) {
        Consumer<String> result = s -> System.out.println(s);
        result.accept("Hello World !! ");
    }

}
