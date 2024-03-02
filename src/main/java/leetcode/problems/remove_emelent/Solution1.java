package leetcode.problems.remove_emelent;

public class Solution1 {
  public static int removeElement(int[] nums, int val) {
    int k = 0;
    int size = nums.length;
    for (int i = 0; i < size; i++) {
      if (nums[i] != val) {
        k++;
      } else {
        for (int j = i + 1; j < size; j++) {
          if (nums[j] != val) {
            nums[i] = nums[j];
            nums[j] = val;
            k++;
            break;
          }
        }
      }
    }
    return k;
  }
}
