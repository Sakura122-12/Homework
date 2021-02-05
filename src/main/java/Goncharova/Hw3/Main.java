package Goncharova.Hw3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Game1();
        //Game2();
        Player computer = new Player('x', true);
        Player human = new Player('o', false);
        Field field = new Field((byte) 5, (byte) 4);

        boolean gameover = false;

        while (!gameover) {
            System.out.println("---Ход компьютера---");
            computer.turn(field);
            field.print();
            System.out.println("--------------");

            gameover = (!field.checkWin().equals("Не обнаружено"));

            if (gameover) {
                System.out.println("Выиграл компьютер!");
                return;
            }

            if (!field.emptyCellsAvailable()) {
                System.out.println("Нет свободных ячеек");
                return;
            }

            System.out.println("---Ход человека---");
            System.out.println("Введите номер строки и столбца через пробел:");
            human.turn(field);
            field.print();
            System.out.println("--------------");

            gameover = (!field.checkWin().equals("Не обнаружено"));

            if (gameover) {
                System.out.println("Выиграл человек!");
                return;
            }

            if (!field.emptyCellsAvailable()) {
                System.out.println("Нет свободных ячеек");
                return;
            }
        }
    }
}
