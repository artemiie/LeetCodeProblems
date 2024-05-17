package leetcode.problems.palindrome_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution1Test {

    @Test
    public void test() {
        Assertions.assertAll(
            () -> Assertions.assertTrue(Solution1.isPalindrome(121)),
            () -> Assertions.assertFalse(Solution1.isPalindrome(-121)),
            () -> Assertions.assertFalse(Solution1.isPalindrome(10)),
            () -> Assertions.assertTrue(Solution1.isPalindrome(12321)),
            () -> Assertions.assertFalse(Solution1.isPalindrome(8999)));
    }
}
