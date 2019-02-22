import java.util.Scanner;

public class Gameplay {

    Scanner scanner = new Scanner(System.in);

    public int startGame() {
        System.out.println("Welcome to Rock Paper Scissors!\n" +
                "Please select a number for your throw \n" +
                "[0]Rock\n" +
                "[1]Paper\n" +
                "[2]Scissors");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public boolean playRockPaperScissorsAgain(){
        boolean repeat = false;
        System.out.println("\n" +
                "Would you like to play again? \n" +
                "Please select a number: \n" +
                "[1] - Yes \n" +
                "[2] - No");
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
                repeat = true;
                break;
            case 2:
                System.out.println("Goodbye");
                repeat = false;
                break;
            case 3:
                System.out.println("Incorrect Input - Goodbye");
                repeat = false;
                break;
        }

        return repeat;
    }


}
