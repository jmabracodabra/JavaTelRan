package lesson.lesson_16_10_Array;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    //Создайте массив из 15 случайных целых чисел из отрезка [0;9].
    //Подсчитайте сколько в массиве чётных и нечетных элементов и
    // выведете это количество на экран на отдельной строке.

    public static void main(String[] args) {
        int[] arr = new int[15];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(0, 9);
        }

        System.out.println(Arrays.toString(arr));

        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Odds: " + odd);
        System.out.println("Evens: " + even);

    }
}
