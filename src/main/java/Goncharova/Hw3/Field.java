package Goncharova.Hw3;

import java.util.Random;

public class Field {

    byte [][] field;
    byte size;
    byte criteria;
    Field(byte pSize, byte pCriteria) {

        size = pSize;
        criteria = pCriteria;

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
    }

    public boolean emptyCellsAvailable() {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if(field[y][x] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean Setcell(byte row, byte col, char sym) {
        if (field[row][col] != ' ') {
            return false;
        }
        field[row][col] = (byte) sym;
        return true;
    }

    public void fillField() {
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

    public boolean checkLine(int sy, int sx, int dx, int dy, int stepcount) {
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

    public void print() {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.print("|" + (char) field[y][x] + "|");
            }
            System.out.println();
        }
    }

    public String checkWin() {
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
        res = checkLine(0, size - 1, -1, 1, size - 1);
        if (res) {
            return "Вторая диагональ";
        }
        return "Не обнаружено";
    }


}
