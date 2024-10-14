package homework.homework04;

import java.util.Scanner;

public class Device {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first flask temperature");
        int temperature1 = sc.nextInt();

        System.out.println("Enter the second flask temperature");
        int temperature2 = sc.nextInt();

        if(isCorrect(temperature1,temperature2)){
            System.out.println("The device works correctly");
        } else {
            System.out.println("The device might be broken");
        }
    }

    private static boolean isCorrect(int temp1, int temp2){
        return temp1>100 && temp2<100;
    }
}
