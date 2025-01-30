package U5T7_StaticMethodsAndVariables;

public class WordClass {

    private static String maxWord = "";

    private String word;
    
    public WordClass (String s) {
        word = s;
        if (word.length() > maxWord.length()) {
            maxWord = word;
        }
    }

    public static String getMaxWord() {
        return maxWord;
    }
    
    public String getWord() {
        return word;
    }
}
