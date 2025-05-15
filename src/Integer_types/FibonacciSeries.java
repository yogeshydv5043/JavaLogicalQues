package Integer_types;

public class FibonacciSeries {

    public static void fibonacci(int num){
        int first=0, second=1;

        for (int i=0;i<=num;i++){
            System.out.print( first+" ");
            int third=first+second;
            first=second;
            second=third;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
