package Integer_types;

public class findPrime {
    public static boolean checkPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num=1;

        if(checkPrime(num)){
            System.out.println("this is prime number : "+num);
        }else {
            System.out.println("This is not prime number : "+num);
        }

    }
}
