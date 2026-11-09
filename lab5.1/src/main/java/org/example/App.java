package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println("1 - Смартфон");
        System.out.println("2 - Парк");
        System.out.println("3 - Заказ");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                taskSmartphone();
                break;
            case 2:
                taskPark();
                break;
            case 3:
                taskOrder();
                break;
            default:
                System.out.println("Неверный выбор");
        }

        scanner.close();
    }

    private static void taskSmartphone() {
        Smartphone phone = new Smartphone("Samsung", 6.5, 15);
        System.out.println("Смартфон: " + phone);
        System.out.println("Хорошая батарея (> 10 ч)? " + phone.isGoodBattery());

        Smartphone weakPhone = new Smartphone("Nokia", 5.0, 8);
        System.out.println("Смартфон: " + weakPhone);
        System.out.println("Хорошая батарея (> 10 ч)? " + weakPhone.isGoodBattery());
    }

    private static void taskPark() {
        Park[] parks = new Park[] {
                new Park("Центральный", 12.5, 340),
                new Park("Сосновый бор", 45.0, 1200),
                new Park("Липки", 8.3, 210),
                new Park("Дубовая роща", 30.2, 1500),
                new Park("Берёзовая аллея", 5.7, 95),
                new Park("Приморский", 60.8, 870)
        };

        Park maxTreesPark = parks[0];
        for (Park p : parks) {
            if (p.getTrees() > maxTreesPark.getTrees()) {
                maxTreesPark = p;
            }
        }

        Park maxAreaPark = parks[0];
        for (Park p : parks) {
            if (p.getArea() > maxAreaPark.getArea()) {
                maxAreaPark = p;
            }
        }

        System.out.println("Парк с максимальным количеством деревьев: " + maxTreesPark);
        System.out.println("Парк с максимальной площадью: " + maxAreaPark);
    }

    private static void taskOrder() {
        Order[] orders = new Order[] {
                new Order(101, OrderStatus.PENDING),
                new Order(102, OrderStatus.SHIPPED),
                new Order(103, OrderStatus.DELIVERED),
                new Order(104, OrderStatus.SHIPPED),
                new Order(105, OrderStatus.RETURNED)
        };

        System.out.println("Заказы со статусом SHIPPED:");
        for (Order o : orders) {
            if (o.getStatus() == OrderStatus.SHIPPED) {
                System.out.println(o);
            }
        }
    }
}