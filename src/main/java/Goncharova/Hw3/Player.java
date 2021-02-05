package Goncharova.Hw3;
import java.util.Random;
import java.util.Scanner;

public class Player {
    char sym;
    boolean isComputer;
    Scanner scanner = new Scanner(System.in);

    Player(char pSym, boolean computer) {
        sym = pSym;
        isComputer = computer;
    }
    public void turn(Field field) {
        Random random = new Random();

        boolean turnEnd;
        byte row, col;

        if(isComputer) {
            turnEnd = false;
            while (!turnEnd) {
                row = (byte) random.nextInt(field.size);
                col = (byte) random.nextInt(field.size);
                turnEnd = field.Setcell(row, col, sym);
            }
        }
        else {
            turnEnd = false;
            while (!turnEnd) {
                row = (byte)scanner.nextInt();
                col = (byte)scanner.nextInt();
                turnEnd = field.Setcell(row, col, sym);

                if(!turnEnd) {
                    System.out.println("Ячейка занята");
                }
            }

//            scanner.close();
        }
    }
}
