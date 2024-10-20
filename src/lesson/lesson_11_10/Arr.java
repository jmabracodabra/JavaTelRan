package lesson.lesson_11_10;

import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Integer[] test = {1, 2, 3, 4, 5};
        System.out.println("element = " + test[2]);
        Integer[] testTwo = new Integer[10];
        print(testTwo);
        setValue(testTwo);
        print(testTwo);

        int sum = 0;
        for (int i = 0; i < testTwo.length; i++) {
            Integer value = testTwo[i];
            if(value %2 ==0) {
                sum += testTwo[i];
            }
        }
        System.out.println("sum = " + sum);

    }

    private static void setValue(Integer[] testTwo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("а теперь введем значения:");
        for (int i = 0; i < testTwo.length; i++) {
            testTwo[i] = scanner.nextInt();
            System.out.println();
        }
    }

    private static void print(Integer[] testTwo) {
        for (int i = 0; i < testTwo.length; i++) {
            System.out.print(testTwo[i]+ " ");
        }
    }
}
