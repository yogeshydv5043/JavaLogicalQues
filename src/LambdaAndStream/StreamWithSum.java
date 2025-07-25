package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class StreamWithSum {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 5, 43, 4);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println("SUM : " + sum);
    }


}
