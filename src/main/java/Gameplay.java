import java.util.Scanner;

public class Gameplay {

    Scanner scanner = new Scanner(System.in);

    public int startGame() {
        System.out.println("Welcome to Rock Paper Scissors!\n[0]Rock\n[1]Paper\n[2]Scissors");
        int userInput = scanner.nextInt();
        return userInput;
    }


}
