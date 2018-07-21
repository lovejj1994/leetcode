/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num = nums1.length + nums2.length;
        if (num % 2 == 1) {
            return handel(num / 2, nums1, nums2, true);
        } else {
            return handel(num / 2 - 1, nums1, nums2, false);
        }
    }


    public double handel(double value, int[] nums1, int[] nums2, boolean isOdd) {
        int nums1Index = 0, nums2Index = 0, currentIndex = 0;

        while (currentIndex < value) {
            Integer value1 = null, value2 = null;
            if (nums1.length > nums1Index) {
                value1 = nums1[nums1Index];
            }
            if (nums2.length > nums2Index) {
                value2 = nums1[nums2Index];
            }

            if (null == value1) {
                nums2Index++;
            } else if (null == value2) {
                nums1Index++;
            }



            currentIndex++;
        }
    }

}
