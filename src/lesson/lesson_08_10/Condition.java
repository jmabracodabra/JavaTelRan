package lesson.lesson_08_10;

public class Condition {
    public static void main(String[] args) {
//        &&, || - операторы краткой схемы
//        &, | - операторы полной схемы

//        boolean resultOne = methodOne();
//        boolean resultTwo = methodTwo();
//
//        //обе переменные true
//        if(resultOne && resultTwo){
//            System.out.println("Hello from if");
//        }

        /*
         * if(condition){
         * блок кода выполняется, если условие true
         * } else{
         * блок кода выполняется, если условие false
         * }
         * */

        int a = 10;
        if (a > 15) {
            System.out.println("Greater than 15");
        }else {
            System.out.println("Less than 15");
        }
    }


}
