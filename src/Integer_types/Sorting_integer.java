package Integer_types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting_integer {

    public static void main(String[] args) {

        int[] arr = {1, 6, 84, 3, 7};
        int n = arr.length;

//By Stream API
        Arrays.stream(arr).sorted().forEach(System.out::println);
//        By manually
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { //> < for asc and desc
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


}
