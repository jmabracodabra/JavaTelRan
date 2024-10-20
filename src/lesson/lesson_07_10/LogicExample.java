package lesson.lesson_07_10;

public class LogicExample {
    public static void main(String[] args) {
        //унарные операторы - одна переменная
        //бинарные (арифметические) - 2 переменные
        //операторы присваивания
        //реляционные
        //логические
        //тернарный оператор
        //побитовый оператор

        //унарные операторы

        int num = 10;

        //unary -
        int numTwo = -num;

        System.out.println(num);
        System.out.println(numTwo);

        //increment, decrement

        num++; // increase by one -> count = count + 1; count += 1;
        System.out.println(num);

        num += 2; // increase by two (сокращенная форма записи)
        System.out.println(num);

        //decrement --
        num--;
        System.out.println(num);

        //increment, decrement: prefix, postfix
        //postfix: count++, count--
        //prefix : ++count, --count
        int test = 5;
        System.out.println("test = " + test); // 5

        System.out.println("test (t + 1) = " + (test + 1)); // нет операции присвоение,
        // поэтому значение test не поменяется, только выведется в консоль 6

        System.out.println("test++ = " + test++); // 5, т.к. сначала переменная участвует в выражении,
        // а потом с помощью унарного оператора меняется ее значение
        // сначала напечатали, а потом увеличили на единицу
        // при этом значение test изменится, т.к. в ++ есть присвоение

        System.out.println("test = " + test); // 6

        System.out.println("++test = " + (++test)); // сразу 7 - сначала изменяется значение переменной,
        // потом оно участвует в выражении
        System.out.println("test = " + test); // 7

        //если не участвует в выражении, записано в виде отдельных строк, то разницы нет между ++test и test++,
        //переменная все равно изменится, обычно пишут test++ в отдельной строке

        //////////Example//////////

        int a = 10;
        int result = a++ + 2;

        System.out.println(result); //12
        System.out.println(a); //11
        System.out.println(result); //12
        // result = 12, a = 11;

        result = ++a + 7 + a++; //11 + 7 + 11 = 29 , a = 12
        //result = 29, a = 12

        System.out.println("result = " + result + "; a = " + a);

        a = 10;
        result = a + 7 - -a; // 10 + 7 - (-10) = 10 + 7 + 10 = 27
        //result = 27, a = 10
        System.out.println("result = " + result + "; a = " + a);

        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }


    }
}
