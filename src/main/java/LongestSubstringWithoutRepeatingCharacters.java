import java.util.HashMap;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        int max = 0;

        for (int i = 0; i < chars.length; i++) {
            HashMap<Character, Object> objects = new HashMap<>();
            for (int j = i; j < chars.length; j++) {
                if (!objects.containsKey(chars[j])) {
                    objects.put(chars[j], null);
                } else {
                    break;
                }
            }
            if (max < objects.size()) {
                max = objects.size();
            }
        }

        return max;
    }
}
