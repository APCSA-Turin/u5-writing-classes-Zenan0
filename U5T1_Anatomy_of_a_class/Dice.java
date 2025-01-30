public class Dice {
    private int sides;
    private int recentRoll;
    private int rolls;

    public Dice(int numOfSides) {
        sides = numOfSides;
    }

    public int rollDice() {
        rolls++;
        recentRoll = (int) (Math.random() * sides) + 1;
        return recentRoll;
    }

    public int getSides() {
        return sides;
    }

    public int getRecentRoll() {
        return recentRoll;
    }

    public int getRolls () {
        return rolls;
    }

    public void setSides(int newSides) {
        sides = newSides;
    }
}
