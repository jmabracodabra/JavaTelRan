package lesson.calculator;

import java.util.Scanner;

import static lesson.calculator.Const.*;
import static lesson.calculator.Utils.*;


public class Calc {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String oneMore = YES;
        char operation = '1';

        while (oneMore.equals(YES)) {

            double num1 = getNum(operation);

            operation = getOperation();

            double num2 = getNum(operation);

            double result = getResult(operation, num1, num2);

            printResult(num1, operation, num2, result);

            System.out.println("Do you want to continue? Y/N");
            oneMore = scanner.next();
            while (!oneMore.equalsIgnoreCase(YES) && !oneMore.equalsIgnoreCase(NO)) {
                System.out.println("Please, enter 'Y' or 'N'");
                oneMore = scanner.next();
            }
        }
    }
}
