package leetcode.problems.is_array_mountain;

import org.junit.jupiter.api.Assertions;

public class Solution1 {

    public static void main(String[] args) {
        Assertions.assertTrue(validMountainArray(new int[]{1, 2, 3, 4, 5, 4, 3, 1}));
        Assertions.assertFalse(validMountainArray(new int[]{2, 1}));
        Assertions.assertTrue(validMountainArray(new int[]{0, 3, 2, 1}));
        Assertions.assertFalse(validMountainArray(new int[]{3, 5, 5}));
        Assertions.assertFalse(validMountainArray(new int[]{2}));
        Assertions.assertTrue(validMountainArray(new int[]{1, 3, 2}));
        Assertions.assertFalse(validMountainArray(new int[]{1, 1, 1, 1, 1, 1, 1, 2, 1}));
        Assertions.assertFalse(validMountainArray(new int[]{3, 7, 6, 4, 3, 0, 1, 0}));
        Assertions.assertFalse(validMountainArray(new int[]{4, 4, 3, 2, 1}));
        Assertions.assertFalse(validMountainArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
        Assertions.assertFalse(validMountainArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        if (arr[0] > arr[1]) return false;
        if (arr[arr.length - 2] < arr[arr.length - 1]) return false;

        String flag = "increase";

        int i = 0;

        while (i < arr.length - 1) {
            switch (flag) {
                case "increase":
                    if (arr[i] < arr[i + 1]) {
                        i++;
                        continue;
                    } else if (arr[i] == arr[i + 1]) {
                        return false;
                    } else {
                        flag = "decrease";
                    }
                    i++;
                    break;
                case "decrease":
                    if (arr[i] <= arr[i + 1]) {
                        return false;
                    }
                    i++;
                    break;
            }
        }

        return true;
    }
}

