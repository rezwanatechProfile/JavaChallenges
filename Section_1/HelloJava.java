import java.util.Scanner;

public class HelloJava {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("\nWhat is your name?");

    String name = scanner.nextLine();

    System.out.println("Hello " + name);
  }

}
