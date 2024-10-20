package lesson.lesson_10_10;

public class Task2 {

//    Вывести на экран в одну строку все нечётные числа от 0 до 100.

    public static void main(String[] args) {
        printOdds();
    }

    private static void printOdds() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i);
        }
    }
}
