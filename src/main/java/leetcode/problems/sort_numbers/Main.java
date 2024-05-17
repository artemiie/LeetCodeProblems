package leetcode.problems.sort_numbers;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
