package leetcode.problems.two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution2Test {

    @Test
    public void test() {
        Assertions.assertAll(
            () -> Assertions.assertArrayEquals(new int[]{0, 1}, Solution1.twoSum(new int[]{2, 7, 11, 15}, 9)),
            () -> Assertions.assertArrayEquals(new int[]{1, 2}, Solution1.twoSum(new int[]{3, 2, 4}, 6)),
            () -> Assertions.assertArrayEquals(new int[]{0, 1}, Solution1.twoSum(new int[]{3, 3}, 6)),
            () -> Assertions.assertArrayEquals(new int[]{1, 3}, Solution1.twoSum(new int[]{3, 5, 6, 2}, 7)),
            () -> Assertions.assertArrayEquals(new int[]{3, 4}, Solution1.twoSum(new int[]{0, -1, 2, -3, 1}, -2)));
    }
}
