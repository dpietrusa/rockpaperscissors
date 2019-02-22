import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @Before
    public void create(){
        player = new Player();
    }


    @Test
    public void playerThrow() {
        //ACT
        String result1 = player.playerThrow(0);
        String result2 = player.playerThrow(1);
        String result3 = player.playerThrow(2);

        //ASSERT
        assertThat(result1, equalTo("Rock"));
        assertThat(result2, equalTo("Paper"));
        assertThat(result3, equalTo("Scissors"));

    }
}