package Streame;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddByStream {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 74, 34, 44, 34, 35, 67};
        Arrays.stream(arr).filter(value -> value % 2 == 0).forEach(System.out::println);
        System.out.println("=========");
        Arrays.stream(arr).filter(v -> v % 2 != 0).forEach(System.out::println);

        // Step 1: Convert primitive int[] to Integer Stream
        Map<String, List<Integer>> grouped = Arrays.stream(arr)
                .boxed() // convert int -> Integer
                .collect(Collectors.groupingBy(i -> (i % 2 == 0) ? "Even" : "Odd"));

        // Step 2: Print grouped values
        System.out.println("Even Numbers:");
        grouped.getOrDefault("Even", Collections.emptyList())
                .forEach(System.out::println);

        System.out.println("=========");

        System.out.println("Odd Numbers:");
        grouped.getOrDefault("Odd", Collections.emptyList())
                .forEach(System.out::println);
    }

}
