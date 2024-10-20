package lesson.lesson_16_10_Array;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
//    Создать массив из 10 случайных чисел в диапазоне от -20 до 20.
//    Определить количество, сумму и среднее арифметическое положительных элементов массива.

    public static void main(String[] args) {
        Random r = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(-20, 21);
        }

        int countPositive = 0;
        int sumPositive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                countPositive++;
                sumPositive +=arr[i];
            }
        }

        double avg = (double) sumPositive /countPositive;

        System.out.println(Arrays.toString(arr));
        System.out.println("Quantity of positive is: " + countPositive);
        System.out.println("Sum of positive is: " + sumPositive);
        System.out.println("Avg is: " + avg);
    }
}
