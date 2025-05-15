import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (values.containsKey(complement)) {
                return new int[]{values.get(complement), i};
            }
            values.put(arr[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 6, 3};
        int[] result = twoSum(arr, 7);

        for (int v : result) {
            System.out.println("Index: " + v);
        }
    }
}