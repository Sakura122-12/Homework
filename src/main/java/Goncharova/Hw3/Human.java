package Goncharova.Hw3;

public class Human implements Overcomer {

    private float maxDistanse;
    private float maxHeight;
    private boolean valid;

    Human() {
        maxDistanse = 2000.0f;
        maxHeight = 1.0f;
        valid = true;
    }

    Human(float maxDistanse, float maxHeight) {
        this.maxDistanse = maxDistanse;
        this.maxHeight = maxHeight;
        valid = true;
    }

    public void run(float distanse) {
        if (distanse <= maxDistanse) {
            System.out.println("Человек пробежал " + distanse + " метров");
        } else {
            System.out.println("Человек не может пробежать " + distanse + " метров");
            valid = false;
        }

    }

    public void jump(float height) {
        if (height <= maxHeight) {
            System.out.println("Человек прыгнул " + height + " метров");
        } else {
            System.out.println("Человек не может прыгнуть " + height + " метров");
            valid = false;
        }

    }

    public boolean getValidate() {

        return valid;
    }
}