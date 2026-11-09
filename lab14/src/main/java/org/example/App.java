package org.example;
import java.io.*;
import java.util.*;

public class App{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Выберите пункт меню: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.\n");
                continue;
            }

            try {
                switch (choice) {
                    case 0:
                        running = false;
                        System.out.println("Выход из программы.");
                        break;
                    case 1:
                        task1();
                        break;
                    case 2:
                        task2();
                        break;
                    case 3:
                        task3();
                        break;
                    case 4:
                        task4();
                        break;
                    case 5:
                        task5();
                        break;
                    default:
                        System.out.println("Неверный пункт меню. Попробуйте снова.\n");
                }
            } catch (Exception e) {
                System.out.println("Ошибка при выполнении задания: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private static void printMenu() {
        System.out.println("========================================");
        System.out.println("Лабораторная работа №14. Вариант 24");
        System.out.println("1 – Задание 1: файл о любимом магазине");
        System.out.println("2 – Задание 2: 10 целых чисел; кратные 4 и не кратные 8");
        System.out.println("3 – Задание 3: случайные числа; файлы g и h");
        System.out.println("4 – Задание 4: 15 скоростей интернета; среднее");
        System.out.println("5 – Задание 5: 10 чисел; количество > 60");
        System.out.println("0 – Выход");
        System.out.println("========================================");
    }

    // Задание 1: файл с информацией о любимом магазине
    static void task1() throws IOException {
        System.out.println("\n=== Задание 1 ===");
        String fileName = "task1_shop.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Мой любимый магазин: Книжный мир");
            writer.println("Адрес: ул. Ленина, 10");
            writer.println("Часы работы: 9:00 - 21:00");
            writer.println("Ассортимент: книги, канцтовары, сувениры");
        }

        File file = new File(fileName);
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер файла: " + file.length() + " байт");
        System.out.println("Последнее изменение: " + new Date(file.lastModified()));
        System.out.println("Путь: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());
        System.out.println("Можно читать: " + file.canRead());
        System.out.println("Можно писать: " + file.canWrite());
        System.out.println("Это директория: " + file.isDirectory());
        System.out.println("Это файл: " + file.isFile());

        System.out.println("Содержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        System.out.println();
    }

    // Задание 2: 10 целых чисел; количество кратных 4 и не кратных 8
    static void task2() throws IOException {
        System.out.println("\n=== Задание 2 ===");
        String fileName = "task2_f.txt";

        System.out.println("Введите 10 целых чисел:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = Integer.parseInt(scanner.nextLine().trim());
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int num : numbers) {
                writer.println(num);
            }
        }

        int count = 0;
        System.out.println("Числа из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.print(num + " ");
                if (num % 4 == 0 && num % 8 != 0) {
                    count++;
                }
            }
        }
        System.out.println("\nКоличество чисел, кратных 4 и не кратных 8: " + count);
        System.out.println();
    }

    // Задание 3: случайные числа; g — кратные 9 и не кратные 2, h — остальные
    static void task3() throws IOException {
        System.out.println("\n=== Задание 3 ===");
        String fileF = "task3_f.txt";
        String fileG = "task3_g.txt";
        String fileH = "task3_h.txt";
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < 20; i++) {
                int num = random.nextInt(201) - 100;
                writer.println(num);
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileF));
             PrintWriter writerG = new PrintWriter(new FileWriter(fileG));
             PrintWriter writerH = new PrintWriter(new FileWriter(fileH))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());

                // кратные 9 и не кратные 2
                if (num % 9 == 0 && num % 2 != 0) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
        }

        System.out.println("Содержимое файла g (кратные 9 и не кратные 2):");
        printFile(fileG);

        System.out.println("Содержимое файла h (остальные):");
        printFile(fileH);

        System.out.println();
    }

    static void printFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line + " ");
            }
            System.out.println();
        }
    }

    // Задание 4: 15 значений скорости интернета; средняя скорость
    static void task4() throws IOException {
        System.out.println("\n=== Задание 4 ===");
        String fileName = "task4_speed.txt";

        System.out.println("Введите 15 вещественных значений скорости интернета:");
        double[] speeds = new double[15];
        for (int i = 0; i < 15; i++) {
            System.out.print("Скорость " + (i + 1) + ": ");
            speeds[i] = Double.parseDouble(scanner.nextLine().trim());
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (double speed : speeds) {
                writer.println(speed);
            }
        }

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double speed = Double.parseDouble(line.trim());
                sum += speed;
                count++;
            }
        }

        double average = sum / count;
        System.out.printf("Средняя скорость интернета: %.2f%n", average);
        System.out.println();
    }

    // Задание 5: 10 целых чисел; количество чисел > 60
    static void task5() throws IOException {
        System.out.println("\n=== Задание 5 ===");
        String fileName = "task5_f.txt";
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(101);
                writer.println(num);
            }
        }

        int count = 0;
        System.out.println("Числа из файла:");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.print(num + " ");
                if (num > 60) {
                    count++;
                }
            }
        }

        System.out.println("\nКоличество чисел, больших 60: " + count);
        System.out.println();
    }
}