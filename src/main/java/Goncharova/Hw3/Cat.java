package Goncharova.Hw3;

public class Cat {

    private float maxDistanse;
    private float maxHeight;
    private boolean valid;

    Cat() {
        maxDistanse = 20.0f;
        maxHeight = 0.5f;
    }

    Cat(float maxDistanse, float maxHeight) {
        this.maxDistanse = maxDistanse;
        this.maxHeight = maxHeight;
    }

    public void run(float distanse) {
        if (distanse <= maxDistanse) {
            System.out.println("Кот пробежал " + distanse + " метров");
        } else {
            System.out.println("Кот не может пробежать " + distanse + " метров");
            valid = false;
        }
    }

    public void jump(float height) {
        if (height <= maxHeight) {
            System.out.println("Кот прыгнул " + height + " метров");
        } else {
            System.out.println("Кот не может прыгнуть " + height + " метров");
            valid = false;
        }

    }

    public boolean getValidate() {
        return valid;
    }
}