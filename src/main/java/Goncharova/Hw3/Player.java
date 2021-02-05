package Goncharova.Hw3;
import java.util.Random;
import java.util.Scanner;

public class Player {
    static char sym;
    static boolean isComputer;
    Player(char pSym) {
        sym = pSym;
    }
    public static void turn(Field field) {
        Random random = new Random();

        boolean turnEnd;
        byte row, col;

        if(isComputer) {
            turnEnd = false;
            while (!turnEnd) {
                row = (byte) random.nextInt(3);
                col = (byte) random.nextInt(3);
                turnEnd = field.Setcell(row, col, sym);
            }
        }
        else {
            Scanner scanner = new Scanner(System.in);

            turnEnd = false;
            while (!turnEnd) {
                row = scanner.nextByte();
                col = scanner.nextByte();
                turnEnd = field.Setcell(row, col, sym);
            }

            scanner.close();
        }

    }
}
