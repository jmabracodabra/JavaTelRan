package lesson.summery_18_10;

import java.util.Arrays;

public class StringBuilderBuffer {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println("Сравните строки 1 и 2 используя ==  . результат: " + (str1 == str2));
        System.out.println("Сравните строки 1 и 2 используя equals  . результат: " + (str1.equals(str2)));
        System.out.println(" Сравните строки 3 и 4 используя ==  . результат: " + (str3 == str4));
        System.out.println("Сравните строки 3 и 4 используя equals . результат: " + (str3.equals(str4)));
        System.out.println(" Сравните строки 1 и 3 используя ==  . результат: " + (str1 == str3));
        System.out.println("Сравните строки 1 и 3 используя equals . результат: " + (str1.equals(str3)));

        String hello = "hello";
        String my = "my";
        String friends = "friends";
        String allPhrase = hello + " " + my + " " + friends;
        System.out.println("allPhrase = " + allPhrase);

        StringBuilder strB = new StringBuilder("hello");
        strB.append(" ").append(my).append(" ").append(friends);
        System.out.println("strB = " + strB.toString());

        StringBuffer strBuf = new StringBuffer("hello");
        strBuf.append(" ").append(my).append(" ").append(friends);
        System.out.println("strB = " + strBuf.toString());

        System.out.println(strBuf.capacity());
        System.out.println(strBuf.length());

//        1. Создайте StringBuilder объекты используя все предоставленные конструкторы
//        2. Используя метод append добавьте к объекту, который создан при помощи конструктора
//        без параметров, строку “StartaUniversityˮ
//        3. Распечатайте все объекты на консоле
//        4. Примените метод reverse() к любому созданному объекту
//        5. Распечатайте объект на консоле

        StringBuilder sb = new StringBuilder();
        sb.append("StartaUniversity");
        System.out.println("sb1= " + sb);
        sb.reverse();
        System.out.println("reversed= " + sb);

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" ").append("world!");
        System.out.println("sb1 = " + sb1);
        sb1.insert(6, "beautiful");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());
        char[] charMass = new char[sb1.length()];
        sb1.getChars(0, sb1.length(), charMass, 0);
        System.out.println(Arrays.toString(charMass));
    }
}
