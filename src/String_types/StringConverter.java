package String_types;


public class StringConverter {

    public static String wordSeq(String str) {
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch<= '9') ||
                    (ch == ' ')) {
                name.append(ch);
            }
        }

        return name.toString();
    }

    public static void main(String[] args) {
        String word = "@H&#$A*^#*p!@%#p*&$y";
        String str = wordSeq(word);
        System.out.println("Original : "+word);
        System.out.println("Converted : "+str);
    }
}
