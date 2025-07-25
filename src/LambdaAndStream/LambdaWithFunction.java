package LambdaAndStream;

import java.util.function.Function;

public class LambdaWithFunction {
    public static void main(String[] args) {

        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("LambdaAndStream"));
    }
}
