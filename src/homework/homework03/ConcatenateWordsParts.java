package homework.homework03;

import java.util.Scanner;

public class ConcatenateWordsParts {
    public static void main(String[] args) {
        System.out.println("Enter a first word");
        String firstWord = getWord();

        System.out.println("Enter a second word");
        String secondWord = getWord();

        System.out.println(concatWords(firstWord, secondWord));
    }

    public static String getWord() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static String concatWords(String firstWord, String secondWord) {
        if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
            return firstWord.substring(0, firstWord.length() / 2)
                    + secondWord.substring(secondWord.length() / 2);
        } else {
            System.out.println("One or the both words consist of the odd number of characters");
        }
        return "Please, try again";
    }
}