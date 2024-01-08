package leetcode.problems.roman_to_integer;

public class Solution1 {
    private static final char I = 'I';
    private static final char V = 'V';
    private static final char X = 'X';
    private static final char L = 'L';
    private static final char C = 'C';
    private static final char D = 'D';
    private static final char M = 'M';

    public static int romanToInt(String romanNumber) {
        int decimalNumber = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            boolean isLastLetter = (romanNumber.length() - 1) == i;
            char letter = romanNumber.charAt(i);

            if (letter == V) {
                decimalNumber += 5;
            } else if (letter == L) {
                decimalNumber += 50;
            } else if (letter == D) {
                decimalNumber += 500;
            } else if (letter == M) {
                decimalNumber += 1000;
            } else if (letter == I) {
                if (isLastLetter) {
                    decimalNumber += 1;
                } else if (romanNumber.charAt(i + 1) == V) {
                    decimalNumber += 4;
                    i++;
                } else if (romanNumber.charAt(i + 1) == X) {
                    decimalNumber += 9;
                    i++;
                } else {
                    decimalNumber += 1;
                }
            } else if (letter == X) {
                if (isLastLetter) {
                    decimalNumber += 10;
                } else if (romanNumber.charAt(i + 1) == L) {
                    decimalNumber += 40;
                    i++;
                } else if (romanNumber.charAt(i + 1) == C) {
                    decimalNumber += 90;
                    i++;
                } else {
                    decimalNumber += 10;
                }
            } else if (letter == C) {
                if (isLastLetter) {
                    decimalNumber += 100;
                } else if (romanNumber.charAt(i + 1) == D) {
                    decimalNumber += 400;
                    i++;
                } else if (romanNumber.charAt(i + 1) == M) {
                    decimalNumber += 900;
                    i++;
                } else {
                    decimalNumber += 100;
                }
            }
        }

        return decimalNumber;
    }
}