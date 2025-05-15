package Integer_types;

public class SumOfArray {

    public static int sumOfArray(int[] array) {
        int sum = 0;

        //Using For Each Loop
//            for (int num : array) {
//                sum += num;
//            }

        // Using For Loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {10, 30, 40, 30, 60, 40};
        int sum = sumOfArray(array);
        System.out.println("Array of Sum : " + sumOfArray(array));
    }
}
