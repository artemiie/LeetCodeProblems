package leetcode.problems.palindrome_number;

public class Solution2 {
  public static boolean isPalindrome(int x) {
    String number = String.valueOf(x);

    for (int i = 0, j = number.length() - 1; i < number.length() / 2; i++, j--) {
      if (number.charAt(i) != number.charAt(j)) {
        return false;
      }
    }

    return true;
  }
}
