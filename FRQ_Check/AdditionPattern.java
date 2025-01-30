package FRQ_Check;

public class AdditionPattern {
    private int currentNumber;
    private int startingNumber;
    private int addAmount;
  
    public AdditionPattern(int start, int add) {
      startingNumber = start;
      addAmount = add;
      currentNumber = start;
    }
  
    public int currentNumber() {
      return currentNumber;
    }
  
    public void next() {
      currentNumber += addAmount;
    }
  
    public void prev() {
      if (currentNumber <= startingNumber) {
        currentNumber += 0;
      } else {
        currentNumber -= addAmount;
      }
    }
  }
  