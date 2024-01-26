import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        int score = 0;

        /** */

        switch (role) {
            case 1: System.out.println("Yor are an admin");
            case 2: System.out.println("Yor are an editor");break;

            case 3: System.out.println("Yor are an user");break;
            default:
               System.out.println("Please contact HR");break;
        }


        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        if(temperature >=80 && humidity >=60) {
            System.out.println("its too hot an humid\n");

        }else if(temperature >=80) {
            System.out.println("its too hot an humid\n");
        } else if(temperature >=60 && humidity >= 60) {
            System.out.println("its cold and humid\n");

        }


        // Quiz

        // String question_1 = "c"
        // String question_2 = "a"
        // String question_3 = "d"
        // String question_4 = "b or a"


        System.out.println("\n Which country held the 2016 Summer Olympics? \na) China \nb) Ireland \nc) Brazil \nd) Italy");

        String ques1 = scanner.nextLine();


        switch (ques1) {
            case "a": System.out.println("Better Luck next time");
            case "b": System.out.println("Wrong answerr");break;

            case "c": System.out.println("You got it!!");
                score += 5;
                System.out.println("Your score is: " + score);
                break;
            case "d": System.out.println("So close");break;
            default:
               System.out.println("wrong selction");break;
        }



        System.out.println("\n Which planet is the hottest? \na) Venus \nb) Saturn \nc) Mercury \nd) Mars");

        String ques2 = scanner.nextLine();


        switch (ques2) {
            case "a": System.out.println("You got it!!");
                 score += 5;
                 System.out.println("Your score is: " + score);
                 break;
            case "b": System.out.println("Wrong answerr");
                 break;

            case "c": System.out.println("You got it!!");
                 break;
            case "d": System.out.println("So close");
                 break;
            default:
                 System.out.println("wrong selction");
                 break;
        }


        System.out.println("\n Which one of these characters is friends with Harry Potter?? \na) Ron Weasley \nb)Hermione Granger \nc) Draco Malfoy");

        String ques4 = scanner.nextLine();


        if(!(ques4.equals("b") || ques4.equals("a")) ) {
            System.out.println("Wrong answerr\n");

        }else if(ques4.equals("c")) {
            System.out.println("Better Luck Next time\n");
        } else {
            System.out.println("Excellent\n");
            score += 5;
            System.out.println("Your score is: " + score);

        }

        System.out.println("Your final score is: " + score + "/15");
        System.out.println("Wow, you know your stuff!");






    }
}
