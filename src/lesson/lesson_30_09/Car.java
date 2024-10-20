package lesson.lesson_30_09;

public class Car {
    private String name;
    private int year;

    public Car(){

    }
    public Car(String name){
        this.name = name;
    }

    public Car(int year){
        this.year = year;
    }
    public Car(String name, int year){
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", year: " + this.year;
    }

}

