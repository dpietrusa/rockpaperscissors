public class Rules {

    public int compareThrows(String playerThrow, String computerThrow){
        int throwOutcome = 0;

        if (playerThrow.equals("Rock") && computerThrow.equals("Paper")) {
            throwOutcome = 2;
        }

        else if (playerThrow.equals("Rock") && computerThrow.equals("Scissors")) {
            throwOutcome = 1;
        }

        else if (playerThrow.equals("Rock") && computerThrow.equals("Rock")) {
            throwOutcome = 3;
        }

        else if (playerThrow.equals("Paper") && computerThrow.equals("Paper")) {
            throwOutcome = 3;
        }

        else if (playerThrow.equals("Paper") && computerThrow.equals("Scissors")) {
            throwOutcome = 2;
        }

        else if (playerThrow.equals("Paper") && computerThrow.equals("Rock")) {
            throwOutcome = 1;
        }

        else if (playerThrow.equals("Scissors") && computerThrow.equals("Paper")) {
            throwOutcome = 1;
        }

        else if (playerThrow.equals("Scissors") && computerThrow.equals("Scissors")) {
            throwOutcome = 3;
        }

        else if (playerThrow.equals("Scissors") && computerThrow.equals("Rock")) {
            throwOutcome = 2;
        }


        return throwOutcome;
    }
}
