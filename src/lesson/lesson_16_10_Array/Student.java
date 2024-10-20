package lesson.lesson_16_10_Array;

public class Student {
    private String name;

    public Student (String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "name is: " + this.name;
    }
}
