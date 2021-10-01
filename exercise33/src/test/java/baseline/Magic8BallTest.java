package baseline;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void initializeArray() throws NoSuchAlgorithmException {
        String[] array = new String[4];
        String[] actual = new String[4];
        Magic8Ball ball = new Magic8Ball();
        actual = ball.initializeArray(array);
        String[] expected = new String[] {"Yes,", "No,", "Maybe", "Ask again later."};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void shakeMagic8Ballfor0() throws NoSuchAlgorithmException {
        String[] tempArray = new String[] {"Yes,", "No,", "Maybe", "Ask again later."};
        Magic8Ball ball = new Magic8Ball();
        String actual = ball.shakeMagic8Ball(tempArray, 0);
        String expected = "Yes,";
        assertEquals(expected,actual);

    }
    @Test
    void shakeMagic8Ballfor1() throws NoSuchAlgorithmException {
        String[] tempArray = new String[]{"Yes,", "No,", "Maybe", "Ask again later."};
        Magic8Ball ball = new Magic8Ball();
        String actual = ball.shakeMagic8Ball(tempArray, 1);
        String expected = "No,";
        assertEquals(expected, actual);
    }

    @Test
    void shakeMagic8Ballfor2() throws NoSuchAlgorithmException {
        String[] tempArray = new String[]{"Yes,", "No,", "Maybe", "Ask again later."};
        Magic8Ball ball = new Magic8Ball();
        String actual = ball.shakeMagic8Ball(tempArray, 2);
        String expected = "Maybe";
        assertEquals(expected, actual);
    }

    @Test
    void shakeMagic8Ballfor3() throws NoSuchAlgorithmException {
        String[] tempArray = new String[]{"Yes,", "No,", "Maybe", "Ask again later."};
        Magic8Ball ball = new Magic8Ball();
        String actual = ball.shakeMagic8Ball(tempArray, 3);
        String expected = "Ask again later.";
        assertEquals(expected, actual);
    }

    @Test
    void makeRandomNumber() throws NoSuchAlgorithmException {
        Magic8Ball ball = new Magic8Ball();
        int actual = ball.makeRandomNumber(3);
        if(actual > 3 || actual < 1) {
            assertFalse(false);
        }
        else {
            assertTrue(true);
        }


    }
}