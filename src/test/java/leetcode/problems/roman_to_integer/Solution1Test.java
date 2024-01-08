package leetcode.problems.roman_to_integer;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Solution1Test {

  @Test
  public void test() {
    Assertions.assertAll(
        () -> Assertions.assertEquals(3, Solution1.romanToInt("III")),
        () -> Assertions.assertEquals(58, Solution1.romanToInt("LVIII")),
        () -> Assertions.assertEquals(1904, Solution1.romanToInt("MCMIV")),
        () -> Assertions.assertEquals(1915, Solution1.romanToInt("MCMXV")),
        () -> Assertions.assertEquals(999, Solution1.romanToInt("CMXCIX")),
        () -> Assertions.assertEquals(1023, Solution1.romanToInt("MXXIII")),
        () -> Assertions.assertEquals(1994, Solution1.romanToInt("MCMXCIV")),
        () -> Assertions.assertEquals(1776, Solution1.romanToInt("MDCCLXXVI")),
        () -> Assertions.assertEquals(4748, Solution1.romanToInt("MMMMDCCXLVIII")));
  }
}
