package leetcode.problems.palindrome_number;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution3Test {

    @Test
    public void test() {
        Assertions.assertAll(
            () -> Assertions.assertTrue(Solution3.isPalindrome(121)),
            () -> Assertions.assertFalse(Solution3.isPalindrome(-121)),
            () -> Assertions.assertFalse(Solution3.isPalindrome(10)),
            () -> Assertions.assertTrue(Solution3.isPalindrome(12321)),
            () -> Assertions.assertFalse(Solution3.isPalindrome(8999)));
    }
}
