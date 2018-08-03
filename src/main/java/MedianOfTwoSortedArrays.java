import java.util.ArrayList;
import java.util.List;

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

        if (num == 0) {
            return 0;
        }

        List<Integer> sort = sort(num / 2, nums1, nums2);

        int size = sort.size();
        if (num % 2 == 0) {
            return (sort.get(size - 1) + sort.get(size - 2)) / 2.0;
        } else {
            return sort.get(size - 1);
        }
    }


    public List<Integer> sort(int length, int[] nums1, int[] nums2) {
        ArrayList<Integer> resorts = new ArrayList<>();
        int nums1Index = 0, nums2Index = 0, index = 0;
        while (length >= index) {
            Integer value1, value2;
            if (nums1Index < nums1.length) {
                value1 = nums1[nums1Index];
            } else {
                resorts.add(nums2[nums2Index]);
                nums2Index++;
                index++;
                continue;
            }

            if (nums2Index < nums2.length) {
                value2 = nums2[nums2Index];
            } else {
                resorts.add(nums1[nums1Index]);
                nums1Index++;
                index++;
                continue;
            }

            if (value1 > value2) {
                resorts.add(nums2[nums2Index]);
                nums2Index++;
            } else {
                resorts.add(nums1[nums1Index]);
                nums1Index++;
            }

            index++;
        }

        return resorts;
    }

}
