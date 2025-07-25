package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithToMap {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("MOHAN", "AMIT", "PANKAJ", "MANOJ");

        Map<String, Integer> map = list.stream().collect(Collectors.toMap(x -> x, String::length));

        map.forEach((a, b) -> System.out.println(a + " :-> " + b));
    }
}
