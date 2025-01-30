package U5T7_StaticVariables;

public class Main {
    public static void main(String[] args) {
      Game game1 = new Game(12, 81, 10);
      System.out.println(game1.gameInfo());
      if (game1.playGame()) {
        System.out.println("You rolled " + game1.getRollAmount() + " and won the game!");
      } else {
        System.out.println("You rolled " + game1.getRollAmount() + ", which isn't enough to win. Try again!");
      }
      System.out.println(game1.gameInfo());
      if (game1.playGame()) {
        System.out.println("You rolled " + game1.getRollAmount() + " and won the game!");
      } else {
        System.out.println("You rolled " + game1.getRollAmount() + ", which isn't enough to win. Try again!");
      }
      System.out.println(game1.gameInfo());

      
      Game game2 = new Game(2, 5, 3);
      System.out.println(game2.gameInfo());
      if (game2.playGame()) {
        System.out.println("You rolled " + game2.getRollAmount() + " and won the game!");
      } else {
        System.out.println("You rolled " + game2.getRollAmount() + ", which isn't enough to win. Try again!");
      }
      System.out.println(game2.gameInfo());
      if (game2.playGame()) {
        System.out.println("You rolled " + game2.getRollAmount() + " and won the game!");
      } else {
        System.out.println("You rolled " + game2.getRollAmount() + ", which isn't enough to win. Try again!");
      }
      System.out.println(game2.gameInfo());
    }
   }
   