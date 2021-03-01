package Goncharova.Hw3;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static <T> void change(ArrayList<T> list, int p1, int p2) {
        T temp = list.get(p2);
        list.set(p2, list.get(p1));
        list.set(p1, temp);
    }


    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("AA", "BB", "CC", "DD", "EE"));
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        change(intList, 1, 2);
        change(strList, 1, 2);
    }




}
