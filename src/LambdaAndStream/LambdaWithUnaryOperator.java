package LambdaAndStream;

import java.util.function.UnaryOperator;

public class LambdaWithUnaryOperator {

    public static void main(String[] args) {

        UnaryOperator<Integer> square = (a) -> a * a;
        System.out.println(square.apply(5));
    }
}
