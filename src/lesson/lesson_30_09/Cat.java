package lesson.lesson_30_09;

public class Cat {
    private String color;
    private String type;
    private int age;

    public Cat(){

    }
    public Cat(int age){
        this.age = age;
    }

    public Cat(String type, String color){
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Age: " + this.age + ", type: " + this.type + ", color: " + this.color;
    }

}
