package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class SortListWithLambda {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("Monday", "Rohan", "Mukesh", "Pune");
        list.sort(String::compareTo);
        list.forEach(System.out::println);
    }
}
