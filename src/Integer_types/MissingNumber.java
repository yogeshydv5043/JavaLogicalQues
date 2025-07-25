package Integer_types;

public class MissingNumber {

    public static int isMissing(int[] arr, int n) {

        int expectSum = n * (n + 1) / 2;
        int actual = 0;
        for (int v : arr) {
            actual += v;
        }
        return expectSum - actual;

    }


    public static void main(String[] args) {

        int[] arr = {1, 2,3, 5, 6, 7, 8};

        System.out.println("Missing number is : "+isMissing(arr, 8));
    }
}
