package lesson.lesson_10_10;

import java.util.Scanner;
import java.util.StringJoiner;

public class Task3 {
//    Задание 3:
//            1. Получите от пользователя Строку.
//            2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//    Для решения используйте цикл и charAt() метод
//    Например:
//    Вход = “I don’t like rain !”
//    выход = I,d,o,n,t,l,i,k,e,r,a,i,n

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a string");

        String str = sc.nextLine();

        printAString(str);
    }

    private static void printAString(String str) {
        boolean firstValidPrinted = false;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) != '.')
                    && (str.charAt(i) != '!')
                    && (str.charAt(i) != '?')
                    && (str.charAt(i) != '’')
                    && (str.charAt(i) != ' ')
            ) {
                if (!firstValidPrinted) {
                    System.out.print(str.charAt(i));
                    firstValidPrinted = true;
                } else {
                    System.out.print(", " + str.charAt(i));
                }
            }
        }
    }
}
