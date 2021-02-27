package Goncharova.Hw3;

import java.sql.SQLOutput;
import java.util.*;

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

        Phonebook book = new Phonebook();
        String name, phone;
        Scanner scanner = new Scanner(System.in);
        int c = 0;
        boolean out = false;
        while (!out) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить запись в телефонную книгу");
            System.out.println("0. Выход");
            System.out.println("2. Получить номер по фамилии");
            c = scanner.nextInt();
            scanner.nextLine();
            if (c == 1) {
                System.out.println("Введите фамилию");
                name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("Вы не ввели фамилию");
                    continue;
                }
                System.out.println("Введите номер телефона");
                phone = scanner.nextLine();
                if (phone.isEmpty()) {
                    System.out.println("Вы не ввели номер телефона");
                    continue;
                }
                book.add(name, phone);
            }

            if (c == 2) {
                System.out.println("Введите фамилию");
                name = scanner.nextLine();
                if (name.isEmpty()) {
                    System.out.println("Вы не ввели фамилию");
                    continue;
                }

                LinkedList<String> temp = book.get(name);
                if (temp.isEmpty()) {
                    System.out.println("Нет записей для такой фамилии");
                } else {
                    System.out.println("Список номеров для фамилии " + name);
                    System.out.println(temp);
                }
            }

            if (c == 0) {
                out = true;
            }
        }
        book.print();
        scanner.close();
    }


}
