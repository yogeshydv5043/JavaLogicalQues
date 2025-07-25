package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class StreamWithLimit {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("MOHAN", "AMIT", "PANKAJ", "MANOJ");
        list.stream().limit(2).forEach(System.out::println);
    }

}
