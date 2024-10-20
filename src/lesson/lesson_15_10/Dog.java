package lesson.lesson_15_10;

public class Dog extends Object {
    private String name;
    private int age;

    public Dog(){}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    @Override
    public String toString() {
        return this.name + " has " + this.age + " years old";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog d = (Dog) obj;
        return this.name == d.name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.hashCode();
        return result;
    }
}
