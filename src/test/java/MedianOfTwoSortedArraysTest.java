import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {
    @Test
    @DisplayName("V1.0")
    public void test() {
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        int[] nums = {1, 3};
        int[] nums_1 = {2};
        assertEquals(2.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums, nums_1));
        int[] nums_2 = {1, 2};
        int[] nums_3 = {3, 4};
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(nums_2, nums_3));
    }
}
