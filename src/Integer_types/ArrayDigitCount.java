package Integer_types;

import java.util.HashMap;
import java.util.Map;

public class ArrayDigitCount {

    public static Map<Integer, Integer> arrayDigitCount(int[] arr) {
        Map<Integer, Integer> values = new HashMap<>();
        for (Integer value : arr) {
            if (values.containsKey(value)) {
                values.compute(value, (k, v) -> v + 1);
            } else values.put(value, 1);
        }
        return values;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 6, 3, 6};
        Map<Integer, Integer> values = arrayDigitCount(arr);
        values.forEach((integer, integer2) -> System.out.println("Value : " + integer + " => Count : " + integer2));
    }
}
