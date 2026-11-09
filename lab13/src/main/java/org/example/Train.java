package org.example;


public class Train {
    private final String number;
    private final String route;
    private final int cars;
    private final int seatsPerCar;
    private final double speed;
    private int availableSeats;

    public Train(String number, String route, int cars, int seatsPerCar, double speed)
            throws InvalidTrainDataException {

        // Проверка данных в конструкторе
        if (cars <= 0) {
            throw new InvalidTrainDataException("Количество вагонов должно быть больше 0.");
        }
        if (seatsPerCar <= 0) {
            throw new InvalidTrainDataException("Количество мест в вагоне должно быть больше 0.");
        }
        if (speed <= 0) {
            throw new InvalidTrainDataException("Скорость должна быть больше 0.");
        }

        this.number = number;
        this.route = route;
        this.cars = cars;
        this.seatsPerCar = seatsPerCar;
        this.speed = speed;
        this.availableSeats = cars * seatsPerCar;
    }

    public void buyTicket(int quantity) throws TicketException {
        if (quantity <= 0) {
            throw new TicketException("Количество покупаемых билетов должно быть больше нуля.");
        }
        if (quantity > availableSeats) {
            throw new TicketException("Недостаточно свободных мест. Запрошено: " + quantity + ", доступно: " + availableSeats);
        }
        availableSeats -= quantity;
        System.out.println("✅ Успешно куплено " + quantity + " билет(ов) на поезд " + number + " (" + route + ").");
    }

    public void cancelTicket(int quantity) throws TicketException {
        int totalSeats = cars * seatsPerCar;
        if (quantity <= 0) {
            throw new TicketException("Количество возвращаемых билетов должно быть больше нуля.");
        }
        if (availableSeats + quantity > totalSeats) {
            throw new TicketException("Нельзя вернуть больше билетов, чем было куплено.");
        }
        availableSeats += quantity;
        System.out.println("✅ Успешно возвращено " + quantity + " билет(ов) на поезд " + number + ".");
    }

    // Геттеры
    public String getNumber() { return number; }
    public String getRoute() { return route; }
    public int getAvailableSeats() { return availableSeats; }

    @Override
    public String toString() {
        return String.format("Поезд №%s | Маршрут: %s | Вагонов: %d | Свободных мест: %d",
                number, route, cars, availableSeats);
    }
}