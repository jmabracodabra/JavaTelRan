package lesson.lesson_11_10;

public class App {
    public static void main(String[] args) {
        method();
        System.out.println("qwerty");
    }

    private static void method() {
        for (int i = 0; i < 10; i++) {
            System.out.println("outer = " + i);
            for (int j = i + 11; j < 20; j++) {
                if (j % 5 == 0) { // идем до первого кратного пяти числа
                    return;
                }
                System.out.println("j = " + j);
            }
            System.out.println("тест строка" );
        }
    }

}
