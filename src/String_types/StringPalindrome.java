package String_types;

public class StringPalindrome {
    public static boolean check(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "pop sop";
        System.out.println(check(str));
    }

}
