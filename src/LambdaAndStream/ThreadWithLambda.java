package LambdaAndStream;

public class ThreadWithLambda {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread start ..")).start();
    }
}
