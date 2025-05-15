package String_types;

public class Reverse_String2 {
    public static void main(String[] args) {
        // World Reverse in  dlroW
        String str = "World";

        System.out.println(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(" ");
        System.out.println(stringBuilder.reverse());
    }
}
