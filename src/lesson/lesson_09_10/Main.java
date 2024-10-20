package lesson.lesson_09_10;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        char operator = '+';
        System.out.println(calc(num1, operator, num2));
    }

    public static int calc(int num1, char oper, int num2) {
        return switch (oper) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
    }


}
