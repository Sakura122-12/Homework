package Goncharova.Hw3;
import java.util.concurrent.CyclicBarrier;


public class BarrierExample {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3);
        Race race = new Race();
        Car [] cars = new Car[3];

        for (int i = 0; i < 3; i++) {
//            cars[i] = new Car(race, 100, cb);
            new Thread(cars[i]).start();
        }

        for (int i = 0; i < 3; i++) {

        }
    }
}
