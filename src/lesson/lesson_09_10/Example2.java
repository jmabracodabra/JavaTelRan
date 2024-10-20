package lesson.lesson_09_10;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        /*
        * Самостоятельно:
        1. Создайте switch-блок, который мог бы определить, является ли
           переданный день выходным или рабочим днем.
        2. Создайте переменные int day; String dayString;
        3. Используйте объединение для нескольких случаев без операторов break
        4. Реализуйте тот же процесс используя if-else блоки
        5. Реализуйте тот же процесс используя тернарное выражение
        6. Сравните решения
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int day = sc.nextInt();

        System.out.println("Your day is: " + getDayType(day));
        System.out.println("Your day is: " + getIfElsDay(day));
        System.out.println("Your day is: " + getTernaryDay(day));

    }

    private static String getDayType(int day) {
        String dayType;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Workday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Undefined";
        }
        return dayType;
    }

    private static String getIfElsDay(int num){
        if (num >= 1 && num <=5){
            return "Workday";
        } else if (num > 5 && num <=7){
            return "Weekend";
        }else {
            return "Undefined";
        }
    }

    private static String getTernaryDay(int day){
        return day>=1 && day<=7 ?( day >= 1 && day <=5 ? "Workday" : "Weekend") : "Undefined";
    }

    public static String isWorking(int day) {
        return (day < 6 && day > 0) ? "Working" : (day == 6 || day == 7) ? "Holiday" : "Invalid";
    }


}
