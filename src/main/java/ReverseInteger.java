/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * <p>
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {
    public int reverse(int x) {
        StringBuffer sb = new StringBuffer();
        if (x < 0) {
            sb.append("-");
        }
        int left = x;
        while (Math.abs(left) > 0) {
            int num = Math.abs(left) % 10;
            left = Math.abs(left) / 10;
            sb.append(num);
        }
        try {
            return new Integer(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
