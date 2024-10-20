package lesson.test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        /*У вас на банковском счету N долларов.
Вы хотите снять все, но банк разрешает снять только сумму,
 которая является делителем текущей суммы на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день,
 сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
Ввод:  N = 21
Выход:  7
Объяснение:  N = 21
Снято 7, осталось = 14
Снято 7, осталось = 7
Снято 1, осталось = 6
Снято 3, осталось = 3
Снято 1, осталось = 2
Снято 1, Осталось = 1
Снято 1, осталось = 0 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();
        getMaxDivisor(n);
    }

    private static void getMaxDivisor(int n) {
        if (n == 1) {
            System.out.println("Вы можете снять " + n);
        }
        for (int i = n - 1; i >= 1; i--) {
            int mon = (n - i);
            if (n % i == 0) {
                for (int k = mon; k >= 1; k--) {
                    System.out.println("Снято " + i);
                    System.out.println("Осталось снять  " + (mon));
                }
                return;
            }
        }
    }

}

