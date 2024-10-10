package lesson.lesson_10_10;

public class Task5 {
//    Вывести на экран “равнобедренный треугольник”,
//    все “рёбра” которого состоят из единиц, “медиана” равна целому числу n,
//    а вся “площадь” заполнена нулями =)
//    пример: n = 5
//            1
//            11
//            101
//            1001
//            10001
//            1001
//            101
//            11
//            1

    public static void main(String[] args) {
        int a = 10;
        printTriangle(a);
    }

    private static void printTriangle(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("1");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        for (int i = a - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("1");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
