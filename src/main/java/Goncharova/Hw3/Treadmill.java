package Goncharova.Hw3;

public class Treadmill extends Obstacle {
    private float distanse;
    public float getdDstanse(){
        return distanse;
    }

    Treadmill() {
        distanse = 1.0f;

    }

    Treadmill(float distanse) {
        this.distanse = distanse;
    }


}
