import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void anagram() {
        String s1 = "dog";
        String s2 = "god";
        Anagram test = new Anagram();
//        assertTrue(test.anagram(s1,s2));
        assertEquals(true, test.anagram(s1, s2));
    }

    @Test
    void anagramFalse() {
        String s1 = "manga";
        String s2 = "mango";
        Anagram test = new Anagram();
        assertEquals(false, test.anagram(s1, s2));
    }
}