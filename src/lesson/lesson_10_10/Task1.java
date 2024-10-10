package lesson.lesson_10_10;

import java.util.Scanner;

public class Task1 {

    //    Реализуйте метод который принимает два числа, сравнивает их и возвращает
    //    сумму всех вхождений в максимальное число.
    //    Например:
    //    Вход = 2, 3
    //    Выход = 6
    //    Объяснение: 3 больше чем 2, все вхождения 1+2+3 = 6

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first int: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a second int: ");
        int num2 = sc.nextInt();

        System.out.println(getSumOfGreatest(num1, num2));
    }

    private static int getSumOfGreatest(int a, int b) {
        int sum = 0;
        int max = Math.max(a, b);

        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
