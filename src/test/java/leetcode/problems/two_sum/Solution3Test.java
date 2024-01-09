package leetcode.problems.two_sum;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Solution3Test {

  @Test
  public void test() {
    Assertions.assertAll(
        () -> Assertions.assertArrayEquals(new int[] {0, 1}, Solution3.twoSum(new int[] {2, 7, 11, 15}, 9)),
        () -> Assertions.assertArrayEquals(new int[] {1,2}, Solution3.twoSum(new int[] {3, 2, 4}, 6)),
        () -> Assertions.assertArrayEquals(new int[] {0, 1}, Solution3.twoSum(new int[] {3, 3}, 6)),
        () -> Assertions.assertArrayEquals(new int[] {1,3}, Solution3.twoSum(new int[] {3, 5, 6, 2}, 7)),
        () -> Assertions.assertArrayEquals(new int[] {3, 4}, Solution3.twoSum(new int[] {0, -1, 2, -3, 1}, -2)));
  }
}
