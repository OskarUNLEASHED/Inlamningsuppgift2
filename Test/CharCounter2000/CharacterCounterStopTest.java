package CharCounter2000;

import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterCounterStopTest {

    @Test
    public void testProcessInput() {
        CharacterCounter characterCounter = new CharacterCounter();

        // Test when 'stop' is found
        assertTrue(characterCounter.processInput("This is a test stop"));

        // Check the total characters and rows after 'stop' is found
        assertEquals(15, characterCounter.getTotalCharactersBeforeStop());
        assertEquals(1, characterCounter.getRowCount());}
}




