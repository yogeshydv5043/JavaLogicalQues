package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class StreamPeek {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("MOHAN", "AMIT", "PANKAJ", "MANOJ");

        list.stream().peek(System.out::println).toList();
    }
}
