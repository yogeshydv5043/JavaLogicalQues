package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class LambdaWithStreamMapToInt {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Java", "Pythan", "Nodejs", "DotNet");

        stringList.stream().mapToInt(String::length).forEach(System.out::println);
    }
}
