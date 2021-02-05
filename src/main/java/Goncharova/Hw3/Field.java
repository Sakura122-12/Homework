package Goncharova.Hw3;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class Field {

    static byte field[][];
    static byte size;
    static byte criteria;

    public static void main(String[] args) {
        size = 3;
        boolean gameover = false;
        byte row = 0;
        byte col = 0;
        Random random = new Random();
        boolean turnand = false;
        byte userRow = 0;
        byte userCol = 0;
        criteria = 3;

        Scanner scanner = new Scanner(System.in);


        //2Dim Array Allocation
        field = new byte[size][];
        for (int i = 0; i < size; i++) {
            field[i] = new byte[size];
        }

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                field[y][x] = ' ';
            }
        }

        //------------------------------------

        //fillField();
        while (gameover == false) {
            turnand = false;
            while (turnand == false) {
                row = (byte) random.nextInt(3);
                col = (byte) random.nextInt(3);
                turnand = Setcell(row, col, 'o');
            }

            print();
            System.out.println("--------------");

            turnand = false;
            while (turnand == false) {
                userRow = scanner.nextByte();
                userCol = scanner.nextByte();
                turnand = Setcell(userRow, userCol, 'x');
            }

            print();
            System.out.println("--------------");

            gameover = (checkWin() != "Не обнаружено");
        }
        //print();
        System.out.println(checkWin());
    }

    public static boolean Setcell(byte row, byte col, char sym) {
        if (field[row][col] != ' ') {
            return false;
        }
        field[row][col] = (byte) sym;
        return true;
    }

    public static void fillField() {
        Random random = new Random();
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                byte temp = (byte) random.nextInt(2);
                if (temp == 0) {
                    field[y][x] = 'o';
                }
                if (temp == 1) {
                    field[y][x] = 'x';
                }
            }
        }
    }

    public static boolean checkLine(int sy, int sx, int dx, int dy, int stepcount) {
        int x = sx;
        int y = sy;
        int sum = 0;

        for (int i = 0; i <= stepcount; i++) {
            if (field[y][x] == 'x') {
                sum++;
            }

            if (field[y][x] == 'o') {
                sum--;
            }
            x = x + dx;
            y = y + dy;
        }
        if (sum == criteria) {
            return true;
        }
        if (sum == -criteria) {
            return true;
        }
        return false;
    }

    public static void print() {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.print("|" + (char) field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public static String checkWin() {
        boolean res;
        //Строки
        for (byte i = 0; i < size; i++) {
            res = checkLine(i, 0, 1, 0, size - 1);
            if (res == true) {
                return "Первая строка";
            }
        }
        //Столбцы
        for (byte i = 0; i < size; i++) {
            res = checkLine(0, i, 0, 1, size - 1);
            if (res == true) {
                return "Первый столбец";
            }
        }

        //Диагонали
        res = checkLine(0, 0, 1, 1, size - 1);
        if (res == true) {
            return "Первая диагональ";
        }
        res = checkLine(0, 2, -1, 1, size - 1);
        if (res == true) {
            return "Вторая диагональ";
        }
        return "Не обнаружено";
    }


}
