import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    ArrayList<String> throwChoices = new ArrayList<>(Arrays.asList("Rock", "Paper", "Scissors"));


    public String playerThrow(int index) {
        String throwChoice = throwChoices.get(index);
        return throwChoice;
    }


}
