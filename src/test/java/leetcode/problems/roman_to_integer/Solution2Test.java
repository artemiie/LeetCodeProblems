package leetcode.problems.roman_to_integer;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Solution2Test {

  @Test
  public void test() {
    Assertions.assertAll(
        () -> Assertions.assertEquals(3, Solution2.romanToInt("III")),
        () -> Assertions.assertEquals(58, Solution2.romanToInt("LVIII")),
        () -> Assertions.assertEquals(1904, Solution2.romanToInt("MCMIV")),
        () -> Assertions.assertEquals(1915, Solution2.romanToInt("MCMXV")),
        () -> Assertions.assertEquals(999, Solution2.romanToInt("CMXCIX")),
        () -> Assertions.assertEquals(1023, Solution2.romanToInt("MXXIII")),
        () -> Assertions.assertEquals(1994, Solution2.romanToInt("MCMXCIV")),
        () -> Assertions.assertEquals(1776, Solution2.romanToInt("MDCCLXXVI")),
        () -> Assertions.assertEquals(4748, Solution2.romanToInt("MMMMDCCXLVIII")));
  }
}
