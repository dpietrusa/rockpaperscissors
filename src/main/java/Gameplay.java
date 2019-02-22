import java.util.Scanner;

public class Gameplay {

    Scanner scanner = new Scanner(System.in);

    public int startGame() {
        System.out.println("Welcome to Rock Paper Scissors!\n[1]Rock\n[2]Paper\n[3]Scissors");
        int userInput = scanner.nextInt();
        return userInput;
    }


}
