package lesson.summery_18_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    private static final Random rnd = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи размерность массива: ");
        int n = scanner.nextInt();
        int[] mass = prepareArray(n);
        System.out.println("mass = " + Arrays.toString(mass));
        bubbleSort(mass);
        System.out.println("mass = " + Arrays.toString(mass));
    }

    private static int[] prepareArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rnd.nextInt(101);
        }
        return arr;
    }

    private static void bubbleSort(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            boolean isSort = false;
            for (int j = 0; j < mass.length - 1; j++) {
                if ( mass[j] > mass[j + 1]) {
                    int temp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = temp;
                    isSort=true;
                }
            }
            if(!isSort){
                break;
            }
        }
    }
}
