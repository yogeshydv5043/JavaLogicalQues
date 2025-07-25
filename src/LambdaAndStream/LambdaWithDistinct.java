package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class LambdaWithDistinct {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 5, 7, 8);

        List<Integer> integerList = list.stream().distinct().toList();
        list.forEach(System.out::print);
        System.out.println(" ");
        integerList.forEach(System.out::print);
    }
}
