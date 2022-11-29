import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    void countLetters() {
        CountLetters testHash = new CountLetters();
        testHash.countLetters("honolulu");
        assertTrue(testHash.countLetters("honolulu")!=null);

    }
}