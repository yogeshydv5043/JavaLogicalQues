package LambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class StreamStringCounting {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rohan", "Sunil", "Sanjay", "Mohan", "Rohit");
        List<Integer> integerList = list.stream().map(String::length).toList();
        long value = list.size();
        integerList.forEach(System.out::println);
        System.out.println("Size : " + value);
    }


}
