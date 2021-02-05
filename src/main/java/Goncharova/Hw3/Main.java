package Goncharova.Hw3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Game1();
        Game2();
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
        int l = 0;
        if (origin.length() <= userstr.length()) {
            l = origin.length();
        } else {
            l = userstr.length();
        }

        for (int i = 0; i < l; i++) {
            if (origin.charAt(i) == userstr.charAt(i)) {
                Res += origin.charAt(i);
            }
            else {
                Res += "#";
            }
        }
        for (int i = l; i < 15; i++) {
            Res += "#";
        }
        return Res;
    }
    public static void Game2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String userAnswer = "";
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = random.nextInt(words.length);

        while (words[n].equals(userAnswer) == false) {
            System.out.print("Введите слово: ->>");
            userAnswer = scanner.nextLine();
            userAnswer = userAnswer.toLowerCase(Locale.ROOT);
            System.out.println(cmp(words[n], userAnswer));

        }
        System.out.println("Поздравляем, Вы отгадали слово!");

    }
}
