package CharCounter2000;

import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterCounterSpecialCharactersTest {

    @Test
    public void testExpectFail() {
        CharacterCounter characterCounter = new CharacterCounter();


        assertFalse(characterCounter.processInput("!@#$%^&*()"));

        assertEquals(0, characterCounter.getTotalCharactersBeforeStop());
        assertEquals(0, characterCounter.getRowCount());
    }
}

