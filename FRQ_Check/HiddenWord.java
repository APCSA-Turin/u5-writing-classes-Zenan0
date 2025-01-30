package FRQ_Check;

// type up the complete HiddenWord class here
public class HiddenWord {
    private String hiddenWord;
  
    public HiddenWord(String hidden) {
      hiddenWord = hidden;
    }
  
    public String getHint(String guess) {
      int i = 0;
      String hint = "";
      while (i < guess.length()) {
        if (guess.substring(i, i + 1).equals(hiddenWord.substring(i, i + 1))) {
          hint += guess.substring(i, i + 1);
        } else if (hiddenWord.indexOf(guess.substring(i, i + 1)) != -1) {
          hint += "+";
        } else {
          hint += "*";
        }
        i++;
      }
      return hint;
    }
  }
  