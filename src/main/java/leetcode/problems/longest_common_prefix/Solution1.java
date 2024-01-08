package leetcode.problems.longest_common_prefix;

import java.util.Arrays;

public class Solution1 {
  public static String longestCommonPrefix(String[] strs) {
    int arrLen = strs.length;
    Arrays.sort(strs);
    String commonPrefix = strs[0];
    String currentString;

    for (int i = 1; i < arrLen; i++) {
      currentString = strs[i];

      if (currentString.isEmpty()) {
        commonPrefix = "";
        break;
      }

      if (commonPrefix.equals(currentString)) {
        continue;
      }

      for (int j = 0; j < commonPrefix.length(); j++) {
        if (commonPrefix.charAt(j) != currentString.charAt(j)) {
          commonPrefix = commonPrefix.substring(0, j);
        }
      }
    }

    return commonPrefix;
  }
}
