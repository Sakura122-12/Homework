package Goncharova.Hw3;

import java.util.*;

public class Main {

    public static <T> void change(ArrayList<T> list, int p1, int p2) {
        T temp = list.get(p2);
        list.set(p2, list.get(p1));
        list.set(p1, temp);
    }

    public static ArrayList<Object> convertToList(Object [] array) {
        ArrayList<Object> list = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("AA", "BB", "CC", "DD", "EE"));
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        change(intList, 1, 2);
        change(strList, 1, 2);

        String[] array = {"A", "B", "C", "D", "E"};

        ArrayList<Object> temp = convertToList(array);
        temp.clear();

        Box<Apple> appleBox = new Box<>(Apple.class);

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Box<Orange> orangeBox = new Box<>(Orange.class);
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        boolean res = appleBox.compare(orangeBox);

        appleBox.move(orangeBox);
    }






}
