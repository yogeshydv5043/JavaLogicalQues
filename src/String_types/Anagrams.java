package String_types;

public class Anagrams {

    public static boolean isAnagram(String str1, String str2) {

        //Step 1 Check both String  Length are same
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] charCount = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        if (isAnagram(str1, str2)) {
            System.out.println(" String A : " + str1 + " and B: " + str2 + " is Anagrams ");
        } else {
            System.out.println(" String A : " + str1 + " and B: " + str2 + " is not Anagrams ");
        }
    }

}
