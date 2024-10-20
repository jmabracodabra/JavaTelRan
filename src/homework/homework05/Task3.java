package homework.homework05;

public class Task3 {
//    Дан массив размера  N-1, содержащий только различные целые числа в диапазоне от  1 до N.
//    Найдите недостающий элемент.
//    Пример 1:
//    Вход:
//    N = 5
//    А[] = {1,2,3,5}
//    Выход: 4
//
//    Пример 2:
//    Вход:
//    N = 10
//    А[] = {6,1,2,8,3,4,7,10,5}
//    Выход: 9

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 4, 6, 8, 10};

        int sum = 0;
        int sumPlusOne = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length + 1; i++) {
            sumPlusOne += i;
        }

        sumPlusOne += arr.length + 1;

        System.out.println("Missing num = " + (sumPlusOne - sum));
    }
}
