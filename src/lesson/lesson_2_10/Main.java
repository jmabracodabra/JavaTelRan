package lesson.lesson_2_10;

public class Main {
    public static void main(String[] args) {
//        Random rand = new Random();
//        int num = rand.nextInt(2,11);
//        isEven(num);
//        Converter c = new Converter();
//        System.out.println(c.runFahrenheitConverter(12));
//        System.out.println(c.runKelvinConverter(12));
//        changePosition(2, 5);
//        changePosition2(2, 5);
//        Random rand = new Random();
//        int num = rand.nextInt(1, 10);
//
//        System.out.println(num);
//        System.out.println(getSquare(num));
//        System.out.println(getCube(num));

//        int r = 5;
//        System.out.println(circumference(r));
//        System.out.println(area(r));
        System.out.println(getCenter("madam"));
        System.out.println(getCenter("abcd"));
    }

    //работа со строкой
    public static String getCenter(String str) {
        String strFin;
        if (str.length() % 2 == 0) {
            String str1 = str.substring((str.length() - 1) / 2, str.length() / 2);
            String str2 = str.substring(str.length() / 2, str.length() - 1);
            strFin = str1 + str2;
        } else {
            strFin = str.substring((str.length() - 1) / 2, (str.length() + 1) / 2);
        }
        return strFin;
    }


//__________________________________
    // площадь и длина окружности
    public static double circumference(double r) {
        return 2 * 3.14 * r;
    }

    public static double area(double r) {
        return 3.14 * getSquare(r);
    }

//    С помощью рандома задается число.
//    Написать метод который возводит данное число в квадрат и метод, который возводит число в куб.

    public static double getSquare(double num) {
        return Math.pow(num, 2);
    }

    public static int getCube(int num) {
        return (int) Math.pow(num, 3);
    }


    //_______________________________________________
    public static void changePosition(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + ", " + b);
    }

    public static void changePosition2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + ", " + b);
    }

//_____________________________________________________
     public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void findEvenOdd(int num)  {
        if (num/2 == 0) {
            System.out.println(num+" is even"); }
        else  {
            System.out.println(num+" is odd");  }
    }


}
