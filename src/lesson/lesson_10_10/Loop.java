package lesson.lesson_10_10;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();

        System.out.println("Please, enter a string");
        String str = sc.nextLine();

//        System.out.println(getSum(num1, num2));

        getLalala(str);

        //printNums(num);

//        printHello();
//        printEven(num);
    }

//    private static void printNums(int num) {
//        for (int i = 1; i <= num; i++) {
//            System.out.println(i);
//        }
//    }

    private static void printHello() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello my friend !");
        }
    }

    //    Создайте метод, который принимает число и выводит в консоль только
//    четные вхождения в это число
//    Например:
//    Вход = 5, выход = 2, 4
    private static void printEven(int num) {
        for (int i = 2; i <= num; i += 2) {
            System.out.println(i);
        }
    }



//    Задание: 2
//    Вывести на экран в одну строку все нечётные числа от 0 до 100.

    private static void printNums() {
    }

//    Задание 3:
//            1. Получите от пользователя Строку.
//            2. Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//3. Для решения используйте цикл и charAt() метод
//    Например:
//    Вход = “I don’t like rain !”
//    выход = I,d,o,n,t,l,i,k,e,r,a,i,n
//

    public static void getLalala(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '?' || str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '\n') {
                continue;
            } else {
                System.out.print(str.charAt(i) + ", ");
            }
        }
    }

//    Задание 4:
//    В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
//    Задание 5:
//    Вывести на экран “равнобедренный треугольник”, все “рёбра” которого состоят из единиц, “медиана” равна целому числу n, а вся “площадь” заполнена нулями =)
//    пример: n = 5
//            1
//            11
//            101
//            1001
//            10001
//            1001
//            101
//            11
//            1


}
