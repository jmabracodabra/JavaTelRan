package homework.homework01;

public class Homework1 {
    public static void main(String[] args) {


//        Task 1
        char ch = 'G';
        Character chObj = 'G';
        int num = 89;
        Integer numObj = 89;
        byte b = 4;
        Byte bObj = 4;
        short s = 56;
        Short sObj = 56;
        float f = 4.7333436f;
        Float fObj = 4.7333436f;
        double d = 4.355453532;
        Double dObj = 4.355453532;
        long l = 12121;
        Long lObj = 12121l;

        System.out.printf("char: %s%nCharacter: %s%n", ch, chObj);
        System.out.printf("int: %d%nInteger: %d%n", num, numObj);
        System.out.printf("byte: %d%nByte: %d%n", b, bObj);
        System.out.printf("short: %d%nShort: %d%n", s, sObj);
        System.out.printf("float: %f%nFloat: %f%n", f, fObj);
        System.out.printf("double: %f%nDouble: %f%n", d, dObj);
        System.out.printf("long: %d%nLong: %d%n", l, lObj);

//        Task 2
//        Дано трехзначное число. Вывести на экран все цифры этого числа
//        Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5

        int numb = 345;

        byte x = (byte) (numb / 100);
        byte y = (byte) (numb / 10 % 10);
        byte z = (byte) (numb % 10);

        System.out.printf("%d, %d, %d", x, y, z);
    }
}
