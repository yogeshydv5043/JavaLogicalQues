package String_types;

public class Rev_String {

    public static void main(String[] args) {
        String name = "My Name Is Aman";

        String[] str = name.split(" ");

        // Loop from last index to 0
        for (int i = 0; i <= str.length - 1; i++) {
//       System.out.println(str[i]);
            StringBuffer strr = new StringBuffer(str[i]);
            System.out.print(strr.reverse() + " ");
        }

    }
}
