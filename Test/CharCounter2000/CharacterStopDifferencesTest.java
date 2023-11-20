package CharCounter2000;

import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterStopDifferencesTest {

    @Test
    public void testProcessInput() {
        CharacterCounter characterCounter = new CharacterCounter();

        // Test when 'stop' is found with different spellings
        assertTrue(characterCounter.processInput("This is a test stop")); //15
        assertTrue(characterCounter.processInput("Another line with STOP")); //18
        assertTrue(characterCounter.processInput("Yet another line .StOp"));  //18

        // Check the total characters and rows after 'stop' is found
        assertEquals(51, characterCounter.getTotalCharactersBeforeStop()); // Adjust this value based on your actual data
    }
}
