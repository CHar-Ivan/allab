package org.example;

public class TrainNotFoundException extends Exception {
    private final String trainNumber;

    public TrainNotFoundException(String message, String trainNumber) {
        super(message);
        this.trainNumber = trainNumber;
    }

    public String getTrainNumber() {
        return trainNumber;
    }
}