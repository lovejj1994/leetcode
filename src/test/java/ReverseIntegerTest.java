import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {
    @Test
    @DisplayName("V1.0")
    void test() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int num_1 = 123;
        assertEquals(321, reverseInteger.reverse(num_1));
        int num_2 = 120;
        assertEquals(21, reverseInteger.reverse(num_2));
        int num_3 = -123;
        assertEquals(-321, reverseInteger.reverse(num_3));
    }

}
