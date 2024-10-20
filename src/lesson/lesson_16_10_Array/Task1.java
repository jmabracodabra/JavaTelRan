package lesson.lesson_16_10_Array;

public class Task1 {
    //    Инициализируйте массив числами от 1 до 10 используя способ литерала
//    Выведите на консоль элемент из второй ячейки
//    Выведите на консоль элемент из предпоследней ячейки
//    Распечатайте на консоль все элементы из ячеек массива
//    Используйте инструкцию .print()
//    Замените все элементы в данном массиве на значение “-1”
//    Распечатайте на консоль все элементы из ячеек массива
//    Используйте инструкцию .print()
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The second element is " + arr[1]);
        System.out.println("The penult element is " + arr[arr.length - 2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
            System.out.print(arr[i] + " ");
        }
    }
}
