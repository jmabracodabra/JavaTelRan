package homework.homework05;

public class Task4 {
//    Сформировать SQL запрос: Вернуть все записи из cars, где параметры равны
//    заданным, используя StringBuilder.
//    Если значение null, то параметр не должен попадать в запрос.
//    {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//    Примечание: Не думайте, о том, как и в каком формате вы получаете данные на
//    вход.
//            Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//    Результат: SELECT * FROM cars WHERE id = '1' AND city = 'Helsinki';

    public static void main(String[] args) {
        String[] arr = {"id", "1", "country", "Finland", "city", "Helsinki", "year", null};

        StringBuilder sb = new StringBuilder("SELECT * FROM cars");
        boolean paramExists = false;

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i + 1] != null) {
                if (!paramExists) {
                    sb.append(" WHERE");
                    paramExists = true;
                } else {
                    sb.append(" AND");
                }
                sb.append(" ")
                        .append(arr[i])
                        .append(" = '")
                        .append(arr[i + 1])
                        .append("'");
            }
        }

        sb.append(";");

        System.out.println(sb);
    }
}
