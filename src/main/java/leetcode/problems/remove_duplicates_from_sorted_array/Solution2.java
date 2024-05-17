package leetcode.problems.remove_duplicates_from_sorted_array;

public class Solution2 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int k = 1;
        int size = nums.length;
        int i = 1, j = 2;

        for (; i < size; i++) {

            if (nums[i] == nums[i - 1] || nums[i] < nums[i - 1]) {

                for (; j < size; j++) {
                    if (nums[j] > nums[i - 1]) {
                        nums[i] = nums[j];
                        k++;
                        j++;
                        break;
                    }
                }

            } else if (nums[i] > nums[i - 1]) {
                k++;
            }

            if (j >= size) return k;
        }

        return k;
    }
}
