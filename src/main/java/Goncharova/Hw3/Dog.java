package Goncharova.Hw3;

public class Dog extends Animal {
    Dog() {

    }

    Dog(String name) {
        super(name, true);
        this.runDistanseLimit = 500;
        this.swimDistanseLimit = 10;
        Counter++;
        System.out.println("Количество созданных собак " + Counter);
    }

    private static int Counter;

}
