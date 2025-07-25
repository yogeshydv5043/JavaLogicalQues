package LambdaAndStream;

import java.util.function.Supplier;

public class LambdaWithSupplier {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Java";
        System.out.println(supplier.get());
    }
}
