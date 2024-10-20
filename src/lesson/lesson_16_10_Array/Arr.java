package lesson.lesson_16_10_Array;

import java.util.Random;

public class Arr {
    public static void main(String[] args) {
        // init array (arr's size)
        int[] arr = new int[10];
        //System.out.println(arr.length);

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10, 20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The first element: " + arr[0]);
        System.out.println("The last element: " + arr[arr.length - 1]);

        //init array
        int[] arrLiteral = {1, 2, 3, 4, 5};
        //System.out.println(arrLiteral.length);


    }
}
