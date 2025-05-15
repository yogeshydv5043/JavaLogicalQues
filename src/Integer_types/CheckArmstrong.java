package Integer_types;

import java.util.Scanner;


public class CheckArmstrong {

    public static boolean isArmstrong(int num) {
        int reminder, result = 0;
        int original = num;
        while (num > 0) {
            reminder = num % 10;
            int cube = reminder * reminder * reminder;
            result = result + cube;
            num = num / 10;
        }
        return result == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
        scanner.close();
    }
}