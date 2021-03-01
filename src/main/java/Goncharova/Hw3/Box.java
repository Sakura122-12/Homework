package Goncharova.Hw3;

import java.util.ArrayList;

public class Box <T> {

    private T obj;
    private Class<T> type;

    ArrayList<T> fruitList = new ArrayList<T>();

    Box(Class<T> cls) {
        type = cls;
    }

    public float getWeight() {

        float sum = 0;

        for(int i = 0; i < fruitList.size();i++) {
            sum += ((Fruit)fruitList.get(i)).getWeight();
        }

        return sum;
    }

    public boolean compare(Box box) {
        if(this.getWeight() == box.getWeight()) {
            return true;
        }

        return false;
    }

    public void add(T fruit) {

        if(((Fruit)fruit).getClass().getName() == type.getName()) {
            fruitList.add(fruit);
        }
        else {

        }

    }

    public boolean move(Box box) {

        if(type.getName() != box.type.getName()) {
            return false;
        }

        for(int i = 0; i < fruitList.size();i++) {
            box.add((Fruit)fruitList.get(i));
        }

        fruitList.clear();

        return true;
    }

}
