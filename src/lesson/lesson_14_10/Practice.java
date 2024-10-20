package lesson.lesson_14_10;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
//        System.out.println(getFactorial(num));

//        getFibonacci(num);
//        printForm(3, 4);
//        printConturForm(3, 4);
//        printTriangle(5);

        printTriangle2(4);
        printContourTriangle(5);
    }

    private static int getFactorial(int num) {
        int count = 1;

        for (int i = 1; i <= num; i++) {
            count *= i;
        }
        return count;
    }

//    private static void fibonachi(int num) {
//        int sum = 0;
//        int i = 1;
////        for (int i = 0; i < num; i++) {
////            sum += i;
////            System.out.println(sum);
////        }

//    }

    public static void getFibonacci(int num) {
        int num0 = 1;
        int num1 = 1;
        int num2;
        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i <= num; i++) {
            num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
        System.out.println();
    }

//    Показать на экране прямоугольник размером MxN, состоящий из звёздочек.

    private static void printForm(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void printConturForm(int m, int n) {
        for (int y = 0; y <= m; y++) {
            for (int x = 0; x <= n; x++) {
                if (x == 0 && y <= m || y == 0 && x <= n || y <= m && x == n || y == m && x <= n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printTriangle(int high) {
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 0; i < high; i++) {
            for (int j = high; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void printTriangle2(int height) {
        int a = 0;
        int b = height - 1;
        int c = height + 1;

        for (int y = 0; y <= height; y++) {
            for (int x = 0; x <= height * 2; x++) {
                if (y == a && x > b && x < c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.println();
        }
    }

    private static void printContourTriangle(int height){
        int a = 0;
        int b = height;
        int c = height;
        for (byte y = 0; y <= height; y++) {
            for (byte x = 0; x <= height * 2; x++) {
                if (y == a && x == b || y == a && x == c || y == height
                        && x <= height * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.print("\n");
        }
    }
}


