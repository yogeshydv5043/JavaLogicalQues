package LambdaAndStream;

import java.util.HashMap;
import java.util.Map;

public class LambdaWithMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(10, 15);
        map.put(20, 25);
        map.put(30, 35);
        map.forEach((a, b) -> System.out.println(a + " -> " + b));
    }

}
