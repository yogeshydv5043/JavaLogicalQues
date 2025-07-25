package LambdaAndStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaWithComparator {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("MOHAN", "AMIT", "PANKAJ", "MANOJ");
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
