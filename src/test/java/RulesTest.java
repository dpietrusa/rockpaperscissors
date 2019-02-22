import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class RulesTest {

    private Rules newRules;

    @Before
    public void create() {
        newRules = new Rules();
    }

    @Test
    public void compareThrows() {
        int result = newRules.compareThrows("Rock", "Paper");
        int result2 = newRules.compareThrows("Rock", "Scissors");
        int result3 = newRules.compareThrows("Rock", "Rock");

        assertThat(result, equalTo(2));
        assertThat(result2, equalTo(1));
        assertThat(result3, equalTo(3));
    }
}