package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithPartitioning {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> partition = data.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        partition.forEach((a, b) -> System.out.println(a + " -> " + b));
    }
}
