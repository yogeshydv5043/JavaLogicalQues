package Integer_types;

import java.util.Scanner;

public class Factorial_ForLoop {

    public static void main(String[] args) {

        System.out.print("Enter the digit : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        sc.close();
        System.out.println("Factorial of "+num+" is : "+fact);
    }
}
