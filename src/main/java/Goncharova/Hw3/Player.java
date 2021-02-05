package Goncharova.Hw3;
import java.util.Random;

public class Player {
    static char sym;
    Player(char pSym) {
        sym = pSym;
    }
    public static void turn(Field field) {
        Random random = new Random();
        boolean turnEnd;
        byte row, col;

        turnEnd = false;
        while (!turnEnd) {
            row = (byte) random.nextInt(3);
            col = (byte) random.nextInt(3);
            turnEnd = field.Setcell(row, col, sym);
        }
    }
}
