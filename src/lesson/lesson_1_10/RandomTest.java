package lesson.lesson_1_10;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
//        Random rand = new Random();
//        int randNum1 = rand.nextInt();
//        int randNum2 = rand.nextInt(10);
//        int randNum3 = rand.nextInt(10,100);
//
//        System.out.println("rand1 " + randNum1);
//        System.out.println("rand2 " + randNum2);
//        System.out.println("rand3 " + randNum3);
//
//        double randDouble = rand.nextDouble();

        double num = Math.random(); //double from 0 to 1
        System.out.println(num);


        //       call method random() from Math class
        double num1 = Math.random(); // double from 0 to 1
        System.out.println("num = " + num);

//        Math.random()*(max-min+1)+min
//        Math.random() => from 0 to 1
//        max-min+1 => 50 - 10 + 1 = 41
//        Math.random()*(max-min+1) => from 0 to 41 - 1 = 40 double
//        Math.random()*(max-min+1)+min => from 10 to 51(51 - 1 = 50)
        int minVal = 10;
        int maxVal = 50;
        int randValue = (int) (Math.random() * (maxVal - minVal + 1) + minVal);
        System.out.println("randValue = " + randValue);


        Random ran = new Random();

        int newInt = ran.nextInt(11);
        float newFloat = ran.nextFloat();
        double newDouble = ran.nextDouble();

        System.out.println("newInt " + newInt);
        System.out.println("newFloat " + newFloat);
        System.out.println("newDouble " + newDouble);

        /* Использование Math.random 

        Объявить минимальное значение диапазона
        Объявить максимальное значение диапазона
        Используйте формулу Math.random()*(max-min+1)+min для создания значений, включающих значение min и max */

        double min = 2.25;
        double max = 12.99;
        double res = Math.random() * (max - min + 1) + min;
        System.out.println("res = " + res);

    }
}
