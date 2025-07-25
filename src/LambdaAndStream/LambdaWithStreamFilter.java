package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class LambdaWithStreamFilter {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1, 2, 3, 45, 66, 7, 8, 89, 8, 6, 50);

        List<Integer> evenNumber = arr.stream().filter(x -> x % 2 == 0).toList();

        evenNumber.forEach(System.out::println);
    }
}
