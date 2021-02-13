package Goncharova.Hw3;
public class Animal {
    private String name;
    protected float runDistanseLimit;
    protected float swimDistanseLimit;
    private boolean canSwim;

    Animal() {

    }

    Animal(String name, boolean canSwim) {
        this.name = name;
        this.canSwim = canSwim;
    }
    public void run(float distanse) {
        if (distanse < runDistanseLimit) {
            System.out.println(name + " пробежал " + distanse + " метров");
        } else {
            System.out.println(name + " не может пробежать " + distanse + " метров");
        }

    }

    public void swim(float distanse) {
        if (canSwim == false) {
            System.out.println(name + " не умеет плавать ");
            return;
        }
        if (distanse < swimDistanseLimit) {
            System.out.println(name + " проплыл " + distanse + " метров");
        } else {
            System.out.println(name + " не может проплыть " + distanse + " метров");
        }

    }




}