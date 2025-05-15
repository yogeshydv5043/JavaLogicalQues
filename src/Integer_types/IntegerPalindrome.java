package Integer_types;

public class IntegerPalindrome {

    public static boolean isPalindrome(int num){
        if(num<0) return false;
        int original=num;
        int temp=0;
        while(num>0){
            temp=temp*10+num%10;
            num/=10;
        }
        return original==temp;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-101));
        System.out.println(isPalindrome(104));
    }
}
