package leetcode.problems.remove_duplicates_from_sorted_array;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
  public static int removeDuplicates(int[] nums) {
    int k = 0;
    int size = nums.length;
    Set<Integer> integers = new HashSet();

    for (int i = 0; i < size; i++) {
      if (!integers.contains(nums[i])) {
        integers.add(nums[i]);
        nums[k] = nums[i];
        k++;
      }
    }

    return k;
  }
}
