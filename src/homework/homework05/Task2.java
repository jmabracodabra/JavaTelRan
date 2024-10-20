package homework.homework05;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
//    Создайте массив из 5 случайных целых чисел из интервала [10;99]
//    Выведите его на консоль в строку.
//    Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10, 100);
        }

//        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(Arrays.toString(arr));

        if (isAscending(arr)) {
            System.out.println("the sequence is ascending");
        } else {
            System.out.println("the sequence is NOT ascending");
        }
    }

    private static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
