package Goncharova.Hw3;

public class Main {

    public static void main(String[] args) {
        String [][] array = new String[4][4];
        array[0][0] = "5"; array[0][1] = "4"; array[0][2] = "3"; array[0][3] = "2";
        array[1][0] = "f"; array[1][1] = "8"; array[1][2] = "9"; array[1][3] = "10";
        array[2][0] = "11"; array[2][1] = "12"; array[2][2] = "13"; array[2][3] = "14";
        array[3][0] = "15"; array[3][1] = "16"; array[3][2] = "17"; array[3][3] = "18";

        try {
            proccesArray(array);
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка преобразования в строке " + e.getRow() + ", в столбце " + e.getCol());

        }


    }

    public static void proccesArray(String[][] array) {
        for(int y = 0; y < 4; y++) {
            for(int x = 0; x < 4; x++) {
                try {
                    int i = Integer.parseInt (array[y][x]);
                } catch (NumberFormatException e) {
                    MyArrayDataException exp = new MyArrayDataException(y,x);
                    throw exp;

                }
            }


        }

    }
}
