package lesson.lesson_16_10_Array;

import java.util.Arrays;

public class ArraysTestClass {
    public static void main(String[] args) {
        int[] arrayOne = {1,2,3,4,5,6,7,8,9};

        int[] arrayCopy = Arrays.copyOf(arrayOne, 3);

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayCopy));

        int[] arrayRange = Arrays.copyOfRange(arrayOne, 2, 5);
        System.out.println(Arrays.toString(arrayRange));

        int[] arraySort = {3, 2, 19, 5, 0,};
        System.out.println(Arrays.toString(arraySort));

        Arrays.sort(arraySort);
        System.out.println(Arrays.toString(arraySort));
    }
}
