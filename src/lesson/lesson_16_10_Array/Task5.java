package lesson.lesson_16_10_Array;

public class Task5 {
    public static void main(String[] args) {
        String[] weekDays = new String[7];
        weekDays[0] = "Monday";
        weekDays[1] = "Tuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";


        String[] days = new String[]{
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        System.out.print(weekDays[weekDays.length-1]);
        System.out.println();
        System.out.print(days[days.length-1]);

    }
}
