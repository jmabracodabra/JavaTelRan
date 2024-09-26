package homework.homework2;

public class Task1 {

    public static void main(String[] args) {

        //    Создайте строку через new - I study Basic Java!
        String str = new String("I study Basic Java!");

        //    Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println("Penultimate character is: " + str.charAt(str.length() - 2));

        //    Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println("Str contains 'Java'? " + str.contains("Java"));

        //    Вырезать строку Java c помощью метода String.substring().
        System.out.println("The substring is: " + str.substring(14,18));

        //    Заменить все символы “а” на “о”.
        System.out.println("The changed substring is: " + str.replace('a','o'));

        //    Преобразуйте строку к верхнему регистру.
        System.out.println("Uppercase: " + str.toUpperCase());

        //    Преобразуйте строку к нижнему регистру.
        System.out.println("Lowercase: " + str.toLowerCase());


    }

}
