package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class StreamSkip {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("MOHAN", "AMIT", "PANKAJ", "MANOJ");

        list.stream().skip(3).forEach(System.out::println);
    }
}
