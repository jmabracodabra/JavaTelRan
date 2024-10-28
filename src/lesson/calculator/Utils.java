package lesson.calculator;

import java.util.Scanner;

import static lesson.calculator.Const.*;


public class Utils {
    public static double getResult(char operation, double num1, double num2) {
        double result = 0;
        switch (operation) {
            case PLUS:
                result = add(num1, num2);
                break;
            case MINUS:
                result = substract(num1, num2);
                break;
            case MULTIPLY:
                result = multipli(num1, num2);
                break;
            case DIVIDE:
                result = divide(num1, num2);
                break;
            case REST:
                result = proc(num1, num2);
                break;
        }
        return result;
    }

    public static boolean isNotValidOperation(char operation) {
        return operation != PLUS && operation != MINUS && operation != MULTIPLY && operation != DIVIDE && operation != REST;
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите операцию +, -, *, /, %");
        char operation = scanner.next().charAt(0);
        while (isNotValidOperation(operation)) {
            System.out.println("Операция не поддерживается. Введите еще раз");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static boolean isDivisionByZero(char operation, double num) {
        return operation == DIVIDE && num == 0;
    }

    public static double getNum(char operation) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        double num = scanner.nextDouble();

        if (operation == '1') {
            return num;
        }

        while (isDivisionByZero(operation, num)) {
            System.out.println("Деление на ноль запрещено. Попробуйте ввести новое значение");
            num = scanner.nextDouble();
        }
        return num;
    }

    public static void printResult(double num1, char operation, double num2, double result) {
        System.out.printf("%.2f %s %.2f = %.2f%n", num1, operation, num2, result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double substract(double a, double b) {
        return a - b;
    }

    public static double multipli(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double proc(double a, double b) {
        return a % b;
    }
}
