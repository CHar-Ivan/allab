package org.example;
public interface Playable {

    void play();

    void pause();

    void stop();


    static String description() {
        return "Интерфейс Playable: управление игровым процессом";
    }
}