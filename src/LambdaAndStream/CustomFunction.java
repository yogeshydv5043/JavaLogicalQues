package LambdaAndStream;


public class CustomFunction {

    public static void main(String[] args) {
        Calculator add = Integer::sum;
        Calculator multiple = (int a, int b) -> a * b;
        Calculator sub = (int a, int b) -> a - b;
        System.out.println("Adding : -> " + add.calculate(21, 5));
        System.out.println("Multiple  : -> " + multiple.calculate(22, 5));
        System.out.println("Subtract : -> " + sub.calculate(75, 5));

    }


}
