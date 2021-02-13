package Goncharova.Hw3;

public class Cat extends Animal {
    Cat() {

    }

    Cat(String name, boolean canSwim) {
        super(name, canSwim);
        this.runDistanseLimit = 200;
        this.swimDistanseLimit = 5;
        Counter++;
        System.out.println("Количество созданных котов " + Counter);
    }

    private static int Counter;

}