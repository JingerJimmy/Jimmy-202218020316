import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class guessNumTest {

    @BeforeEach
    void setUp() {
        System.out.println("Start Test");
    }

    /**
     * test the AppleJack method (I rename the method to createStr)
     */
    @Test
    void testAppleJack() {
        guessNum guess = new guessNum();

        String[] result = guessNum.createStr();
        Assertions.assertNotNull(result);

        /**
         * check does the result is equals to my expected result
         */
        Assertions.assertEquals(64, result.length);
    }

    /**
     * test the CakeWalk method (I rename the method to createInt)
     */
    @Test
    void testCakeWalk() {
        guessNum guess = new guessNum();

        int[] array = guessNum.createInt();
        guessNum.disruptInt(array);
    }

}