package org.example;
public class BoardGame implements Playable, Saveable {

    private final String name;
    private final int players;
    private boolean saved;

    public BoardGame(String name, int players) {
        this.name = name;
        this.players = players;
        this.saved = false;
    }

    @Override
    public void play() {
        System.out.println("Настольная игра \"" + name + "\" начата. Игроков: " + players + ".");
    }

    @Override
    public void pause() {
        System.out.println("Настольная игра \"" + name + "\" приостановлена.");
    }

    @Override
    public void stop() {
        System.out.println("Настольная игра \"" + name + "\" остановлена.");
    }

    @Override
    public void save() {
        saved = true;
        System.out.println("Сохранение настольной игры \"" + name + "\" выполнено.");
    }

    @Override
    public void load() {
        if (saved) {
            System.out.println("Загрузка сохранения настольной игры \"" + name + "\" выполнена.");
        } else {
            System.out.println("Нет сохранения для настольной игры \"" + name + "\".");
        }
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public boolean isSaved() {
        return saved;
    }
}