package leetcode.problems.palindrome_number;

public class Solution1 {
  public static boolean isPalindrome(int x) {
    String number = String.valueOf(x);
    int length = number.length();

    for (int i = 0; i < length / 2; i++) {
      if (number.charAt(i) != number.charAt(length - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
