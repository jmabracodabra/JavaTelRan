package lesson.lesson_25_09;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner inputData = new Scanner(System.in);
//        System.out.println("Enter a value:");

//        String userInput = inputData.next(); //next() - only first word
//        System.out.println("The first word you've entered is '" + userInput + "'");

//        String inputLine = inputData.nextLine(); //nextLine() - all line
//        System.out.println("You've entered: " + inputLine);

//        int userNumber = inputData.nextInt();
//        System.out.println(userNumber);

//        double userDouble = inputData.nextDouble();
//        System.out.println(userDouble);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num1 = input.nextInt();

        System.out.println("Enter a number:");
        double num2 = input.nextInt();

        System.out.println("Enter an operator");
        String operator = input.next();

        double result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator");
        }

        System.out.println(result);


//        System.out.printf("%.2f + %.2f = %.2f %n", num1, num2, num1 + num2);
//        System.out.printf("%.2f - %.2f = %.2f %n", num1, num2, num1 - num2);
//        System.out.printf("%.2f * %.2f = %.2f %n", num1, num2, num1 * num2);
//        System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);


    }


}
