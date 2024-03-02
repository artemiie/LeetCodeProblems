package leetcode.problems.remove_emelent;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Solution1Test {
  @Test
  public void test1() {
    int[] nums = new int[] {3, 2, 2, 3};
    int val = 3;
    int[] expectedNums = new int[] {2, 2};

    int k = Solution1.removeElement(nums, val);

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }

  @Test
  public void test2() {
    int[] nums = new int[] {0,1,2,2,3,0,4,2};
    int val = 2;
    int[] expectedNums = new int[] {0,1,3,0,4};

    int k = Solution1.removeElement(nums, val);

    assert k == expectedNums.length;
    for (int i = 0; i < k; i++) {
      assert nums[i] == expectedNums[i];
    }
  }

  private static void sort(int[] nums, int k) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != k) {
      } else {
        for (int j = i + 1; j < nums.length; j++) {
          if (nums[j] != k) {
            nums[i] = nums[j];
            nums[j] = k;
            break;
          }
        }
      }
    }
  }
}
