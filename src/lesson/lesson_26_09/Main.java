package lesson.lesson_26_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String str = "Java";
//        str = str + "!!!";
//        System.out.println(str.hashCode());
//
//        int strLength = str.length();
//        System.out.println(strLength);
//
//        System.out.println(str.length()-1); //length
//        System.out.println(str.charAt(strLength-1)); //charAt
//        System.out.println(str.substring(4)); //from index[4] till the end
//        System.out.println(str.substring(2,4)); //from 2 till 4 (4 is not included)
//
//        String upperCaseString = "JAVA";
//        System.out.println(upperCaseString);
//        System.out.println(upperCaseString.toLowerCase());
//        System.out.println();
//        String lowerCaseString = "java";
//        System.out.println(lowerCaseString);
//        System.out.println(lowerCaseString.toUpperCase());

//        Создать строку “I like Java”
//        Распечатать последний символ строки. Используем метод String.charAt().
//                Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
//                Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
//                Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

//        Scanner str = new Scanner(System.in);
//        String newStr = str.nextLine();
//
//        //String newStr = "I like Java";
//        System.out.println("The last character is: " + newStr.charAt(newStr.length()-1));
//
//        System.out.println("The line ends with “!!!”? " + newStr.endsWith("!!!"));
//
//        System.out.println("The line begins with “I like”? " + newStr.startsWith("I like"));
//
//        System.out.println("The line contains 'Java' " + newStr.contains("Java"));


//      Char to int ________________________________________________________________
//      int to char using ASCII
        int num = 100;
        char ch = (char) num;
        System.out.println(ch);

        char chToInt = 'A';
        int numChar = chToInt;
        System.out.println(numChar);

//        String.valueOf() UNICODE
        char chValueOf = String.valueOf(num).charAt(0);
        System.out.println(chValueOf);

//        Char.getNumericValue
        int chGetNumericValue = Character.getNumericValue('\u0078');
        System.out.println(chGetNumericValue);

        String aaa = String.valueOf('a');
    }

}
