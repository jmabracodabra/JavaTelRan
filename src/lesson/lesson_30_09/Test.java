package lesson.lesson_30_09;

public class Test {
    public static void main(String[] args) {
        Cat mur = new Cat();
        System.out.println(mur);

        Cat bars = new Cat(15);
        System.out.println(bars);

        Cat jugger = new Cat("Street cat","Gray");
        System.out.println(jugger);

    }
}
