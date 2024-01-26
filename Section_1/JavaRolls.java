import java.util.Scanner;

public class JavaRolls {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Let's play Rolling Java. Type anything to start.");

    String startText = scanner.nextLine();

    System.out.println("Great, here are the rules:\\n");
    System.out.println("If you roll a 6, the game stops.");
    System.out.println("If you roll a 4, nothing happens.");
    System.out.println("Otherwise, you get 1 point.\\n");
    System.out.print("You must collect at least 3 points to win. ");
    System.out.print("Enter anything to roll:");

    String rollText = scanner.nextLine();
    
    int diceroll = -1;
    int scores = 0;

    while(true) {
      diceroll = rollDice();
      if(diceroll == 6){
        System.out.println("End of game. You rolled a " + diceroll);
        break;
      }else if(diceroll == 4){
        scores = 0;
        System.out.println("You rolled a " + diceroll + " Zero points. Keep rolling.");
        continue;

      }else {
        scores += 1;
        System.out.println("One point. Keep rolling");
      }
      System.out.println("You rolled a " + diceroll);
    }

    if(scores >= 3){
      System.out.println("Wow, that's lucky. You win!");

    }else {
      System.out.println("Tough luck, you lose :(");
    }


  }


  public static int rollDice() {

    double randomNum = Math.random() * 6;
    randomNum += 1;
    return (int)randomNum;

  }
}
