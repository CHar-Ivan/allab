package org.example;

import java.util.ArrayList;
import java.util.List;

public class App { // Имя класса должно совпадать с именем файла App.java

    public static void main(String[] args) {
        System.out.println(Playable.description());
        System.out.println();
        BoardGame board1 = new BoardGame("Монополия", 4);
        BoardGame board2 = new BoardGame("Каркассон", 5);
        BoardGame board3 = new BoardGame("Шахматы", 2);
        VideoGame video1 = new VideoGame("Minecraft", "PC");
        VideoGame video2 = new VideoGame("The Legend of Zelda", "Nintendo Switch");
        List<Playable> playables = new ArrayList<>();
        playables.add(board1);
        playables.add(board2);
        playables.add(board3);
        playables.add(video1);
        playables.add(video2);
        System.out.println("--- Демонстрация игрового процесса ---");
        for (Playable game : playables) {
            game.play();
            game.pause();
            game.stop();
            System.out.println();
        }

        List<Saveable> saveables = new ArrayList<>();
        saveables.add(board1);
        saveables.add(board2);
        saveables.add(board3);
        saveables.add(video1);
        saveables.add(video2);

        System.out.println("--- Сохранение игр ---");
        for (Saveable game : saveables) {
            game.save();
        }

        System.out.println();
        System.out.println("--- Загрузка игр ---");
        for (Saveable game : saveables) {
            game.load();
        }
    }
}