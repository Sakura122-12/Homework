package Goncharova.Hw3;

public class Plate {
    private int food;
    Plate (int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(n <= food) {
            food -= n;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("Количество оставшейся еды " + food);
    }

}
