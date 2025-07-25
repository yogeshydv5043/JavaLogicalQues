package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaWithToSet {

    public static void main(String[] args) {

        List<String> data = Arrays.asList("Java", "NodeJs", "Java", "NodeJs");

        Set<String> setData = data.stream().collect(Collectors.toSet());

        setData.forEach(System.out::println);
    }
}
