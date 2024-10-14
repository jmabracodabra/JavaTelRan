package homework.homework04;

public class Account {
    public static void main(String[] args) {
        int balance = 15;
        System.out.println(getDays(balance));
    }

    private static int getMaxSumPerDay(int balance) {
        int i = balance - 1;
        while (balance % i != 0) {
            i--;
        }
        return i;
    }

    private static int getDays(int balance) {
        int day = 0;
        while (balance != 0) {
            if (balance == 1) {
                balance = balance - 1;
            } else {
                balance = balance - getMaxSumPerDay(balance);
            }
            day++;
        }
        return day;
    }
}
