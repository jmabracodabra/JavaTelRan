package lesson.lesson_14_10;

import java.util.Scanner;

public class Game {

//    Вы реализуете игру, в которой вы показываете пользователю некоторые параметры, 
//    нажмите 1, чтобы сделать это..., 
//    нажмите 2, чтобы сделать это... и т. д., 
//    и нажмите "Q", чтобы выйти из игры.
//
//    Реализуйте меню выбора игрока (Elf or Orc and Exit)
//    Отобразите меню
//1. Elf
//2. Orc
//3. Exit
//    Проверьте ввод на соответствие, в случае неверного ввода распечатайте "Choose any one : " и покажите меню выбора
//    Сохраните выбор
//    Распечатайте выбор в консоль

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        do {
//            String role = sc.nextLine();
//
//            System.out.println("Hi! + \n" +
//                    "enter 1 to be an Elf + \n" +
//                    "enter 2 to be an Orc + \n" +
//                    "enter 3 to exit");
//            getRole(role);
//        }while ()

    }

    private static void getRole(String role){
        if (role.equals("1")){
            System.out.println("You are an Elf");
        } else if (role.equals("2")) {
            System.out.println("You are an Orc");
        } else {
            System.out.println("Enter 1, 2 or 3");
        }
    }


}
