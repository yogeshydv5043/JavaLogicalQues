package LambdaAndStream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithSummarizingInt {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        IntSummaryStatistics summaryStatistics = list.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Sum : " + summaryStatistics.getSum());
        System.out.println("Average : " + summaryStatistics.getAverage());
        System.out.println("Count : " + summaryStatistics.getCount());
        System.out.println("MAX : " + summaryStatistics.getMax());
        System.out.println("MIN : " + summaryStatistics.getMin());
    }
}
