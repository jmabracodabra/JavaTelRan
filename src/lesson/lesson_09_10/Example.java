package lesson.lesson_09_10;

public class Example {
    /*
    * 1. Создайте switch-блок с днями недели
2. Создайте переменные int day; String dayString;
3. В каждом кейсе инициализируйте переменную dayString правильным
значением.
4. Запустите программу, передав в switch-условие день 2.
5. В case №4 удалите break;
6. Запустите программу
7. Проанализируйте вывод*/

    public static void main(String[] args) {
        int day = 2;
        String dayName = getDayName(day);
        System.out.println(dayName);
    }

    private static String getDayName(int day) {

        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Error";
        };
    }

}
