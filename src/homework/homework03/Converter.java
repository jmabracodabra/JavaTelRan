package homework.homework03;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        double exchangeRate = 1.1071;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Euro");
        double amountEuro = sc.nextDouble();
        System.out.println(convert(amountEuro, exchangeRate));
    }

    public static double convert(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
