package U5T7_StaticMethods2;

public class StringUtility {
    private StringUtility() {  }

    public static Boolean isPalindrome(String str) {
        str = removeSpaces(str); //A
        String backwardsString = "";
        for (int i = str.length(); i > 0; i--) {
            backwardsString += str.substring(i - 1, i);
        }
        if (str.equals(backwardsString)) {
            return true;
        } else {
            return false;
        }
    }

    private static String removeSpaces(String str) {
        int spaceIndex = str.indexOf(" ");
        while (spaceIndex != -1) {
            str = str.substring(0, spaceIndex) + str.substring(spaceIndex + 1);
            spaceIndex = str.indexOf(" ");
        }
        return str;
    }

    public static int vowels(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            String currentLetter = str.substring(i, i + 1);
            if (currentLetter.equals("a") || currentLetter.equals("e") || currentLetter.equals("i") || currentLetter.equals("o") || currentLetter.equals("u")) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
