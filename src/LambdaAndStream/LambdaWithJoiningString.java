package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaWithJoiningString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "C##", "Pythan", "DotNet");

        String join = list.stream().collect(Collectors.joining(" , "));

        System.out.println(join);
    }
}
