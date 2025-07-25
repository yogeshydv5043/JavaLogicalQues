package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class StreamWithMaxInteger {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 5, 43, 4);

        int max = list.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);

        System.out.println("MAX VALUE : " + max);
    }
}
