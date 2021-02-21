package Goncharova.Hw3;

public class MyArrayDataException extends NumberFormatException {
    int row, col;
    MyArrayDataException() {

    }
    MyArrayDataException(int row, int col) {
        this.row = row;
        this.col = col;

    }
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
