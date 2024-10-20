package lesson.lesson_08_10;

public class Practice {

    public static void main(String[] args) {

        /* Создайте две переменные *isWeekend* и *isRain*.
        Создайте переменную *canWalk*, значение которой должно быть истинным,
        если это выходной день (isWeekend = true) и не идет дождь (isRain = false).
        Создайте метод, который принимает два параметра и возвращает значение true/false
        Результат сохраните в canWalk
        Распечатайте в консоль. */

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = canWalk(isWeekend, isRain);

        if(canWalk){
            System.out.println("We can walk");
        } else {
            System.out.println("Stay at home");
        }


    }

    private static boolean canWalk(boolean isWeekend, boolean isRain) {

//        if (isWeekend && !isRain) {
//            return true;
//        } else {
//            return false;
//        }


//        if (isWeekend && !isRain) {
//            return true;
//        }
//        return false;

        return isWeekend && !isRain;
    }
}
