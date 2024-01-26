import java.util.Scanner;

public class rockPaperScissors {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

      startGame();

      String user_choice = scanner.nextLine();

      if(user_choice.equals("rock")) {
        System.out.println("Player Chose rock");
      } else if(user_choice.equals("paper")) {
        System.out.println("Player chose paper");
      } else if(user_choice.equals("scissors")){
        System.out.println("Player chose scissors");
      }

      if(getComputerChoice() == 0) {
        System.out.println("computer Chose rock");
      } else if(getComputerChoice() == 1) {
        System.out.println("Computer chose paper");
      } else {
        System.out.println("Computer chose scissors");
      }

      if(user_choice.equals("rock")) {
        if(getComputerChoice() == 0) {
          System.out.println("It's a tie! The computer and player both chose rock");
        } else if(getComputerChoice() == 1) {
          System.out.println("The computer wins");
        } else if(getComputerChoice() == 2) {
          System.out.println("The player wins");
        }

      } else if(user_choice.equals("paper")){
        if(getComputerChoice() == 1) {
          System.out.println("It's a tie! The computer and player both chose paper");
        } else if(getComputerChoice() == 0) {
          System.out.println("The player wins");
        } else if(getComputerChoice() == 2) {
          System.out.println("The computer wins");
        }
      }  else if(user_choice.equals("scissors")){
        if(getComputerChoice() == 2) {
          System.out.println("It's a tie! The computer and player both chose scissors");
        } else if(getComputerChoice() == 0) {
          System.out.println("The computer wins");
        } else if(getComputerChoice() == 1) {
          System.out.println("The player wins");
        }
      }

  }

  public static int getComputerChoice() {
    double randomChoice = Math.random() * 2;
    randomChoice += 1;
    return (int)randomChoice;
  }

  public static String startGame() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Let's play Rock Paper Scissors.");
    System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");

    System.out.println("Are you ready? Write 'yes' if you are");

    String ansYes = scanner.nextLine();

    if((ansYes.equals("yes")) || (ansYes.equals("y")) || (ansYes.equals("Yes")) || (ansYes.equals("Y"))) {

      System.out.println("Great!");
      System.out.println("rock - paper - scissors, shoot!");

    } else {
      System.out.println("Darn, some other time...");
    }

    return ansYes;

  }





}
