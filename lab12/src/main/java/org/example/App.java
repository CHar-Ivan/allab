package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        System.out.println("========== ЗАДАНИЕ 1: МЕБЕЛЬ (MAP) ==========");


        Map<String, Furniture> furnitureMap = new LinkedHashMap<>();


        furnitureMap.put("Обeденный стол", new Table("Обеденный стол", 101, "Дерево", 4));
        furnitureMap.put("Журнальный стол", new Table("Журнальный стол", 102, "Стекло", 3));
        furnitureMap.put("Компьютерный стол", new Table("Компьютерный стол", 103, "ЛДСП", 4));


        furnitureMap.put("Офисный стул", new Chair("Офисный стул", 201, "Металл/Ткань", "Высокая"));
        furnitureMap.put("Барный стул", new Chair("Барный стул", 202, "Кожа", "Средняя"));
        furnitureMap.put("Кухонный стул", new Chair("Кухонный стул", 203, "Дерево", "Фигурная"));


        furnitureMap.put("Платяной шкаф", new Wardrobe("Платяной шкаф", 301, "Дерево", 2));
        furnitureMap.put("Книжный шкаф", new Wardrobe("Книжный шкаф", 302, "ЛДСП", 4));


        for (Map.Entry<String, Furniture> entry : furnitureMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " \n   Значение: " + entry.getValue());
        }


        System.out.println("\n========== ЗАДАНИЕ 2: ТАНЦОРЫ (LIST) ==========");

        List<Dancer> dancers = new ArrayList<>();
        dancers.add(new Dancer(1, "Анна", "Балет", 1, Arrays.asList(5, 4, 5, 4))); // avg 4.5
        dancers.add(new Dancer(2, "Борис", "Хип-хоп", 2, Arrays.asList(2, 1, 3, 2))); // avg 2.0 (удалить)
        dancers.add(new Dancer(3, "Виктор", "Бальные", 1, Arrays.asList(3, 4, 3, 4))); // avg 3.5
        dancers.add(new Dancer(4, "Галина", "Танго", 2, Arrays.asList(5, 5, 5, 4))); // avg 4.75
        dancers.add(new Dancer(5, "Дмитрий", "Брейк-данс", 1, Arrays.asList(4, 3, 2, 1))); // avg 2.5 (удалить)

        System.out.println("--- Исходный список ---");
        dancers.forEach(System.out::println);


        dancers.removeIf(d -> d.getAverageScore() < 3);
        System.out.println("\n--- После удаления (ср. балл < 3) ---");
        dancers.forEach(System.out::println);


        for (Dancer d : dancers) {
            if (d.getAverageScore() >= 4) {
                d.setLevel(d.getLevel() + 1);
            }
        }
        System.out.println("\n--- После повышения уровня (ср. балл >= 4) ---");
        dancers.forEach(System.out::println);


        int targetLevel = 2;
        System.out.println("\n--- Танцоры на уровне " + targetLevel + " ---");
        printDancers(dancers, targetLevel);


        dancers.sort(Comparator
                .comparingDouble(Dancer::getAverageScore).reversed()
                .thenComparing(Dancer::getName)
        );

        System.out.println("\n--- Итоговый отсортированный список (ID, Имя, Ср. балл) ---");
        for (Dancer d : dancers) {
            System.out.printf("ID: %d | Имя: %-10s | Ср. балл: %.2f\n", d.getId(), d.getName(), d.getAverageScore());
        }
    }


    public static void printDancers(List<Dancer> dancers, int level) {
        boolean found = false;
        for (Dancer d : dancers) {
            if (d.getLevel() == level) {
                System.out.println(d);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Танцоров с таким уровнем нет.");
        }
    }
}