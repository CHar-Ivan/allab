package org.example;

public class App {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();

        System.out.println("==================================================");
        System.out.println(" 1. СОЗДАНИЕ ПОЕЗДОВ (Обработка InvalidTrainDataException) ");
        System.out.println("==================================================");

        // Попытка создать поезд с некорректными данными (0 вагонов)
        try {
            Train badTrain = new Train("000", "Тестовый", 0, 36, 120);
            system.addTrain(badTrain);
        } catch (InvalidTrainDataException e) {
            System.err.println("❌ Ошибка создания: " + e.getMessage());
        } finally {
            System.out.println("Блок finally: попытка создания невалидного поезда завершена.\n");
        }

        // Создаём 3 корректных поезда
        try {
            Train train1 = new Train("101", "Минск - Москва", 10, 40, 120);
            Train train2 = new Train("102", "Минск - Брест", 8, 36, 100);
            Train train3 = new Train("103", "Минск - Гомель", 6, 50, 90);

            system.addTrain(train1);
            system.addTrain(train2);
            system.addTrain(train3);
        } catch (InvalidTrainDataException e) {
            System.err.println("Ошибка создания: " + e.getMessage());
        }

        System.out.println("\n==================================================");
        System.out.println(" 2. ПРОДАЖА И ВОЗВРАТ БИЛЕТОВ (Обработка ошибок) ");
        System.out.println("==================================================");

        // 1. Покупка билетов на несуществующий поезд (TrainNotFoundException)
        try {
            system.buyTicket("999", 2);
        } catch (TrainNotFoundException | TicketException e) {
            System.err.println("❌ Исключение: " + e.getMessage());
        }

        // 2. Покупка билетов на существующий поезд (Успех)
        try {
            system.buyTicket("101", 5);
            system.buyTicket("102", 2);
        } catch (TrainNotFoundException | TicketException e) {
            System.err.println("❌ Исключение: " + e.getMessage());
        }

        // 3. Попытка купить больше билетов, чем есть (TicketException)
        try {
            system.buyTicket("103", 500); // В поезде 103 всего 6*50 = 300 мест
        } catch (TrainNotFoundException | TicketException e) {
            System.err.println("❌ Исключение: " + e.getMessage());
        }

        // 4. Попытка вернуть больше билетов, чем куплено (TicketException)
        try {
            // На поезд 102 купили только 2 билета, пытаемся вернуть 5
            system.cancelTicket("102", 5);
        } catch (TrainNotFoundException | TicketException e) {
            System.err.println("❌ Исключение: " + e.getMessage());
        }

        // 5. Успешный возврат билетов
        try {
            system.cancelTicket("101", 3);
        } catch (TrainNotFoundException | TicketException e) {
            System.err.println("❌ Исключение: " + e.getMessage());
        }

        // Вывод финального состояния
        System.out.println("\n==================================================");
        System.out.println(" ТЕКУЩЕЕ СОСТОЯНИЕ СИСТЕМЫ ");
        System.out.println("==================================================");
        try {
            System.out.println(system.getClass()); 
        } catch (Exception ignored) {}
    }
}