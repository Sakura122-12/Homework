package Goncharova.Hw3;

public class Cat extends Animal {
    private static int Counter;
    private boolean saturation;

    Cat()  {
        super("Cat", false);
        this.runDistanseLimit = 200;
        this.swimDistanseLimit = 5;
        saturation = false;
        Counter++;
        System.out.println("Количество созданных котов " + Counter);

    }

    Cat(String name, boolean canSwim) {
        super(name, canSwim);
        this.runDistanseLimit = 200;
        this.swimDistanseLimit = 5;
        saturation = false;
        Counter++;
        System.out.println("Количество созданных котов " + Counter);
    }
    public void eat(Plate plate, int n) {
        saturation = plate.decreaseFood(n);
    }
    public void printSaturation() {
        if (saturation == true) {
            System.out.println("Кот сыт!");
        } else {
            System.out.println("Кот голоден!");
        }

    }

}