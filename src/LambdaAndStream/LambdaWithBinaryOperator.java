package LambdaAndStream;

import java.util.function.BinaryOperator;

public class LambdaWithBinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(10, 20));
    }
}
