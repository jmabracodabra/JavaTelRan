package lesson.lesson_10_10;

public class Task4 {
    //    В диапазоне от 0 до 100  вывести на экран первые 25 чётных чисел, исключая “десятки”.
    public static void main(String[] args) {
        printEvens();
    }

    private static void printEvens() {
        int count = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 && i % 10 != 0) {
                System.out.println(i);
                count++;
                if (count >= 25) {
                    break;
                }
            }
        }
    }
}
