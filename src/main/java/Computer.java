import java.util.Random;

public class Computer extends Player {

    Random newRandom = new Random();

    public String computerThrow(){
        String computerThrowChoice = throwChoices.get(newRandom.nextInt(throwChoices.size()));
        return computerThrowChoice;
    }

}
