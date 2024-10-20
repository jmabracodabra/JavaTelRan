package lesson.lesson_16_10_Array;

public class Pen {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                '}';
    }
}
