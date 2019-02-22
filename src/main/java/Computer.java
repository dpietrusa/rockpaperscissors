import java.util.Random;

public class Computer extends Player {

    Random newRandom = new Random();

    public String determinComputerThrow(){
        String computerThrowChoice = throwChoices.get(newRandom.nextInt(throwChoices.size()));
        return computerThrowChoice;
    }

}
