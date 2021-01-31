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
        }


        scanner.close();
        return false;
    }
}
