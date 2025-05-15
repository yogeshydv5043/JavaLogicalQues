package String_types;

public class ReverseStringWithSpecialChars {
    public static void main(String[] args) {
        String str = "Yo@gesh";
        String reversed = reverseString(str);
        System.out.println(reversed);  // Output: ti#h@o*R
    }

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();  // String ko character array me convert kiya
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {  // Agar left special character hai toh aage badho
                left++;
            }
            else if (!Character.isLetter(arr[right])) { // Agar right special character hai toh peeche jao
                right--;
            }
            else {  // Agar dono alphabets hain toh swap karo
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);  // Array ko wapas string me convert karke return kiya
    }
}
