package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class LambdaWithStreamReduce {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 3, 54, 66, 7, 89, 8, 5, 43, 23, 44);

        int sum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("SUM : " + sum);
    }
}
