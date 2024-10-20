package lesson.StringBuilderBuffer;

public class Task1 {
    public static void main(String[] args) {
        printReverce("text", "new");
    }

    //    Напишите метод, который принимает две строки в аргументах, соединяет
//    их и определяет реверсивный порядок, выведите результат на консоль.
//    a. concatReversStr(String str1, String str2)
    private static void printReverce(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(str1).append(str2).reverse());
        replaceQuestion();
    }


//            2. Дан массив символов, объедините его и замените символ '?' на
//    правильный символ, выведите результат на консоль.
//            a. char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

    private static void replaceQuestion() {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
        StringBuilder st = new StringBuilder();

        //куда сохранилось значение?
        st.append(arr);
        System.out.println(arr);

        st.replace(5, 6, "e");
        System.out.println(st);
    }

}
