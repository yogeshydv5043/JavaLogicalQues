package LambdaAndStream;

public class LambdaWithRunnable {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello World !! ");
        new Thread(r).start();
    }

}
