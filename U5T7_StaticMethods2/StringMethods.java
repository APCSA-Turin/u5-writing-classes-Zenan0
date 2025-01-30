package U5T7_StaticMethods2;

public class StringMethods {
    private String word;

    public StringMethods(String str) {
        word = str;
    }

    public String info() {
        String str = "The word " + word + " is "; //B
        if (StringUtility.isPalindrome(word)) { //B //E
            str += "a palindrome.\n";
        } else {
            str += "not a palindrome.\n";
        }
        str += "It has " + StringUtility.vowels(word) + " vowels in it.\n"; //B //E
        str += "All of the vowels in the word put together would make this word: " + vowelString() + "\n"; //C
        str += "Scrambling the word would turn out like this: " + scramble(word); //D
        return str;
    }

    private String vowelString() {
        String vString = "";
        for (int i = 0; i < word.length(); i++) { //B
            String currentLetter = word.substring(i, i + 1); //B
            if (currentLetter.equals("a") || currentLetter.equals("e") || currentLetter.equals("i") || currentLetter.equals("o") || currentLetter.equals("u")) {
                vString += currentLetter;
            }
        }
        return vString;
    }

    public String addSpaces(int numSpaces) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) { //B
            newWord += word.substring(i, i + 1); //B
            for (int j = 0; j < numSpaces; j++) {
                newWord += " ";
            }
        }
        return newWord;
    }

    public static String scramble(String str) {
        String scrambledStr = "";
        for (int i = 0; i < str.length(); i++) {
            int randomNum = (int) (Math.random() * str.length());
            scrambledStr += str.substring(randomNum, randomNum + 1);
        }
        return scrambledStr;
    }

    public static void run() {
        System.out.println("Word: hello");
        StringMethods test = new StringMethods("hello");
        System.out.println(test.info());
        System.out.println("Adding 3 spaces between each character would result in this: " + test.addSpaces(3));
        System.out.println();
        System.out.println("New word: kayak");
        StringMethods test2 = new StringMethods("kayak");
        System.out.println(test2.info());
        System.out.println("Adding 5 spaces between each character would result in this: " + test.addSpaces(5));
    }
}
