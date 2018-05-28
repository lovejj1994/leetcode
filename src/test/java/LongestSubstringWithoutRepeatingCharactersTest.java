import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    @DisplayName("V1.0")
    void test() {
        LongestSubstringWithoutRepeatingCharacters characters = new LongestSubstringWithoutRepeatingCharacters();

        int num_1 = characters.lengthOfLongestSubstring("abcabcbb");
        assertEquals(num_1, 3);
        int num_2 = characters.lengthOfLongestSubstring("bbbbb");
        assertEquals(num_2, 1);
        int num_3 = characters.lengthOfLongestSubstring("pwwkew");
        assertEquals(num_3, 3);
    }


}
