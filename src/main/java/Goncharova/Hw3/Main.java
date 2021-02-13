package Goncharova.Hw3;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик", false);
        Cat cat1 = new Cat("Маркиз", true);
        Dog dog = new Dog("Коржик");
        Dog dog1 = new Dog("Джек");

        cat.run(160);
        cat.swim(4);
        cat1.run(201);
        cat1.swim(5);

        dog.run(10);
        dog.swim(9);
        dog1.run(501);
        dog1.swim(11);

//        Exployer[] persArray = new Exployer[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Exployer("Дмитрий", "Программист", "dmitriy@gmail.com", "89991234567", 30000, 37); // потом для каждой ячейки массива задаем объект
//        persArray[1] = new Exployer("Алексей", "Лаборант", "alex@gmail.com", "8999345543", 2500, 30);
//        persArray[2] = new Exployer("Владислав", "Тестировщик", "vlad@gmail.com", "899934565", 3000, 42);
//        persArray[3] = new Exployer("Марк", "Инженер", "mark@gmail.com", "899934111", 2700, 28);
//        persArray[4] = new Exployer("Владимир", "Директор", "vladimir@gmail.com", "89995354", 4000, 42);
//
//        for (int i = 0; i < persArray.length; i++) {
//            if (persArray[i].getAge() > 40) {
//                persArray[i].info();
//            }
//        }

    }
}
