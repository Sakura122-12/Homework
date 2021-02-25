package Goncharova.Hw3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Yellow");
        arrayList.add("Blue");
        arrayList.add("Black");
        arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Red");
        arrayList.add("White");
        arrayList.add("Black");
        arrayList.add("Yellow");
        arrayList.add("Orange");
        arrayList.add("Purple");
        arrayList.add("Pink");
        arrayList.add("Red");

        Iterator<String> iter = arrayList.iterator();
        while (iter.hasNext()) {

            String currentValue = iter.next();

            if (hm.containsKey(currentValue) == true) {
                int n = hm.get(currentValue);
                n = n + 1;
                hm.put(currentValue, n);
            } else {
                hm.put(currentValue, 1);
            }
        }
        Iterator it = hm.entrySet().iterator();
        System.out.println("Список уникальных значений");
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
