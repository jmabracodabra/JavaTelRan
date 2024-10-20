package lesson.lesson_11_10;

public class ArrPractice {
    public static void main(String[] args) {
        Integer[] test = {1, 2, 3, 4, 5};

        int sum = 0;
        for (Integer elem : test) {
            if (elem % 2 == 0){
                sum += elem;
            }
        }


    }
}
