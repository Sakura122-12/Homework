package Goncharova.Hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game1();
    }

    public static void Game1() {
        int number = 0;
        int userAnswer = 0;
        boolean inGame = true;
        boolean correctAnswer = false;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        while (inGame == true) {
            number = random.nextInt(9);

            for (int i = 0; i < 3; i++) {

                correctAnswer = false;
                while (correctAnswer == false) {
                    System.out.print("Введите число от 0 до 9: ->>");
                    userAnswer = scanner.nextInt();
                    correctAnswer = ((userAnswer <= 9) && (userAnswer >= 0));
                    if (correctAnswer == false) {
                        System.out.println("Введенное число не попадает в нужный диапазон");
                    }
                }

                if (userAnswer == number) {
                    System.out.println("Поздравляем, Вы угадали!");
                    break;
                } else {
                    if (userAnswer > number) {
                        System.out.println("Указанное Вами число оказалось больше загаданного");
                    }
                    if (userAnswer < number) {
                        System.out.println("Указанное Вами число оказалось меньше загаданного");
                    }
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            userAnswer = scanner.nextInt();
            inGame = (userAnswer == 1);

        }

        scanner.close();
    }

    public static String cmp(String origin, String userstr) {
        String Res = "";
        for (int i = 0; i < origin.length(); i++) {
            if (origin.charAt(i) == userstr.charAt(i)) {
                Res += origin.charAt(i);
            }
            else {
                Res += "#";
            }
        }
        for (int i = origin.length(); i < 15; i++) {
            Res += "#";
        }
        return Res;
    }
    public static void Game2() {

    }
}
