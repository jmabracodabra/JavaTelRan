package lesson.lesson_15_10;

public class DogMain {
    public static void main(String[] args) {
        Dog bobik = new Dog("Bobik", 3);
        Dog spike = new Dog("Spike", 7);


        System.out.println(bobik.equals(spike));
    }
}
