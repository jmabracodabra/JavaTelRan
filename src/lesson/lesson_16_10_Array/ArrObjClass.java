package lesson.lesson_16_10_Array;

public class ArrObjClass {
    public static void main(String[] args) {
        Student[] studentArr = new Student[10];

        for (int i = 0; i < studentArr.length; i++) {
            System.out.print(studentArr[i] + " ");
        }

        System.out.println();

        Student[] studentsLiteral = new Student[]{
                new Student("Alex"),
                new Student("Max"),
                new Student("Bob"),
        };

        for (int i = 0; i < studentsLiteral.length; i++) {
            System.out.print(studentsLiteral[i] + " ");
        }
    }
}
