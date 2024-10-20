package lesson.lesson_07_10;

public class LogicExampleThree {
    public static void main(String[] args) {
        //Logic operators
        //OR (||), AND (&&), ! (!=)
        // expression1 operator expression2

        int a = 10;
        int b = 20;

        boolean cond1 = a == b; // true or false
        boolean cond2 = a <= b; // true or false

        if (cond1 && cond2){
            System.out.println("Hello");
        }

        //AND (&&) - результат работы всего выражения true, если левое и правое выражения true
        //OR (||) - результат работы всего выражения true, если хотя бы одно выражение true
        //NOT (!) - true, если выражение - false

        boolean res1 = cond1 && cond2;
        boolean res2 = cond1 || cond2;
        boolean res3 = !cond1;

        if((a==b) && (a<b)){

        }else {

        }

    }


}
