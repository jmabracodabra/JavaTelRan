package lesson.lesson_1_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int num1 = getUserInput();
//        int num2 = getUserInput();
//        int res = add(num1, num2);
//
//        printSimple(res);
//        formatPrintResult(num1, num2, res);

        printSum(12,3);
        getSum(12,3);
    }

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        return sc.nextInt();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void printSimple(int res) {
        System.out.println(res);
    }

    public static void formatPrintResult(int num1, int num2, int result) {
        System.out.printf(num1 + " + " + num2 + " = " + result);
    }

    /*Создайте метод getSum(int a, int b), который ничего не возвращает,
    и печатает результат суммы двух полученных чисел в консоль.*/

    public static void getSum(int a, int b) {
        System.out.println(a + b);
    }

    /*Создайте метод getReturnSum(int a, int b),
    который возвращает результат - сумма двух чисел, а печать в консоль производит вызывающий метод */
    public static int getReturnSum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b) {
        System.out.println(getReturnSum(a, b));
    }

}
