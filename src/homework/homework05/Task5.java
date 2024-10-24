package homework.homework05;

public class Task5 {
    //    Дополнительно
//    Создать программу, которая переставит числа в переменных таким образом,
//    чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
//
//    Например:
//    Числа в переменных a, b и c: 7 0 -5
//    Возрастающая последовательность -5 0 7

    public static void main(String[] args) {
        printAsc(7, 0, -5);
        printAsc(0, 7, -5);
        printAsc(-5, 0, 7);
        printAsc(0, -5, 7);
    }

    public static void printAsc(int a, int b, int c) {
        int tmp;

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        if (a > c) {
            tmp = a;
            a = c;
            c = tmp;
        }

        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        System.out.println(a + ", " + b + ", " + c);
    }
}
