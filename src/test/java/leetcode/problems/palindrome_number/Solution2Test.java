package leetcode.problems.palindrome_number;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Solution2Test {

  @Test
  public void test() {
    Assertions.assertAll(
        () -> Assertions.assertTrue(Solution2.isPalindrome(121)),
        () -> Assertions.assertFalse(Solution2.isPalindrome(-121)),
        () -> Assertions.assertFalse(Solution2.isPalindrome(10)),
        () -> Assertions.assertTrue(Solution2.isPalindrome(12321)),
        () -> Assertions.assertFalse(Solution2.isPalindrome(8999)));
  }
}
