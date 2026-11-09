package org.example;

import java.util.HashMap;
import java.util.Map;

public class TicketSystem {
    private final Map<String, Train> trains = new HashMap<>();

    public void addTrain(Train train) {
        trains.put(train.getNumber(), train);
        System.out.println("Система: Поезд №" + train.getNumber() + " добавлен в базу.");
    }

    private Train findTrain(String number) throws TrainNotFoundException {
        Train train = trains.get(number);
        if (train == null) {
            throw new TrainNotFoundException("Поезд с номером " + number + " не найден в системе.", number);
        }
        return train;
    }

    public void buyTicket(String trainNumber, int quantity)
            throws TrainNotFoundException, TicketException {
        Train train = findTrain(trainNumber);
        train.buyTicket(quantity);
    }

    public void cancelTicket(String trainNumber, int quantity)
            throws TrainNotFoundException, TicketException {
        Train train = findTrain(trainNumber);
        train.cancelTicket(quantity);
    }
}