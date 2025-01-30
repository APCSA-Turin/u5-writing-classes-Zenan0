package U5T7_StaticVariables;

public class Game {
    private int rollAmount;
    private int numRolls;
    private int thresholdNumber;
    private int sides;
    private int gamesPlayed;
    private int gamesWon;
    private static int totalGamesPlayed = 0;
    private static int totalGamesWon = 0;

    public Game(int rolls, int win, int sides) {
        numRolls = rolls;
        thresholdNumber = win;
        this.sides = sides;
        gamesPlayed = 0;
        gamesWon = 0;
    }

    public Boolean playGame() {
        rollAmount = 0;
        for (int i = 0; i < numRolls; i++) {
            rollAmount += (int) (Math.random() * sides) + 1;
        }
        gamesPlayed++;
        totalGamesPlayed++;
        if (rollAmount >= thresholdNumber) {
            gamesWon++;
            totalGamesWon++;
            return true;
        } else {
            return false;
        }
    }

    public String gameInfo() {
        String str = "Current game settings:\n";
        str += "Number of rolls: " + numRolls + "\n";
        str += "Threshold to win: " + thresholdNumber + "\n";
        str += "Dice sides: " + sides + "\n";
        str += "-------------------\n";
        str += "Current game stats:\n";
        str += "Games played: " + gamesPlayed + "\n";
        str += "Games won: " + gamesWon + "\n";
        str += "-------------------\n";
        str += "Overall game stats:\n";
        str += "Total games played: " + getTotalGamesPlayed() + "\n";
        str += "Total games won: " + getTotalGamesWon() + "\n";
        return str;
    }

    public static int getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public static int getTotalGamesWon() {
        return totalGamesWon;
    }

    public int getRollAmount() {
        return rollAmount;
    }
}
