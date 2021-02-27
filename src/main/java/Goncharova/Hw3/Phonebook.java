package Goncharova.Hw3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

public class Phonebook {
    TreeMap<String, LinkedList<String>> book = new TreeMap<>();

    public boolean add(String name, String phone) {

        if (book.containsKey(name) == true) {
            book.get(name).add(phone);
        } else {
            LinkedList<String> phoneList = new LinkedList<>();
            phoneList.add(phone);
            book.put(name, phoneList);
        }

        return false;
    }

    public void print () {
        Iterator it = book.entrySet().iterator();
        System.out.println("Записи в телефонной книге");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public LinkedList<String> get(String name) {
        if (book.containsKey(name) == true) {
            return book.get(name);
        }

        return new LinkedList<String>();
    }
}
