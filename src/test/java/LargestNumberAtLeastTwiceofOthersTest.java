import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberAtLeastTwiceofOthersTest {
    @Test
    @DisplayName("V1.0")
    public void test() {
        LargestNumberAtLeastTwiceofOthers largestNumberAtLeastTwiceofOthers = new LargestNumberAtLeastTwiceofOthers();
        int[] nums = {1, 2, 3, 4};
        assertEquals(-1, largestNumberAtLeastTwiceofOthers.dominantIndex(nums));
        int[] nums_1 = {3, 6, 1, 0};
        assertEquals(1, largestNumberAtLeastTwiceofOthers.dominantIndex(nums_1));
    }
}
