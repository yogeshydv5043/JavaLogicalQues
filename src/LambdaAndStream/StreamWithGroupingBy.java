package LambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithGroupingBy {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "NodeJs", "Java", "Python", "NodeJs", "Java");

        Map<String, Long> languageCounts = languages.stream()
                .collect(Collectors.groupingBy(language -> language, Collectors.counting()));

        languageCounts.forEach((language, count) ->
                System.out.printf("Language: %-7s -> Count: %d%n", language, count)
        );
    }
}
