package String_types;

import java.util.HashMap;
import java.util.Map;

public class StringOccurrences {

    public static Map<String, Integer> occurrences(String[] strArr) {

        Map<String, Integer> values = new HashMap<>();
        for (String str : strArr) {
            if (values.containsKey(str)) {
                values.compute(str, (k, v) -> v + 1);
            } else {
                values.put(str, 1);
            }
        }
        return values;
    }

    public static void main(String[] args) {
        String[] strArr = {"Mohit", "Amit", "Rohan", "Manoj", "Mohit", "Amit", "Yogi"};
        Map<String, Integer> result = occurrences(strArr);
        result.forEach((k, v) -> System.out.println("Name : " + k + " " + "Count : " + v));

    }
}
