package lesson.lesson_08_10;

public class LogicExample {
    public static void main(String[] args) {
        String text = null;

//      если будет & вместо &&, приведет к NPE
        if (text !=null && text.startsWith("H") && text.length() == 5){
            System.out.println("Ok");
        }
    }
}
