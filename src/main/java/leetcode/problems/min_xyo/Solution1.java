package leetcode.problems.min_xyo;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(getLength("YY"));
        System.out.println(getLength("XX"));
        System.out.println(getLength("XY"));
        System.out.println(getLength("YOX"));
        System.out.println(getLength("OOOXOOYOXO"));
        System.out.println(getLength("OOOXXOY"));
        System.out.println(getLength("OYXOYYOX"));
    }

    public static int getLength(String text) {
        int length = text.length();
        int indexX = -1;
        int indexY = -1;
        int minDistance = length;

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == 'X') {
                indexX = i;
                if (indexY >= 0) {
                    int distance = Math.abs(indexX - indexY);
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
            } else if (text.charAt(i) == 'Y') {
                indexY = i;
                if (indexX >= 0) {
                    int distance = Math.abs(indexX - indexY);
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
            }
        }

        if (indexY < 0 || indexX < 0) {
            return 0;
        }

        return minDistance;
    }
}
