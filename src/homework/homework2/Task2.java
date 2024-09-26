package homework.homework2;

import java.util.Scanner;

public class Task2 {
    /*Создайте методы с математическими операциями +, -, *, /
    Каждый метод принимает два числа в параметрах и возвращает результат
    Вызовите все методы в main
    Результат распечатайте в консоль*/

    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);

        System.out.println("Enter a first number");
        double num1 = newScanner.nextDouble();

        System.out.println("Enter a second number");
        double num2 = newScanner.nextDouble();

        System.out.println("Enter an operator");
        String operator = newScanner.next();

        switch (operator) {
            case "+":
                System.out.println(add(num1, num2));
                break;
            case "-":
                System.out.println(subtract(num1, num2));
                break;
            case "*":
                System.out.println(multiply(num1, num2));
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("oops...");
                } else {
                    System.out.println(divide(num1, num2));
                }
                break;
            default:
                System.out.println("The operator is not valid");
        }

    }


    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}
