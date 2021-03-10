package Goncharova.Hw3;


import java.util.concurrent.*;

public class Main {
    public static final int CARS_COUNT = 4;
    public static void main(String[] args) {

        Race race = new Race(new Tunnel(CARS_COUNT));

        Car [] cars = new Car[CARS_COUNT];

        ExecutorService taskExecutor = Executors.newFixedThreadPool(4);
        for(int i = 0; i < CARS_COUNT;i++) {

            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
            taskExecutor.execute(cars[i]);
        }

        taskExecutor.shutdown();

        try {
            taskExecutor.awaitTermination(90, TimeUnit.SECONDS);
            System.out.println("Победитель гонки " + race.getWinner());
        } catch (InterruptedException e) {

        }

    }
}

