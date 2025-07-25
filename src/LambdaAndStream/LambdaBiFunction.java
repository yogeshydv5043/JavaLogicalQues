package LambdaAndStream;

import java.util.function.BiFunction;

public class LambdaBiFunction {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(12, 8));
    }
}
