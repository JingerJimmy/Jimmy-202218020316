import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VernacularJazzTest {

    @Test
    void testAppleJack() {
        VernacularJazz jazz = new VernacularJazz();
        String[] result = jazz.appleJack();
        assertNotNull(result);
        assertEquals(64, result.length);
    }

    @Test
    void testCakeWalk() {
        VernacularJazz jazz = new VernacularJazz();
        int[] array = jazz.blackBottom();
        jazz.cakeWalk(array);
    }
}