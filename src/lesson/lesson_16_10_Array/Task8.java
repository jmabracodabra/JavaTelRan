package lesson.lesson_16_10_Array;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    //    Создать массив из 20 случайных чисел в диапазоне от -10 до 30.
//    Написать программу, определяющую сумму элементов массива, находящихся в
//    массиве после первого отрицательного элемента.
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(-10, 31);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(getSum(arr));
    }

    private static int getSum(int[] arr) {
        boolean isFirstNeg = false;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                continue;
            } else {
                isFirstNeg = true;
                for (int j = arr[i]; j < arr[arr.length-1]; j++) {
                    sum += arr[j];
                    System.out.println(arr[j]);
                }
                return sum;
            }
        }
        return sum;
    }
}
