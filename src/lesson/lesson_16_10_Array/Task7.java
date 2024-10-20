package lesson.lesson_16_10_Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Random r = new Random();

        int[] arr = new int[100];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(0, 21);
            if(arr[i] == num){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
