package Goncharova.Hw3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Создаем котов:");
        Cat [] cats = new Cat [5];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }

        System.out.println("Начинаем кормить котов:");

            Plate plate = new Plate (100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate, 50);
            System.out.println("Кормим кота " + (i+1));
            cats[i].printSaturation();
            plate.info();
        }

    }
}
