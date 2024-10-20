package lesson.lesson_15_10;

import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        System.out.println(isPalindrom("123432155"));

        int n = 123464321;
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);

        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }


    //    Определить, является ли введённое число любой разрядности палиндромом (например, 1234321 – палиндром, 12345 – не палиндром).
    public static int reversNumber(int n) {
        int reversed_n = 0;
        while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }

    private static boolean isPalindrom(String num) {
        int length = num.length();

        for (int i = 0; i < length; i++) {
            if (num.charAt(i) != num.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }


    private static void printNumbersQuantity() {
        int countPositive = 0;
        int countNegative = 0;
        int countNull = 0;

        Random r = new Random();
        int num;

        for (int i = 0; i < 100; i++) {
            num = r.nextInt(-100, 101);
            if (num < 0) {
                countNegative++;
            } else if (num > 0) {
                countPositive++;
            } else {
                countNull++;
            }
        }

        System.out.println("positiv: " + countPositive);
        System.out.println("negative: " + countNegative);
        System.out.println("null: " + countNull);
    }
}
