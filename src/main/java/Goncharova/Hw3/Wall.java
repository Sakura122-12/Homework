package Goncharova.Hw3;

public class Wall extends Obstacle{

    private float height;
    public float getHeight(){
        return height;
    }

    Wall() {
        height = 1.0f;

    }

    Wall(float height) {
        this.height = height;
    }


}
