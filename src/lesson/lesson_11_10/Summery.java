package lesson.lesson_11_10;

public class Summery {
    public static void main(String[] args) {
        method();
        System.out.println("qwerty");
        tern();
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
            System.out.println("тест строка");
        }
    }

    private static void tern() {
        int score = 85;
//        String grade = score >= 80 ? "A" : "B";
        String grade = score >= 80 ? "A" : (score >=50 ? "B" : "C");

        System.out.println(grade);
    }


// Тернарный оператор
//    public static void main(String[] args) {
//        boolean логическоеУсловие = true;
//        String результат = логическоеУсловие ? "Правда" : "ложь";
//        System.out.println("result = " + результат);
//    }

}
