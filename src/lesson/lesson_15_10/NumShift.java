package lesson.lesson_15_10;

public class NumShift {
    public static void main(String[] args) {
        int number = 12345;
        int n = 4;
        String shiftedNumber = cyclicShiftLeft(String.valueOf(number), n);
        System.out.println("Result: " + shiftedNumber);
    }

    public static String cyclicShiftLeft(String number, int shift) {
        int length = number.length();
        shift = shift % length;
        String leftPart = number.substring(0, shift);
        String rightPart = number.substring(shift);
        return rightPart + leftPart;
    }
}
