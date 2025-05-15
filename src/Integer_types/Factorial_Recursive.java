package Integer_types;

public class Factorial_Recursive {

    public static long factorial(int num){
        if(num==0 || num ==1 )
            return num;
        else {
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
