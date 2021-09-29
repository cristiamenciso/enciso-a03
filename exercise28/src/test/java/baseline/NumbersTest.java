package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {


    @Test
    void getNum_Test() {
        Numbers num = new Numbers(27);
        int actual = num.getNum();
        int expected = 27;
        assertEquals(expected, actual);
        }


    @Test
    void Numbers_Test() {
        Numbers num = new Numbers(55);
        int actual = num.getNum();
        int expected = 55;
        assertEquals(expected, actual);

    }
}