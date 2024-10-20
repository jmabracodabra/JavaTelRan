package lesson.lesson_30_09;

public class ConvertTypes {
    public static void main(String[] args) {
        int num = 45;
        int system = 2;
        System.out.println("decimal " + num + " = " + Long.toString(num,system) + " binary"); // перевести в двоичную систему
    }
}
