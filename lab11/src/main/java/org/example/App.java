package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Eagle eagle = new Eagle("Орел Гоша", "Беркут", 2.2, 4500);
        Sparrow sparrow = new Sparrow("Воробей Чирик", "Домовый воробей", 0.25, false);

        System.out.println("==================================================");
        System.out.println(" 1. Демонстрация СТАТИЧЕСКОГО ПОЛИМОРФИЗМА (Перегрузка) ");
        System.out.println("==================================================");

        System.out.println("\n--- Вызов всех версий метода fly() для Орла ---");
        eagle.fly();
        eagle.fly(150);
        eagle.fly(2500.5);

        System.out.println("\n--- Собственные перегруженные методы Орла ---");
        eagle.hunt();
        eagle.hunt("заяц");

        System.out.println("\n--- Вызов всех версий метода fly() для Воробья ---");
        sparrow.fly();
        sparrow.fly(2);
        sparrow.fly(15.0);

        System.out.println("\n--- Собственные перегруженные методы Воробья ---");
        sparrow.chirp();
        sparrow.chirp(3);


        System.out.println("\n==================================================");
        System.out.println(" 2. Демонстрация ДИНАМИЧЕСКОГО ПОЛИМОРФИЗМА (Переопределение) ");
        System.out.println("==================================================");


        List<Bird> aviary = new ArrayList<>();
        aviary.add(eagle);
        aviary.add(sparrow);

        for (Bird bird : aviary) {

            System.out.println("Птица: " + bird.getName() +
                    " | Вид: " + bird.getSpecies() +
                    " | Размах крыльев: " + bird.getWingspan() + " м." +
                    "\n   -> Стиль полета: " + bird.getFlightStyle());
            System.out.println();
        }
    }
}