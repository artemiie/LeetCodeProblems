package leetcode.problems.longest_common_prefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution1Test {

    @Test
    public void test() {
        Assertions.assertAll(
            () -> Assertions.assertEquals("fl", Solution1.longestCommonPrefix(new String[]{"flower", "flow", "flight"})),
            () -> Assertions.assertEquals("a", Solution1.longestCommonPrefix(new String[]{"ab", "a"})),
            () -> Assertions.assertEquals("ap", Solution1.longestCommonPrefix(new String[]{"apple", "ape", "april"})),
            () -> Assertions.assertEquals("abc", Solution1.longestCommonPrefix(new String[]{"abcdefgh", "abcefgh"})),
            () -> Assertions.assertEquals("min", Solution1.longestCommonPrefix(new String[]{"mint", "mini", "mineral"})),
            () -> Assertions.assertEquals("", Solution1.longestCommonPrefix(new String[]{"dog", "racecar", "car"})));
    }
}
