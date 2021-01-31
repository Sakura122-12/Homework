package Goncharova.Hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game1();
    }

    public static boolean Game1() {
        int number = 0;
        int userAnswer = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        number = random.nextInt(9);
        System.out.println(number);

        for (int i = 0; i < 3; i++) {

            System.out.print("Введите число от 0 до 9: ->>");
            userAnswer = scanner.nextInt();

            if (userAnswer == number) {
                System.out.println("Поздравляем, Вы угадали!");
                break;
            }
            else {
                if (userAnswer > number) {
                    System.out.println("Указанное Вами число оказалось больше загаданного");
                }
                if (userAnswer < number) {
                    System.out.println("Указанное Вами число оказалось меньше загаданного");
                }
            }
        }


        scanner.close();
        return false;
    }
}
