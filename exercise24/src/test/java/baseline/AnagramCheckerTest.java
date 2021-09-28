package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {
    @Test
    void isAnagram_returns_true_for_anagrams () {

        AnagramChecker checker = new AnagramChecker();

        boolean actual = checker.isAnagram("difo", "fido");

        assertTrue(actual);


    }
    @Test
    void isAnagram_returns_true_for_other_anagrams () {

        AnagramChecker checker = new AnagramChecker();

        boolean actual = checker.isAnagram("note", "tone");

        assertTrue(actual);


    }

    @Test
    void isAnagram_returns_false_for_anagrams(){

        AnagramChecker checker = new AnagramChecker();

        boolean actual = checker.isAnagram("difo", "god");

        assertFalse(actual);

    }


    @Test
    void isAnagram_returns_false_for_other_anagrams(){

        AnagramChecker checker = new AnagramChecker();

        boolean actual = checker.isAnagram("difo", "god");

        assertFalse(actual);

    }


}


