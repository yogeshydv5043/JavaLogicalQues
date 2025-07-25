package LambdaAndStream;

import java.util.function.Predicate;

public class LambdaWithPredicate {

    public static void main(String[] args) {

        Predicate<String> result = String::isEmpty;
        System.out.println(result.test(""));
        System.out.println(result.test("Java"));
    }
}
