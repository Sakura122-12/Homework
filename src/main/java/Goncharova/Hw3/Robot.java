package Goncharova.Hw3;

public class Robot {

    private float maxDistanse;
    private float maxHeight;
    private boolean valid;

    Robot(){
        maxDistanse = 9000.0f;
        maxHeight = 5000.f;
    }

    Robot(float maxDistanse, float maxHeight) {
        this.maxDistanse = maxDistanse;
        this.maxHeight = maxHeight;
    }

    public void run(float distanse) {
        if (distanse <= maxDistanse) {
            System.out.println("Робот пробежал " + distanse + " метров");
        } else {
            System.out.println("Робот не может пробежать " + distanse + " метров");
            valid = false;
        }
    }

    public void jump(float height) {
        if (height <= maxHeight) {
            System.out.println("Робот прыгнул " + height + " метров");
        } else {
            System.out.println("Робот не может прыгнуть " + height + " метров");
            valid = false;
        }
    }

    public boolean getValidate() {

        return valid;
    }
}
