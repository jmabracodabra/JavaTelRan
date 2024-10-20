package lesson.lesson_30_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        System.out.println("Hello Java!!!");
//        Car car = new Car();
////      before initialization
//        System.out.println(car.year);
//        System.out.println(car.name);
////      after init
////        car.name = "Audi";
////        car.year = 2002;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a name");
//        car.name = sc.nextLine();
//        System.out.println("Enter a year");
//        car.year = sc.nextInt();
//        System.out.println(car.year);
//        System.out.println(car.name);

        Car audi = new Car("audi",2022);
        System.out.println(audi);

        Car test = new Car();
    }
}
