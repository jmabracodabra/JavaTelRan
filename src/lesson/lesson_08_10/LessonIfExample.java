package lesson.lesson_08_10;

import java.util.Scanner;

public class LessonIfExample {
    public static void main(String[] args) {
        //nested if
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number from 1 to 4: ");
        int data = sc.nextInt();
        if (data == 1) {
            System.out.println("the number is 1");
        } else if (data == 2) {
            System.out.println("the number is 2");
        } else if (data == 3) {
            System.out.println("the number is 3");
        } else if (data == 4) {
            System.out.println("the number is 4");
        } else {
            System.out.println("the number is other");
        }
    }

    private static void printStringLength(String str) {
        if (str == null) {
            System.out.println("Warning!");
        } else {
            System.out.println("String is " + str);
            System.out.println("String length is" + str.length());
        }
    }

    private static void printStringLengthTwo(String str) {
        if (str == null) {
            System.out.println("Warning!");
            return; // прекратить выполнение метода, если возвращаемый тип - void
        }
        System.out.println("String is " + str);
        System.out.println("String length is" + str.length());
    }
}

