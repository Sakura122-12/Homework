package Goncharova.Hw3;

import java.util.Random;

public class Field {

    static byte [][] field;
    static byte size;
    static byte criteria;
    Field(byte pSize, byte pCriteria) {

        //Создание поля
        field = new byte[size][];
        for (int i = 0; i < size; i++) {
            field[i] = new byte[size];
        }

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                field[y][x] = ' ';
            }
        }

        size = pSize;
        criteria = pCriteria;
    }

    public static void main(String[] args) {

//        boolean gameover = false;


//
//

//
//            print();
//            System.out.println("--------------");
//
//            gameover = (!checkWin().equals("Не обнаружено"));
//        }
//        //print();
//        System.out.println(checkWin());
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
            if (res) {
                return "Первая строка";
            }
        }
        //Столбцы
        for (byte i = 0; i < size; i++) {
            res = checkLine(0, i, 0, 1, size - 1);
            if (res) {
                return "Первый столбец";
            }
        }

        //Диагонали
        res = checkLine(0, 0, 1, 1, size - 1);
        if (res) {
            return "Первая диагональ";
        }
        res = checkLine(0, 2, -1, 1, size - 1);
        if (res) {
            return "Вторая диагональ";
        }
        return "Не обнаружено";
    }


}
