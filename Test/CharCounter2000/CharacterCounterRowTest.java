package CharCounter2000;

import static org.junit.Assert.*;
import org.junit.Test;

public class CharacterCounterRowTest {

    @Test
    public void testRowCount() {
        CharacterCounter characterCounter = new CharacterCounter();

        // Test when 'stop' is not found
        assertFalse(characterCounter.processInput("This is a test"));
        assertFalse(characterCounter.processInput("Another line without stop"));

        // Check the row count after 'stop' is not found
        assertEquals(2, characterCounter.getRowCount());

    }
}

