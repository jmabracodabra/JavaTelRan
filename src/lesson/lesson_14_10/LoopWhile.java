package lesson.lesson_14_10;

public class LoopWhile {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Current step (for) " + (i + 1));
//        }
//
//        int j = 0;
//        while (j < 5) {
//            System.out.println("Current step (while) " + (j + 1));
//            j += 2;
//        }
//
//        int k = 0;
//        while (true){
//            k += 2;
//            if (k <= 20){
//                System.out.println(k);
//            }
//            else {
//                break;
//            }
//        }

//        int i = 1;
//        do {
//            System.out.println("i = " + i);
//            i *= 3;
//        } while (i < 10);
//
//        int count = 10;
//        printHi(count);

//        Используйте цикл do-while
//        Инициализируйте переменную int i = 0;
//        Добавьте в тело инструкцию System.out.println("Я в теле DO");
//        Определите условие i < 3
//        Запустите код
//        Определите условие i < 0
//        Проанализируйте результат

        int i = 0;
        do {
            System.out.println("Я в теле DO " + i);
            i++;
        } while (i < 0);

    }

    private static void printHi(int count) {
        while (count > 0) {
            System.out.println("Hi " + count);
            count--;
        }
    }

}
