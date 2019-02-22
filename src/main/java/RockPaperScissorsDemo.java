import java.util.Scanner;

public class RockPaperScissorsDemo {
    public static void main(String[] args) {
        Gameplay gameplay = new Gameplay();
        Player player = new Player();
        Computer computer = new Computer();
        Rules rules = new Rules();
        boolean repeat;

        do{
            int throwChoice = gameplay.startGame();

            String playerThrow = player.determinPlayerThrow(throwChoice);

            System.out.println("Player throw: " + playerThrow);

            String computerThrow = computer.determinComputerThrow();

            System.out.println("Computer throw: " + computerThrow);

            int throwOutcome = rules.compareThrows(playerThrow, computerThrow);

            String winner = rules.winningOutcome(throwOutcome);

            System.out.println(winner);

            repeat = gameplay.playRockPaperScissorsAgain();

        }while(repeat);

    }
}
