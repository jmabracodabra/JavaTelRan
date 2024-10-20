package lesson.lesson_16_10_Array;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[getSize()];

        int j = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                arr[i] = i;
            }
            j++;
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int getSize() {
        int count = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

//    int[] arr = new int[50];
////        int j = 0;
//        for (int i = 1, j = 0; i < 100; i+=2, j++) {
//        arr[j] = i;
////            j++;
//    }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = arr.length - 1; i > -1 ; i--) {
//        System.out.print(arr[i] + " ");
//    }
}
