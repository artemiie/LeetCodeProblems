package leetcode.problems.remove_duplicates_from_sorted_array;


import org.junit.jupiter.api.Test;

public class Solution2Test {

    @Test
    public void test1() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = new int[]{0, 1, 2, 3, 4};

        int k = Solution2.removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void test2() {
        int[] nums = new int[]{1, 1, 2};
        int[] expectedNums = new int[]{1, 2};

        int k = Solution2.removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void test3() {
        int[] nums = new int[]{2, 2, 2, 2, 2};
        int[] expectedNums = new int[]{2};

        int k = Solution2.removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void test4() {
        int[] nums = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5};
        int[] expectedNums = new int[]{1, 2, 3, 4, 5};

        int k = Solution2.removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void test5() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = new int[]{0, 1, 2, 3, 4};

        int k = Solution2.removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
