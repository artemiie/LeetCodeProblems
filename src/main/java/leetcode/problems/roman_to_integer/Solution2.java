package leetcode.problems.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public static int romanToInt(String romanNumber) {

        int decimalNumber = 0;

        Map<Character, Integer> romanToInteger =
            new HashMap<>() {
                {
                    put('I', 1);
                    put('V', 5);
                    put('X', 10);
                    put('L', 50);
                    put('C', 100);
                    put('D', 500);
                    put('M', 1000);
                }
            };

        for (int i = 0; i < romanNumber.length(); i++) {
            Character letter = romanNumber.charAt(i);

            if (i != (romanNumber.length() - 1)
                && romanToInteger.get(letter) < romanToInteger.get(romanNumber.charAt(i + 1))) {
                decimalNumber += romanToInteger.get(romanNumber.charAt(i + 1)) - romanToInteger.get(letter);
                i++;
            } else {
                decimalNumber += romanToInteger.get(letter);
            }
        }

        return decimalNumber;
    }
}
