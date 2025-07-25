package LambdaAndStream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaWithCheckEvenNumber {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;

        Integer[] numbers = {2, 32, 33, 44, 67};

        Map<Integer, Boolean> numberParityMap = Arrays.stream(numbers)
                .collect(Collectors.toMap(number -> number, isEven::test));

        numberParityMap.forEach((number, isEvenResult) ->
                System.out.printf("%d -> %b%n", number, isEvenResult)
        );

    }
}
